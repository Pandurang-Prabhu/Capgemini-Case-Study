package com.crop.entity;

import java.beans.Transient;
import java.util.List;

import javax.annotation.Generated;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.crop.entity.Address;

@Document(value = "crop_details")
public class CropDetails {
	
	


	@Id
	private int id;
	private String farmerName;
	private String cropName;
	private int cropQuantity;
	private int price;
	private Long number;
	private Address address;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFarmerName() {
		return farmerName;
	}
	public void setFarmerName(String farmerName) {
		this.farmerName = farmerName;
	}
	public String getCropName() {
		return cropName;
	}
	public void setCropName(String cropName) {
		this.cropName = cropName;
	}
	public int getCropQuantity() {
		return cropQuantity;
	}
	public void setCropQuantity(int cropQuantity) {
		this.cropQuantity = cropQuantity;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Long getNumber() {
		return number;
	}
	public void setNumber(Long number) {
		this.number = number;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public CropDetails(int id, String farmerName, String cropName, int cropQuantity, int price, Long number,
			Address address) {
		super();
		this.id = id;
		this.farmerName = farmerName;
		this.cropName = cropName;
		this.cropQuantity = cropQuantity;
		this.price = price;
		this.number = number;
		this.address = address;
	}
	public CropDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	

}
