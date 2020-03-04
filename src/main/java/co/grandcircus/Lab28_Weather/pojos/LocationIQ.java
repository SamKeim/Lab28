package co.grandcircus.Lab28_Weather.pojos;

import com.fasterxml.jackson.annotation.JsonProperty;

public class LocationIQ {
	
	private Double lat;
	private Double lon;
	
	@JsonProperty("display_name")
	private String displayName;
	
	public Double getLat() {
		return lat;
	}
	public void setLat(Double lat) {
		this.lat = lat;
	}
	public Double getLon() {
		return lon;
	}
	public void setLon(Double lon) {
		this.lon = lon;
	}
	
	public String getDisplayName() {
		return displayName;
	}
	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}
	
	@Override
	public String toString() {
		return "LocationIQ [lat=" + lat + ", lon=" + lon + ", displayName=" + displayName + "]";
	}
	

}
