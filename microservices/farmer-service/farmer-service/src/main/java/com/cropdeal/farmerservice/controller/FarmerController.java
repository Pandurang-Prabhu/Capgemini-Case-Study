package com.cropdeal.farmerservice.controller;

import java.util.List;

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

import com.cropdeal.farmerservice.entity.Farmer;
import com.cropdeal.farmerservice.entity.repo.FarmerRepo;
import com.cropdeal.farmerservice.entity.service.FarmerService;

@RestController
@RequestMapping("/farmer")
@CrossOrigin(origins = "http://localhost:3000")
public class FarmerController {
	
	@Autowired
	private FarmerService farmerService;
	
	
	@PostMapping("/add")
	public Farmer setFarmer(@RequestBody Farmer farmer) {
		
	return this.farmerService.addFarmer(farmer);
		}
	

	@GetMapping("/get")
	public List<Farmer> getFarmers(){
		return farmerService.getAllFarmers();
	}
	
	
	@PutMapping("/update")
	public String upEmployee(@RequestBody Farmer farmer) {
		farmerService.upFarmer(farmer);
		return "updated";
		
	}
	
	@DeleteMapping("/{id}")
	@CrossOrigin(origins = "http://localhost:3000")
	public String deletefarmer(@PathVariable int id) {
		farmerService.deleteFarmerById(id);
		return "deleted";
	}

}
