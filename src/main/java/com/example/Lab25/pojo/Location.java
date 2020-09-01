package com.example.Lab25.pojo;

public class Location {
	private Double latitude;
	private Double longitude;
	
	public Double getLatitude() {
		return latitude;
		
	}
	
	
	public Location(Double latitude, Double longitude) {
		super();
		this.latitude = latitude;
		this.longitude = longitude;
	}
	


	public Location() {
		super();
	}


	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}

	public Double getLongitude() {
		return longitude;
	}
	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}
	@Override
	public String toString() {
		return "Location [latitude=" + latitude + ", longitude=" + longitude + "]";
	}

}
