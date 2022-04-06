package com.cart.service;

import java.util.List;

import com.cart.model.CartDetails;
import java.util.Optional;



public interface CartService {
	
	public CartDetails addCart(CartDetails cartDetails);
	public List<CartDetails> getAllCartDetails();

	public Optional<CartDetails> deleteCart(int id);
	public List<CartDetails> getcartDetails(String dealername);

}
