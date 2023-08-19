package com.test1;

public class Property extends RegionData {
	private int propertyId;
	private String propertyName;
	private String StreetName;
	private int peopleCount;

	public Property() {

	}

	public Property(int propertyId, String propertyName, String streetName, int peopleCount) {
		super();
		this.propertyId = propertyId;
		this.propertyName = propertyName;
		StreetName = streetName;
		this.peopleCount = peopleCount;
	}

	public int getPropertyId() {
		return propertyId;
	}

	public void setPropertyId(int propertyId) {
		this.propertyId = propertyId;
	}

	public String getPropertyName() {
		return propertyName;
	}

	public void setPropertyName(String propertyName) {
		this.propertyName = propertyName;
	}

	public String getStreetName() {
		return StreetName;
	}

	public void setStreetName(String streetName) {
		StreetName = streetName;
	}

	public int getPeopleCount() {
		return peopleCount;
	}

	public void setPeopleCount(int peopleCount) {
		this.peopleCount = peopleCount;
	}

}
