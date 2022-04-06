package com.cropdeal.farmerservice.entity;





import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(value = "farmerdetails")
public class Farmer {
	@Id
	private int farmerid;
	private String farmerName;
	private String farmerEmail;
	private String farmerPassword;
	private Long phoneNum;
	public int getFarmerid() {
		return farmerid;
	}
	public void setFarmerid(int farmerid) {
		this.farmerid = farmerid;
	}
	public String getFarmerName() {
		return farmerName;
	}
	public void setFarmerName(String farmerName) {
		this.farmerName = farmerName;
	}
	public String getFarmerEmail() {
		return farmerEmail;
	}
	public void setFarmerEmail(String farmerEmail) {
		this.farmerEmail = farmerEmail;
	}
	public String getFarmerPassword() {
		return farmerPassword;
	}
	public void setFarmerPassword(String farmerPassword) {
		this.farmerPassword = farmerPassword;
	}
	public Long getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(Long phoneNum) {
		this.phoneNum = phoneNum;
	}
	public Farmer(int farmerid, String farmerName, String farmerEmail, String farmerPassword, Long phoneNum) {
		super();
		this.farmerid = farmerid;
		this.farmerName = farmerName;
		this.farmerEmail = farmerEmail;
		this.farmerPassword = farmerPassword;
		this.phoneNum = phoneNum;
	}
	public Farmer() {
		super();

	}
	
	
	
}