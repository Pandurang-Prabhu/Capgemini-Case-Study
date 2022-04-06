package com.crop.repo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.crop.entity.CropDetails;

public interface CropDetailsRepo extends MongoRepository<CropDetails, Integer> {
	List<CropDetails> findByfarmerName(String farmerName);
}
