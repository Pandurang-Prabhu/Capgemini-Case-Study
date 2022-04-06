package com.cropdeal.farmerservice.entity.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.cropdeal.farmerservice.entity.Farmer;

public interface FarmerRepo extends MongoRepository<Farmer, Integer>{
//	Farmer findByFarmerName(String farmerName);;
                                     
}
