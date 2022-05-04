package javaexp.a00_exp;

public class A04_1103 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 클래스란 객체를 생성하기 위한 기본 코드이다
		// 	객체를 만들기 위한 설계도 역할
		//	코드로 만들 클래스는 컴파일 단계까지만 진행되며, 이 컴파일 된 클래스는
		//	main()가 있는 클래스에서 실행으로 해당 클래스를 new 생성자()형태로 호출하여 메모리에 로딩할 수 있다
		//	클래스명 참조변수 = new 생성자();
		//	하나의 선언된 클래스에서 여러개의 객체를 생성할 수 있고, 이렇게 생성된 객체는 heap영역에 메모리를 만들고,
		//	참조변수에 의해서 stack영역에 heap영역의 주소값을 저장하여 처리된다
		// 2. 
		// Person p1 = new Person(); // heap 영역에 객체의 데이터를 할당,
									 // heap영역의 메모리의 주소값을 참조변수(p1)에 할당하여 stack영역에 저장
		/*
		 * 자바의 메모리 중 stack과 heap영역이 있는데, 객체가 이 메모리를 어떻게 할용하는 지를 클래스,객체 선언을 통해서
		 * 객체는 생성이 되면 heap영역에 메모리를 만들어 생성을 하고, 이 heap영역의 주소값을 stack영역에 참조변수로 저장한다
		 * 하나의 클래스를 통해서 만들어진 여러 객체ㅡㄷㄹ을을 각각다른 heap영역에 저장되기에 다른 주소값을 가진다.
		 *  Person p1 = new Person();
		 *  Person p1 = new Person();
		 *  new Person() : 힙영역에 객체가 생성, p1,p2 참조변수로 힙영역의 주소값을 스택영역에 저장한다
		 *  System.out.println(p1); // 해당 참조변수를 확인할 수 있다.
		 *  ex) 도서관의 실제 책ㅇ이 있는 것 (힙영역에 객체가 생성),
		 *  이 책이 있는 곳을 단말기를 통해 검색해서 그 위치를 파악(스택영역에 힙영역의 위치 저장)
		 */
		// 3. 클래스를 통해서 선언할 생성자 중에 default 생성자라는 개념이 있다, 이것을 언제 사용되고, 소멸이 되는지 기술하세요
		// 클래스는 기본적인 default 생성자를 포함하고 있고, 코드에 의해 생성자를 선언하는 순간 소멸된다.
		/*
		 *  class Person{
		 *  
		 *  }
		 *  1. 클래스만 선언하여도 내부적으로 Person(){} 모양의 생성자가 default로 선언이 된다
		 *  	그래서, main()메서드를 통해서 Person p01 = new Person();으로 해당 클래스의 생성자를 호출할 수 있따.
		 *  2. default 생성자는 개발자가 추가 코딩을 통해서 생성자를 선언할 때, 사라진다.
		 *  	이 떄는 선언한 생성자가 있을 떄만 해당 객체가 생성자를 통해서 생성이 되고, 호출이 가능하다
		 *  	ex) main()메서드
		 *  	Person p01 = new Person(); 와 같은 코드의 경우, 생성자를 선언하지 않을 떄는 에러가 발생하지 않지만,
		 *  	위와 같이 생성자를 매개변수가 있는 생성자를 선언했을 떄, 에러가 발생한다.
		 *  	선언하는 순간 default 생성자는 사라진다.
		 *  3. 기존에 매개변수가 없는 생성자도 에러없이 사용하고 싶으면, 추가하여 default생성자와 모양이 같은 매개변수가 
		 *  	없는 생성자를 선언하면 된다.
		 *  	class Person{
		 *  		Person(){}
		 *  		Person(String name){}
		 *  	}
		 */
		// 4. this는 입력받는 매개변수와 필드명을 구분하기위해 사용한다.
		/*
		 	class Person{
		 		String name;
		 		int age;
		 		Person(String name, int age){
		 			this.name = name;
		 			this.age = age;
		 		}
		 		this라는 것은 객체가 생성되었을 때, 내부적으로 현재 호출된 이 객체를 지칭한다.
		 		this.필드, this.메서드(), this(){현재 객체의 선언된 생성자}를 호출한다.
		 		외부에서는 참조변수로 호출하여 참조변수,멤버로 처리하지만, 객체에서는 this로 현재 생성된 이 객체를 지칭한다.
		 		자바에서는 조금 여유롭게 this라는 키워드를 선언하지 않아도 필드나 메서들를 지칭하지만,
		 		객체지향적은 프로그램에서 반드시 선언하여야 하는 경우가 많다.
		 		자바에서는 주로 외부에서 입력되는 매개변수의 변수명과 필드명이 동일할 떄, 활용되는 경우가 많다
		 		
		 	}
		 	Person p01 = new Person("홍길동",25);
		 	p01.name; // 생성자에 의해서 필드값이 할당되어 해당 데이터를 호출하여 사용할 수 있다.
		 	p01.age;
		 	p01.show();
		 */
		// 5. 생성자는 매개변수가 다르면 여러개 선언이 가능하다.
		/*
			class Person{
				Person(){}	
				Person(){}	(x)
				Person(String name){}
				Person(String alias){} (x) 매개변수의 이름으로는 외부에서 호출할 떄, 식별이 불가능하다.
				Person(int name){}
				Person(String name, int age){}
			}
			1. 생성자는 오버로딩규칙에 의해서 여러 개를 하나의 클래스에서 선언할 수 있다.
			2. 오버로딩규칙이 있는 근본적인 이유는 외부에서 호출할 떄, 다르게 식별하여 호출이 가능하기 때문이다
			3. 생성자도 메서드도 이름은 같지만, 매개변수가 다르면 다른 생성자로, 다른 메서드로 식별할 수 있기 때문에
				선언이 가능한 것이다.
				Person p1 = new Person(); : 74라인/75라인 둘다 선언되어 있으면 해당 생성자로 어떤 것을 호출할지
					구분을 할 수 없기 떄문에 둘중에 하나는 삭제를 하여야 에러가 발생하지 않는다
				Person p2 = new Person("홍길동"); 76라인에 있는 생성자를 호출하는 것이 명백하기 때문에 같은 이름이라도
					선언을 할 수 있다.
				Person p3 = new Person(25); 78라인을 호출하는 것이 명확하기에 선언이 가능하다
			4. 결론적으로 생성자나 메서드는 식별이 가능하게 매개변수가 선언되면 선언이 가능하고 이것을 오버로딩이라고 하는데,
				일반적으로 매개변수의 갯수, 매개변수의 데이터유형, 매개변수의 타입이 다른 선언 순서에 따라서 다른 생성자/메서드를 선언할 
				수 있는 것을 말한다.
		 */
		// 6. 
		Computer c1 = new Computer("삼성전자", "11세대 타이거레이크", 8, 600);
		c1.showInfo();
		
		// 7. 
		c1.changeCpu("10세대 타이거레이크");
		c1.showInfo();
		// 8.
		int upRam = c1.doubleRam();
		System.out.println("현재 컴퓨터의 ram 두배 사양: "+upRam+"GB");
		// 9.
		AirPlane a1 = new AirPlane("보잉",700,100);
		a1.speedUp();
		a1.speedDown();
		a1.loadPeople(-10);
		// 10. 
		Bus001 b1 = new Bus001(7780,"수원역","서울역",30);
		b1.loadPerson(-10);
		
	}

}
// 6. 
class Computer{
	String coporation;
	String cpu;
	int ram;
	int hdd;
	Computer(String coporation, String cpu, int ram, int hdd){
		this.coporation = coporation;
		this.cpu = cpu;
		this.ram = ram;
		this.hdd = hdd;
	}
	void showInfo() {
		System.out.println("# 컴퓨터 정보 #");
		System.out.println("제조사: "+coporation);
		System.out.println("cpu: "+cpu);
		System.out.println("ram: "+ram+"GB");
		System.out.println("hdd: "+hdd+"GB");
	}
	// 7.
	void changeCpu(String cpu) {
		System.out.println("# cpu 변경 #");
		System.out.println(this.cpu+ "==>"+cpu);
		this.cpu = cpu;		
	}
	// 8.
	int doubleRam() {
		ram *= 2;
		return ram;
	}
}
// 9.
class AirPlane{
	String coporation2;
	int speed;
	int peopleCnt;
	AirPlane(String coporation2, int speed, int peopleCnt){
		this.coporation2 = coporation2;
		this.speed = speed;
		this.peopleCnt = peopleCnt;
	}
	void getCurSpeed() {
		System.out.println("현재 속도는 "+speed+"Km/h");
	}
	void speedUp() {
		this.speed += 50;
		getCurSpeed();
	}
	void speedDown() {
		this.speed -= 50;
		getCurSpeed();
	}
	
	void loadPeople(int cnt) {
		peopleCnt += cnt;
		if(cnt>0) {
		System.out.println(coporation2+"의 승객수는 "+cnt+"명 탑승하여 "+peopleCnt+"명 입니다.");
		}else if(cnt<0) {
		System.out.println(coporation2+"의 승객수는 "+cnt+"명 하차하여 "+peopleCnt+"명 입니다.");
		}
		
	}
}
// 10.
class Bus001{
	int busNum;
	String StartPoint;
	String endPoint;
	int peopleCnt;
	Bus001(int busNum, String StartPoint, String endPoint, int peopleCnt){
		this.busNum = busNum;
		this.StartPoint = StartPoint;
		this.endPoint = endPoint;
		this.peopleCnt = peopleCnt;
	}
	void loadPerson(int cnt) {
		peopleCnt += cnt;
		if(cnt>0) {
		System.out.println(busNum+"의 승객수는 "+cnt+"명 탑승하여 "+this.peopleCnt+"명 입니다.");
		}else if(cnt<0) {
		System.out.println(busNum+"의 승객수는 "+cnt+"명 하차하여 "+this.peopleCnt+"명 입니다.");
		}
		
	}
}

