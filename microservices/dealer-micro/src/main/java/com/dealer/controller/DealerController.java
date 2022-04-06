package com.dealer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.dealer.entity.Dealer;
import com.dealer.repo.DealerRepo;
import com.dealer.service.DealerService;



@RestController
@RequestMapping("/dealer")
@CrossOrigin("http://localhost:3000")
public class DealerController {

	
	@Autowired
	private DealerService dealerService;
	
	@PostMapping("/add")
	public Dealer getFarmer(@RequestBody Dealer dealer) {
		dealerService.addDealer(dealer);
		return dealer;
		}
	
	@GetMapping("/dealer")
	public List<Dealer> getdealers(){
		return dealerService.getAllDealer();
	}
	
	@PutMapping("/update")
	public String updealer(@RequestBody Dealer dealer) {
		dealerService.upDealer(dealer);
		return "updated";
		}
	

	
}
	
	
	
