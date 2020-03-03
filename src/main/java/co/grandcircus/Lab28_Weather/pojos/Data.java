package co.grandcircus.Lab28_Weather.pojos;

import java.util.List;

public class Data {

	private List<Integer> temperature;
	private List<String> weather;
	private List<String> iconLink;
	private List<String> text;
	public List<Integer> getTemperature() {
		return temperature;
	}
	public void setTemperature(List<Integer> temperature) {
		this.temperature = temperature;
	}
	public List<String> getWeather() {
		return weather;
	}
	public void setWeather(List<String> weather) {
		this.weather = weather;
	}
	public List<String> getIconLink() {
		return iconLink;
	}
	public void setIconLink(List<String> iconLink) {
		this.iconLink = iconLink;
	}
	public List<String> getText() {
		return text;
	}
	public void setText(List<String> text) {
		this.text = text;
	}
	
	
	
}
