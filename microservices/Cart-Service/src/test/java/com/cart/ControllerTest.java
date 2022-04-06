package com.cart;

import com.cart.Repo.CartRepo;
import com.cart.controller.CartController;
import com.cart.model.CartDetails;
import com.cart.service.CartService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.engine.execution.InvocationInterceptorChain.VoidInterceptorCall;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.intThat;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.IntBinaryOperator;

@SpringBootTest(classes = {ControllerTest.class})
public class ControllerTest {

	@Mock
	CartService cartService;

	@InjectMocks
	CartController cartController;

	List<CartDetails> cartDetails;

	CartDetails cDetails;



	@Test
	public void getAllCartDetails() {
		cartDetails = new ArrayList<CartDetails>();
		cartDetails.add(new CartDetails(2,"karthik","orange",6,45));
		cartDetails.add(new CartDetails(1,"pandu","apple",2,10));

		when(cartService.getAllCartDetails()).thenReturn(cartDetails);
		assertEquals(2,cartController.getAllCartDetails().size());
	}


	@Test
	public void getcarDetails() {

		cartDetails = new ArrayList<CartDetails>();
		cartDetails.add(new CartDetails(1,"pandu","apple",2,10));
		String dealername = "pandu";
		when(cartService.getcartDetails(dealername)).thenReturn(cartDetails);
		assertEquals(1,cartController.getcarDetails(dealername).size());


	}

	@Test
	public void deleteCartDetails() {
		Optional<CartDetails> cartDetails = Optional.ofNullable(new CartDetails(1,"pandu","apple",2,10));
		int id =1;
		when(cartService.deleteCart(id)).thenReturn(cartDetails);
		assertEquals("deleted",cartController.deleteCart(id));
	}

	@Test
	public void addToCart() {
		CartDetails cartDetails = new CartDetails(50,"pandu","fue",234234,234243);
		when(cartService.addCart(cartDetails)).thenReturn(cartDetails);
		assertEquals("Item added  to cart", cartController.addCart(cartDetails));
	}



}
