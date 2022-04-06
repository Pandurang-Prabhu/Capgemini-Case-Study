package com.crop.entity;

import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data
public class Address {
	@Id
	private int id;
	private String houseName;
	private String roadName;
	private String farmerCity;
	private String farmerDistrict;
	private String farmerState;
	private int farmerzipcode;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getHouseName() {
		return houseName;
	}
	public void setHouseName(String houseName) {
		this.houseName = houseName;
	}
	public String getRoadName() {
		return roadName;
	}
	public void setRoadName(String roadName) {
		this.roadName = roadName;
	}
	public String getFarmerCity() {
		return farmerCity;
	}
	public void setFarmerCity(String farmerCity) {
		this.farmerCity = farmerCity;
	}
	public String getFarmerDistrict() {
		return farmerDistrict;
	}
	public void setFarmerDistrict(String farmerDistrict) {
		this.farmerDistrict = farmerDistrict;
	}
	public String getFarmerState() {
		return farmerState;
	}
	public void setFarmerState(String farmerState) {
		this.farmerState = farmerState;
	}
	public int getFarmerzipcode() {
		return farmerzipcode;
	}
	public void setFarmerzipcode(int farmerzipcode) {
		this.farmerzipcode = farmerzipcode;
	}
	public Address(int id, String houseName, String roadName, String farmerCity, String farmerDistrict,
			String farmerState, int farmerzipcode) {
		super();
		this.id = id;
		this.houseName = houseName;
		this.roadName = roadName;
		this.farmerCity = farmerCity;
		this.farmerDistrict = farmerDistrict;
		this.farmerState = farmerState;
		this.farmerzipcode = farmerzipcode;
	}
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Address [id=" + id + ", houseName=" + houseName + ", roadName=" + roadName + ", farmerCity="
				+ farmerCity + ", farmerDistrict=" + farmerDistrict + ", farmerState=" + farmerState
				+ ", farmerzipcode=" + farmerzipcode + "]";
	}
	
	
	
	
	
	
	
}