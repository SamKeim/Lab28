package co.grandcircus.Lab28_Weather.pojos;

public class Weather {

	private Time time;
	
	private Data data;
	
	private String productionCenter;
	
	public Time getTime() {
		return time;
	}

	public void setTime(Time time) {
		this.time = time;
	}

	public Data getData() {
		return data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public String getProductionCenter() {
		return productionCenter;
	}

	public void setProductionCenter(String productionCenter) {
		this.productionCenter = productionCenter;
	}
	
	
	
}
