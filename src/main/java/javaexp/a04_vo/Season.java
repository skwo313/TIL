package javaexp.a04_vo;

public class Season {
	private String seoson;
	private String weather;
	private String property;
	public Season() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Season(String seoson, String weather, String property) {
		super();
		this.seoson = seoson;
		this.weather = weather;
		this.property = property;
	}
	public String getSeoson() {
		return seoson;
	}
	public void setSeoson(String seoson) {
		this.seoson = seoson;
	}
	public String getWeather() {
		return weather;
	}
	public void setWeather(String weather) {
		this.weather = weather;
	}
	public String getProperty() {
		return property;
	}
	public void setProperty(String property) {
		this.property = property;
	}
	
}
