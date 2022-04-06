package com.cropdeal.farmerservice.entity;

import org.springframework.data.annotation.Id;


public class FarmerBankDetails {
	@Id
	private String accountNumber;
	private String accountFullName;
	private String accountIFSC;
	private String bankName;
	private String phoneNumber;
	private String upi;
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getAccountFullName() {
		return accountFullName;
	}
	public void setAccountFullName(String accountFullName) {
		this.accountFullName = accountFullName;
	}
	public String getAccountIFSC() {
		return accountIFSC;
	}
	public void setAccountIFSC(String accountIFSC) {
		this.accountIFSC = accountIFSC;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getUpi() {
		return upi;
	}
	public void setUpi(String upi) {
		this.upi = upi;
	}
	public FarmerBankDetails() {
		super();
		
	}
	public FarmerBankDetails(String accountNumber, String accountFullName, String accountIFSC, String bankName,
			String phoneNumber, String upi) {
		super();
		this.accountNumber = accountNumber;
		this.accountFullName = accountFullName;
		this.accountIFSC = accountIFSC;
		this.bankName = bankName;
		this.phoneNumber = phoneNumber;
		this.upi = upi;
	}
	
	
}
