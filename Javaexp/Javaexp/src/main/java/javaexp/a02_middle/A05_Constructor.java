package javaexp.a02_middle;

public class A05_Constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product p1 = new Product("홍길동");
		// Product(string name)에 생성자로 매개변수값을 string유형으로 선언했기에
		// 입력값이 없는 생성자를 사용할 수 없다.
		// 객체의 참조변수,필드명으로 접근하여 사용할 수 있다.
		System.out.println(p1.name);
		
		Bus p2 = new Bus("3003번");
		System.out.println(p2.num);
		
	}

}
// 클래스 구성요소2 : 생성자
// 1. 주로 필드값을 매개변수로 초기화한다
//		매개변수 : 생성자나 메서드에서 데이터를 외부에 받을 때, 해당 데이터유형으로
//		선언한 내용으로 데이터를 전송해서, 받은 데이터를 활용할 떄 사용하는 변수이다
class Product {
	String name;
	Product(String name){  
		this.name = name; //매개변수로 넘겨오는 변수명과 필드명이 동일하기 떄문에 구분하기 위하여 
						  // this.필드명으로 선언하여 할당하였다.
	}
}
// ex) 
class Bus {
	String num;
	Bus(String num){
		this.num = num;
	}
}