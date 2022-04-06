package com.cart.Repo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.cart.model.CartDetails;

public interface CartRepo extends MongoRepository<CartDetails, Integer>{
	List<CartDetails> findByDealername(String dealername);

}
