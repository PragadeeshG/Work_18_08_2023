package com.test1;

public class GeoDetails extends RegionData {
	private int geoLocationId;
	private boolean gpsEnabled;
	private boolean wazeInteg;
	private String wazeMapName;

	public GeoDetails() {
	}

	public GeoDetails(int geoLocationId, boolean gpsEnabled, boolean wazeInteg, String wazeMapName) {
		super();
		this.geoLocationId = geoLocationId;
		this.gpsEnabled = gpsEnabled;
		this.wazeInteg = wazeInteg;
		this.wazeMapName = wazeMapName;
	}

	public int getGeoLocationId() {
		return geoLocationId;
	}

	public void setGeoLocationId(int geoLocationId) {
		this.geoLocationId = geoLocationId;
	}

	public boolean isGpsEnabled() {
		return gpsEnabled;
	}

	public void setGpsEnabled(boolean gpsEnabled) {
		this.gpsEnabled = gpsEnabled;
	}

	public boolean isWazeInteg() {
		return wazeInteg;
	}

	public void setWazeInteg(boolean wazeInteg) {
		this.wazeInteg = wazeInteg;
	}

	public String getWazeMapName() {
		return wazeMapName;
	}

	public void setWazeMapName(String wazeMapName) {
		this.wazeMapName = wazeMapName;
	}

}
