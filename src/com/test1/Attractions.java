package com.test1;

public class Attractions extends RegionData {
	private int schoolCount;
	private int shoppingMalls;
	private int universities;
	private int parks;
	private String schoolName;
	private String mallName;
	private String otherAttractions;

	public Attractions() {

	}

	public Attractions(int schoolCount, int shoppingMalls, int universities, int parks, String schoolName,
			String mallName, String otherAttractions) {
		super();
		this.schoolCount = schoolCount;
		this.shoppingMalls = shoppingMalls;
		this.universities = universities;
		this.parks = parks;
		this.schoolName = schoolName;
		this.mallName = mallName;
		this.otherAttractions = otherAttractions;
	}

	public int getSchoolCount() {
		return schoolCount;
	}

	public void setSchoolCount(int schoolCount) {
		this.schoolCount = schoolCount;
	}

	public int getShoppingMalls() {
		return shoppingMalls;
	}

	public void setShoppingMalls(int shoppingMalls) {
		this.shoppingMalls = shoppingMalls;
	}

	public int getUniversities() {
		return universities;
	}

	public void setUniversities(int universities) {
		this.universities = universities;
	}

	public int getParks() {
		return parks;
	}

	public void setParks(int parks) {
		this.parks = parks;
	}

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	public String getMallName() {
		return mallName;
	}

	public void setMallName(String mallName) {
		this.mallName = mallName;
	}

	public String getOtherAttractions() {
		return otherAttractions;
	}

	public void setOtherAttractions(String otherAttractions) {
		this.otherAttractions = otherAttractions;
	}

}
