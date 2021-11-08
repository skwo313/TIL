package javaexp.a04_vo;

public class A04_Screen {
	private String movieTit;
	private int price;
	private int personCnt;
	public A04_Screen() {
		super();
		// TODO Auto-generated constructor stub
	}
	public A04_Screen(String movieTit, int price, int personCnt) {
		super();
		this.movieTit = movieTit;
		this.price = price;
		this.personCnt = personCnt;
	}
	public String getMovieTit() {
		return movieTit;
	}
	public void setMovieTit(String movieTit) {
		this.movieTit = movieTit;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getPersonCnt() {
		return personCnt;
	}
	public void setPersonCnt(int personCnt) {
		this.personCnt = personCnt;
	}
	
}
