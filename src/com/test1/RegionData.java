package com.test1;

public class RegionData {
	private int latitude;
	private int longitude;
	private String state;
	private int regionCode;

	public RegionData() {

	}

	public RegionData(int latitude, int longitude, String state, int regionCode) {
		super();
		this.latitude = latitude;
		this.longitude = longitude;
		this.state = state;
		this.regionCode = regionCode;
	}

	public int getLatitude() {
		return latitude;
	}

	public void setLatitude(int latitude) {
		this.latitude = latitude;
	}

	public int getLongitude() {
		return longitude;
	}

	public void setLongitude(int longitude) {
		this.longitude = longitude;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getRegionCode() {
		return regionCode;
	}

	public void setRegionCode(int regionCode) {
		this.regionCode = regionCode;
	}

}
