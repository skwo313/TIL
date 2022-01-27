package a01_diexp.vo;

public class WorkLocation {
	private String country;
	private String city;
	public WorkLocation() {
		super();
		// TODO Auto-generated constructor stub
	}
	public WorkLocation(String country, String city) {
		super();
		this.country = country;
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
}
