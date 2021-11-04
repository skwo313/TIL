package javaexp.a02_middle;

public class A21_ObjectVsObject {
	/*
	# 객체와 객체 1:1 관계
	1. 클래스 내부에 외부에 있는 클래스를 선언하여 활용할 수 있다.
	2. 이것은 객체로 되었을 때, 객체와 객체와 연관관계를 설정하여 사용할 때, 처리가 되는 부분이다.
	3. 예를 들어 상점에 가서 물건을 하나 구매 시, 연인관계에 있는 남/여, 사람과 가지고 있는 핸드폰
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fruit f1 = new Fruit("사과", 3000);
		Mart m1 = new Mart("행복마트");
		m1.buyProduct(f1);

	}

}
class Fruit{
	String name;
	int price;
	Fruit(String name, int price){
		this.name = name;
		this.price = price;
		
	}
}
class Mart{
	String mName; // 마트의 이름
	Fruit fu;	// 마트에서 판매하는 과일의 객체
	Mart(String name){
		this.mName = mName;
	}
	void buyProduct(Fruit fu) {
		System.out.println("물건구매");
		this.fu = fu;
		
	}
}