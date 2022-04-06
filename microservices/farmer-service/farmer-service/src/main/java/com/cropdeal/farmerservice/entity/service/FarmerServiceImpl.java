package com.cropdeal.farmerservice.entity.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cropdeal.farmerservice.entity.Farmer;
import com.cropdeal.farmerservice.entity.repo.FarmerRepo;
@Service
public class FarmerServiceImpl implements FarmerService {
	
	@Autowired
	private FarmerRepo farmerRepo;
	
	

	@Override
	public Farmer addFarmer(Farmer farmer) {
		
		return this.farmerRepo.save(farmer);
	}

	@Override
	public List<Farmer> getAllFarmers() {
		return this.farmerRepo.findAll();
	}

	@Override
	public Farmer upFarmer(Farmer farmer) {
		
		return this.farmerRepo.save(farmer);
	}

	@Override
	public Optional<Farmer> deleteFarmerById(int id) {
		Optional<Farmer> deletedfarmer =this.farmerRepo.findById(id);
		this.farmerRepo.deleteById(id);
		return deletedfarmer;
	}
	
	
	
	
	
	

	
	
	

	
	
	
	
	

}
