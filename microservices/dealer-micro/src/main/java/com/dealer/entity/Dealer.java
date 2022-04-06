package com.dealer.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "dealer_details")
public class Dealer {
	@Id
	private String dealerName;
	private String dealerEmail;
	private String dealerPassword;
	private DealerAddress dealerAddress;
	private DealerBankDetails dealerBankDetails;

	public String getDealerName() {
		return dealerName;
	}
	public void setDealerName(String dealerName) {
		this.dealerName = dealerName;
	}
	public String getDealerEmail() {
		return dealerEmail;
	}
	public void setDealerEmail(String dealerEmail) {
		this.dealerEmail = dealerEmail;
	}
	public String getDealerPassword() {
		return dealerPassword;
	}
	public void setDealerPassword(String dealerPassword) {
		this.dealerPassword = dealerPassword;
	}
	public DealerAddress getDealerAddress() {
		return dealerAddress;
	}
	public void setDealerAddress(DealerAddress dealerAddress) {
		this.dealerAddress = dealerAddress;
	}
	public DealerBankDetails getDealerBankDetails() {
		return dealerBankDetails;
	}
	public void setDealerBankDetails(DealerBankDetails dealerBankDetails) {
		this.dealerBankDetails = dealerBankDetails;
	}
	public Dealer( String dealerName, String dealerEmail, String dealerPassword, DealerAddress dealerAddress,
			DealerBankDetails dealerBankDetails) {
		super();
		
		this.dealerName = dealerName;
		this.dealerEmail = dealerEmail;
		this.dealerPassword = dealerPassword;
		this.dealerAddress = dealerAddress;
		this.dealerBankDetails = dealerBankDetails;
	}
	public Dealer() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}