package javaexp.a06_object.vo;

public class Person {
	// 1. 필드 : 클래스의 전역변수/상수 - 메모리 저장되는 데이터 선언.
	//	  일반적으로 접근제어자는 private로 외부 객체에서 직접 접근을 못하게 한다.
	private String name;
	// 2. 생성자 : 클래스명과 동일한 함수로 매개변수를 통해 필드의 값을 초기화를
	// 		할 때, 주로 사용된다.
	public Person(String name) {
		// this.name : 필드에 있는 name과 구분하기 위해서 this.를 붙인다.
		this.name = name;
		// 매개변수로 온 데이터를 필드에 할당한다.
		// main() 호출
		// Person p01 = new Person("홍길동");
	}
	// 3. 기능 메서드 : 접근제어자 리턴유형 메서드명(매개변수){리턴값;}
	// 	  형태로 된 객체에서 사용하는 함수이다. 주로 기능 처리를 담당한다.
	//		p01.showInf();	// 참조변수.메서드명() 형태로 사용된다.
	public void showInf() {
		System.out.println("이름은 "+name+"입니다!");
		// name : 현재 field에 있는 game값을 출력한다.
	}
	//		String respon = p01.ear("홍길동"); 
	public String ear(String callName) {
		String ret="";
		if (callName.equals(name)) {
			ret = "네!";
		}
		return ret;
	}
}
