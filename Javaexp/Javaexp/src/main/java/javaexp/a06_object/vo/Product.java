package javaexp.a06_object.vo;

public class Product {
	private String pname;
	private int price;
	public Product(String pname) {
		this.pname = pname;
	}
	public Product(String pname, int price) {
		this.pname = pname;
		this.price = price;
	}
	public void buy() {
		System.out.println(pname+"을 구매!");
	}
	public void buy2() {
		System.out.println("구매 정보");
		System.out.println("물건명: "+pname);
		System.out.println("구매 정보: "+price);
	}
}
