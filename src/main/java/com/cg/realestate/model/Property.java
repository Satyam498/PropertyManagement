
package com.cg.realestate.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import org.hibernate.validator.constraints.NotBlank;

@Entity
public class Property {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int propertyId;
	@Column
	@NotBlank
	private String propertyType;
	@Column
	@NotBlank
	private String room;
	@Column
	@NotBlank
	private double budget;
	@Column
	@NotBlank
	private String popertyStatus;
	@Column
	@NotBlank
	private String areaPerSq;
	@Column
	@NotBlank
	private int floorNo;
	@Column
	@NotBlank
	private String location;
	@Column
	@NotBlank
	private String locality;
	
	@OneToOne(cascade = CascadeType.ALL) 
	@JoinColumn
	private User user;
		
	public Property() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	//Constructor for Flat
	public Property(int propertyId, String propertyType, String room, double budget, String popertyStatus,
			String areaPerSq, int floorNo, String location, String locality, User user) {
		super();
		this.propertyId = propertyId;
		this.propertyType = propertyType;
		this.room = room;
		this.budget = budget;
		this.popertyStatus = popertyStatus;
		this.areaPerSq = areaPerSq;
		this.floorNo = floorNo;
		this.location = location;
		this.locality = locality;
		this.user = user;
	}




	public User getUser() {
		return user;
	}


	public void setUser(User user) {
		this.user = user;
	}


	public int getPropertyId() {
		return propertyId;
	}
	public void setPropertyId(int propertyId) {
		this.propertyId = propertyId;
	}
	public String getPropertyType() {
		return propertyType;
	}
	public void setPropertyType(String propertyType) {
		this.propertyType = propertyType;
	}
	public String getRoom() {
		return room;
	}
	public void setRoom(String room) {
		this.room = room;
	}
	public double getBudget() {
		return budget;
	}
	public void setBudget(double budget) {
		this.budget = budget;
	}
	public String getPopertyStatus() {
		return popertyStatus;
	}
	public void setPopertyStatus(String popertyStatus) {
		this.popertyStatus = popertyStatus;
	}
	public String getAreaPerSq() {
		return areaPerSq;
	}
	public void setAreaPerSq(String areaPerSq) {
		this.areaPerSq = areaPerSq;
	}
	public int getFloorNo() {
		return floorNo;
	}
	public void setFloorNo(int floorNo) {
		this.floorNo = floorNo;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getLocality() {
		return locality;
	}
	public void setLocality(String locality) {
		this.locality = locality;
	}

	
	
	

}
