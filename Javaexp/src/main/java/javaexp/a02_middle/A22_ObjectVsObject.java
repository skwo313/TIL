package javaexp.a02_middle;

public class A22_ObjectVsObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Phone p1 = new Phone("애플");
		SmartMan s01 = new SmartMan("홍길동");
		s01.buyPhone(p1);
		s01.showInfo();
	}

}
/*
 1단계 (이름 , 폰) 클래스 선언
 2단계 객체 생성 SmartMan s01 = new SmartMan("홍길동");
 3단계 메서드를 통해서 외부에 객체가 생성되어 매개변수로 할당되고,
 		이것이 필드(Phone p01)에 할당된다
 4단계 s01.showInfo(); 를 통해서 현재 정보를 출력..
 */
class SmartMan{
	String name;
	Phone p01;
	SmartMan(String name){
		this.name = name;
	}
	void buyPhone(Phone p01){
		this.p01 = p01;
		System.out.println(name+" 폰을 구매하다");
	}
	
	void showInfo() {
		System.out.println("이름: "+name);
		System.out.println("Phone 객체의 할당여부: "+(p01!=null));
		if (p01!=null) {
			System.out.println("구매한 핸드폰은 ");
			p01.show(); 
		} else {
			System.out.println("구매 x");
		}
	}
}
class Phone{
	String name;
	Phone(String name){
		this.name = name;
	}
	void show() {
		System.out.println("제조사: "+name);
	}
}	