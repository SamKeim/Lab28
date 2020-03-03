package co.grandcircus.Lab28_Weather.pojos;

import org.springframework.beans.factory.annotation.Value;

public class LocationIQ {
	
	private Double lat;
	private Double lon;
	@Value("${display_name")
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
	
	

}
