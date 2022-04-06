package com.dealer;

import com.dealer.entity.Dealer;
import com.dealer.repo.DealerRepo;
import com.dealer.service.DealerService;
import org.apache.tomcat.jni.Address;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@SpringBootTest
class DealerMicroApplicationTests {
//
//	@Autowired
//	private DealerRepo dealerRepo;
//
//	@Autowired
//	private DealerService dealerService;
//
//
//	@Test
//	public void getAllcartdetails() {
//		when(dealerRepo.findAll()).thenReturn(Stream.of(new Dealer("pandu","pandu@gmail.com"),new Dealer("karthik","karth@gmail.com","orange","dw",).collect(Collectors.toList()));
//		assertEquals(2, cartService.getAllCartDetails().size());
//	}
//
//	@Test
//	public void addToCart() { CartDetails cartDetails = new CartDetails(50,"pandu","fue",234234,234243);
//		when(cartRepo.save(cartDetails)).thenReturn(cartDetails);
//		assertEquals(cartDetails, cartService.addCart(cartDetails));
//	}
//
//	@Test
//	public void getByDealerName() {
//		String dealername = "pandu";
//		when(cartRepo.findByDealername(dealername))
//				.thenReturn(Stream.of(new CartDetails(1,"pandu","apple",2,10)).collect(Collectors.toList()));
//		assertEquals(1, cartService.getcartDetails(dealername).size());
//	}

}
