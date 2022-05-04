package javaexp.a04_vo;

public class A03_Hobby {
	private String hobby;
	private int price;
	private int time;
	public A03_Hobby() {
		super();
		// TODO Auto-generated constructor stub
	}
	public A03_Hobby(String hobby, int price, int time) {
		super();
		this.hobby = hobby;
		this.price = price;
		this.time = time;
	}
	public String getHobby() {
		return hobby;
	}
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getTime() {
		return time;
	}
	public void setTime(int time) {
		this.time = time;
	}
	
}
