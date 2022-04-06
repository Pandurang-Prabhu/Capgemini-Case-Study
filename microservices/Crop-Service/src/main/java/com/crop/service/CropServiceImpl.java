package com.crop.service;

import java.util.List;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.crop.entity.CropDetails;
import com.crop.repo.CropDetailsRepo;

@Service
public class CropServiceImpl implements CropService{
	
	@Autowired
	private CropDetailsRepo cropDetailsRepo;

	@Override
	public CropDetails addCrops(CropDetails cropDetails) {
		return this.cropDetailsRepo.save(cropDetails);
	}

	@Override
	public List<CropDetails> getAllCrops() {
		return this.cropDetailsRepo.findAll();
	}

	@Override
	public Optional<CropDetails> getCrop(int id) {
		
		return this.cropDetailsRepo.findById(id);
	}

	@Override
	public CropDetails upCrop(CropDetails cropDetails) {

		return this.cropDetailsRepo.save(cropDetails);
	}

	@Override
	public Optional<CropDetails> deleteCropid(int id) {
		Optional<CropDetails> deletedCropDetails =this.cropDetailsRepo.findById(id);
		this.cropDetailsRepo.deleteById(id);
		return deletedCropDetails;
	}

	@Override
	public List<CropDetails> getCropByFarmer(String dealername) {
		return this.cropDetailsRepo.findByfarmerName(dealername);
	}
	
	
	
	
	


	
	
	



	}
	
	
	
	
	

	



	
	
	
	
	

	
	

