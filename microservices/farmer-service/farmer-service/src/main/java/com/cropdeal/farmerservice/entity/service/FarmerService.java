package com.cropdeal.farmerservice.entity.service;

import java.util.List;



import com.cropdeal.farmerservice.entity.Farmer;
import java.util.Optional;

public interface FarmerService {
	
	public Farmer addFarmer(Farmer farmer);
	public List<Farmer> getAllFarmers();
	public Farmer upFarmer(Farmer farmer);
	public Optional<Farmer> deleteFarmerById( int id);

}
