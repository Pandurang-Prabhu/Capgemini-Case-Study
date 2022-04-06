package com.dealer.entity;

import org.springframework.data.annotation.Id;

public class DealerAddress {
	@Id
	private int dealerHouseNo;
	private String dealerCity;
	private String dealerDistrict;
	private String dealerState;
	private int dealerZipcode;
	public int getDealerHouseNo() {
		return dealerHouseNo;
	}
	public void setDealerHouseNo(int dealerHouseNo) {
		this.dealerHouseNo = dealerHouseNo;
	}
	public String getDealerCity() {
		return dealerCity;
	}
	public void setDealerCity(String dealerCity) {
		this.dealerCity = dealerCity;
	}
	public String getDealerDistrict() {
		return dealerDistrict;
	}
	public void setDealerDistrict(String dealerDistrict) {
		this.dealerDistrict = dealerDistrict;
	}
	public String getDealerState() {
		return dealerState;
	}
	public void setDealerState(String dealerState) {
		this.dealerState = dealerState;
	}
	public int getDealerZipcode() {
		return dealerZipcode;
	}
	public void setDealerZipcode(int dealerZipcode) {
		this.dealerZipcode = dealerZipcode;
	}
	public DealerAddress() {
		super();
		// TODO Auto-generated constructor stub
	}
	public DealerAddress(int dealerHouseNo, String dealerCity, String dealerDistrict, String dealerState,
			int dealerZipcode) {
		super();
		this.dealerHouseNo = dealerHouseNo;
		this.dealerCity = dealerCity;
		this.dealerDistrict = dealerDistrict;
		this.dealerState = dealerState;
		this.dealerZipcode = dealerZipcode;
	}
	
	

}
