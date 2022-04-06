package com.dealer.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dealer.entity.Dealer;
import com.dealer.repo.DealerRepo;

@Service
public class DealerServiceImpl implements DealerService{
	
	@Autowired
	private DealerRepo dealerRepo;

	@Override
	public Dealer addDealer(Dealer dealer) {
		
		return this.dealerRepo.save(dealer);
	}

	@Override
	public List<Dealer> getAllDealer() {

		return this.dealerRepo.findAll();
	}

	@Override
	public Dealer upDealer(Dealer dealer) {
		
		return this.dealerRepo.save(dealer);
	}

	@Override
	public Optional<Dealer> deleteDealerById(String dealerName) {
		Optional<Dealer> deleteDealer = Optional.ofNullable(this.dealerRepo.findByDealerName(dealerName));
		this.dealerRepo.deleteById(dealerName);
		return deleteDealer;
	}
	
	
	
	
	
	

}
