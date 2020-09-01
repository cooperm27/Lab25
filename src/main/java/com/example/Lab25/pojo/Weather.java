package com.example.Lab25.pojo;

public class Weather {
	
	private Location location;
	private Data data;
	
	
	
	public Weather(Location location, Data data) {
		super();
		this.location = location;
		this.data = data;
	}
	
	
	public Location getLocation() {
		return location;
	}


	public void setLocation(Location location) {
		this.location = location;
	}


	public Data getData() {
		return data;
	}


	public void setData(Data data) {
		this.data = data;
	}


	public Weather() {
		super();
	}
	@Override
	public String toString() {
		return "Weather [location=" + location + ", data=" + data + "]";
	}
	
	
	
	

}
