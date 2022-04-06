package com.cart;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.cart.Repo.CartRepo;
import com.cart.model.CartDetails;
import com.cart.service.CartService;

@SpringBootTest
class CartServiceApplicationTests {
	
	@MockBean
	private CartRepo cartRepo;
	
	@Autowired
	private CartService cartService;
	

	@Test
	public void getAllcartdetails() {
		when(cartRepo.findAll()).thenReturn(Stream.of(new CartDetails(1,"pandu","apple",2,10),new CartDetails(2,"karthik","orange",6,45)).collect(Collectors.toList()));
		assertEquals(2, cartService.getAllCartDetails().size());
		}
	
	@Test
	public void addToCart() {
		CartDetails cartDetails = new CartDetails(50,"pandu","fue",234234,234243);
		when(cartRepo.save(cartDetails)).thenReturn(cartDetails);
		assertEquals(cartDetails, cartService.addCart(cartDetails));
		}
	
	@Test
	public void getByDealerName() {
		String dealername = "pandu";
		when(cartRepo.findByDealername(dealername))
		.thenReturn(Stream.of(new CartDetails(1,"pandu","apple",2,10)).collect(Collectors.toList()));
		assertEquals(1, cartService.getcartDetails(dealername).size());
	}



	@Test
	public void delete() {
		Integer id = 23;
		cartService.deleteCart(id);
		verify(cartRepo,times(1)).deleteById(id);
	}
	
	 

}
