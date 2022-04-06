package com.crop.service;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.crop.entity.CropDetails;

public interface CropService {
	public CropDetails addCrops(CropDetails cropDetails);
	public List<CropDetails> getAllCrops();
	public Optional<CropDetails> getCrop(int id);
	public CropDetails upCrop( CropDetails cropDetails);
	public Optional<CropDetails> deleteCropid( int id);
	public List<CropDetails> getCropByFarmer(String dealername);
}

