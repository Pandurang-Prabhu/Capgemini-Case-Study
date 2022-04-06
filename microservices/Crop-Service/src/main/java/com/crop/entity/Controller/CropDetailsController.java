package com.crop.entity.Controller;

import java.util.List;
import java.util.Optional;

import com.crop.service.CropServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crop.repo.CropDetailsRepo;
import com.crop.service.CropService;
import com.crop.entity.CropDetails;

@RestController
@RequestMapping("/crop")
@CrossOrigin(origins = "*")
public class CropDetailsController {
	
	@Autowired
	private CropService cropService;

	
	@Autowired
	public CropDetailsRepo cropDetailsRepo;
	
	@PostMapping("/add")

	public CropDetails getFarmer(@RequestBody CropDetails cropDetails) {
		return this.cropService.addCrops(cropDetails);
		}

	@GetMapping("/crops")

	public ResponseEntity<?> getFarmers(){
		return ResponseEntity.ok(this.cropService.getAllCrops());
	}

	@GetMapping("/{id}")

	public Optional<CropDetails> getFarmers(@PathVariable int id){
		 return this.cropService.getCrop(id);
	}
	
	@PutMapping("/update")

	public CropDetails upCrop(@RequestBody CropDetails cropDetails) {

		return this.cropService.upCrop(cropDetails);
		}
	
	
	@DeleteMapping("/{id}")
	@CrossOrigin(origins = "http://localhost:3000")
	public String deleteEmployee(@PathVariable int id) {
		cropService.deleteCropid(id);
		return "deleted";
	}
	
	
	@GetMapping("/farmer/{farmerName}")
	public List<CropDetails> getByFarmername(@PathVariable String farmerName){
		List<CropDetails> cropDetails = this.cropService.getCropByFarmer(farmerName);
		return cropDetails;
	}
	
	
	
	
	

}
