package com.cart.controller;

import java.util.List;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cart.model.CartDetails;
import com.cart.service.CartService;


@Slf4j
@RestController
@RequestMapping("/cart")
@CrossOrigin(origins = "http://localhost:3000")
public class CartController {
	final Logger logger=LoggerFactory.getLogger(CartController.class);
	@Autowired
	private CartService cartService;
	

	@PostMapping("/add")
	@CrossOrigin(origins = "http://localhost:3000")
	public String addCart(@RequestBody CartDetails cartDetails) {
		this.cartService.addCart(cartDetails);
		logger.info("save crop");
	return "Item added  to cart";
		}
	
	@GetMapping("/get")

	public List<CartDetails> getAllCartDetails(){
		logger.info("get all crop");
		return cartService.getAllCartDetails();
	}
	

	@GetMapping("/get/{dealername}")
	public List<CartDetails> getcarDetails(@PathVariable String dealername){
		logger.info("get crop by dealer name");
		return this.cartService.getcartDetails(dealername);
	
	}
	
	
	
	@DeleteMapping("/{id}")
	public String deleteCart(@PathVariable int id) {
		this.cartService.deleteCart(id);
		logger.info("delete crop");
		return "deleted";
	}

}
