package javaexp.a06_object;

import java.util.ArrayList;

public class A06_MethodParamObj {
	// 구매 매서드 선언
	// 구매한 물건정보(물건명, 가격, 갯수) 출력
	public static void ProductInf(Product p) {
		System.out.println("# 구매한 물건정보 #");
		System.out.println("물건명:"+p.getPname());
		System.out.println("가격:"+p.getPrice());
		System.out.println("갯수:"+p.getCnt());
		System.out.println("총합:"+( p.getPrice()*p.getCnt() ));
	}
	// DB에 검색할 내용을 매개변수로 넘기고,
	// 검색해서 나온 list형 데이터를 ArrayList<VO>객체를 통해서 처리한다.
	public ArrayList<Product> getList(Product sch){
		ArrayList<Product> list = new ArrayList<Product>();
		// DB 처리..
		return list;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 물건객체 생성 및 데이터 할당.
		// 메서드를 통해 객체 전달.
		//
		ProductInf(new Product("사과",3000, 3));
		
		Product p1 = new Product("바나나", 5000, 2);
		ProductInf(p1);
		//
		takeBus(new Passenger("남성", 25));
	}
	public static void takeBus(Passenger p) {
		System.out.println("# 승객정보 #");
		System.out.println("승객 성별:"+p.getGender());
		System.out.println("승객 나이:"+p.getAge());
	}
}
//ex2) 클래스 승객(Passenger- 성별,나이), 메서드 takeBus(승객처리) 승객정보 출력
class Passenger{
	private String gender;
	private int age;
	public Passenger() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Passenger(String gender, int age) {
		super();
		this.gender = gender;
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}

class Product{
	private String pname;
	private int price;
	private int cnt;
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(String pname, int price, int cnt) {
		super();
		this.pname = pname;
		this.price = price;
		this.cnt = cnt;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getCnt() {
		return cnt;
	}
	public void setCnt(int cnt) {
		this.cnt = cnt;
	}
	
}
