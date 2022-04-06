package com.dealer.service;
import java.util.List;
import java.util.Optional;

import com.dealer.entity.Dealer;
public interface DealerService {
	
	public Dealer addDealer(Dealer dealer);
	public List<Dealer> getAllDealer();
	public Dealer upDealer(Dealer dealer);
	public Optional<Dealer> deleteDealerById(String dealerName);

}
