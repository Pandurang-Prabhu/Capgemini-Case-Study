package com.dealer.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.dealer.entity.Dealer;


public interface DealerRepo extends MongoRepository<Dealer, String>{
Dealer findByDealerName(String dealerName);
}
