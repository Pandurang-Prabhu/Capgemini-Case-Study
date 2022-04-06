package com.dealer.entity;

import java.time.YearMonth;

import org.springframework.data.annotation.Id;

public class DealerBankDetails {

	private String accountNumber;
	private String accountFullName;
	private int cvvNumber;
//	private YearMonth expiYearMonth;
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
	public int getCvvNumber() {
		return cvvNumber;
	}
	public void setCvvNumber(int cvvNumber) {
		this.cvvNumber = cvvNumber;
	}
//	public YearMonth getExpiYearMonth() {
//		return expiYearMonth;
//	}
//	public void setExpiYearMonth(YearMonth expiYearMonth) {
//		this.expiYearMonth = expiYearMonth;
//	}
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
	public DealerBankDetails(String accountNumber, String accountFullName, int cvvNumber, YearMonth expiYearMonth,
			String bankName, String phoneNumber, String upi) {
		super();
		this.accountNumber = accountNumber;
		this.accountFullName = accountFullName;
		this.cvvNumber = cvvNumber;
//		this.expiYearMonth = expiYearMonth;
		this.bankName = bankName;
		this.phoneNumber = phoneNumber;
		this.upi = upi;
	}
	public DealerBankDetails() {
		super();
		
		
	}
	
	
}
