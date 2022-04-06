package com.cart.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cart.Repo.CartRepo;
import com.cart.model.CartDetails;

@Service
public class CartServiceImpl implements CartService {
	
	@Autowired
	private CartRepo cartRepo;

	@Override
	public CartDetails addCart(CartDetails cartDetails) {
		return this.cartRepo.save(cartDetails);
	}

	@Override
	public List<CartDetails> getAllCartDetails() {
		return this.cartRepo.findAll();
	}

	@Override
	public Optional<CartDetails> deleteCart(int id) {
		Optional<CartDetails> cartDetails = this.cartRepo.findById(id);
		this.cartRepo.deleteById(id);
		return cartDetails;
	}

	@Override
	public List<CartDetails> getcartDetails(String dealername) {
	
		return this.cartRepo.findByDealername(dealername);
	}

}	
