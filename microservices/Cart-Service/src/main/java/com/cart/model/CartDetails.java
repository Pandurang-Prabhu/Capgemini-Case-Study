package com.cart.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Document(value = "Cart")
public class CartDetails {
	
	@Id
	private int id;
	private String dealername;
	private String cropName;
	private int cropQuantity;
	private int price;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDealername() {
		return dealername;
	}
	public void setDealername(String dealername) {
		this.dealername = dealername;
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
	public CartDetails(int id, String dealername, String cropName, int cropQuantity, int price) {
		super();
		this.id = id;
		this.dealername = dealername;
		this.cropName = cropName;
		this.cropQuantity = cropQuantity;
		this.price = price;
	}
	public CartDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	

}
