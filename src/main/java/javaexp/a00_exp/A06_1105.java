package javaexp.a00_exp;



public class A06_1105 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		House h1 = new House("프루지오");
		Person p1 = new Person("홍길동", 25);
		h1.getPerson(p1);
		// h1.getPerson(new Person("홍길동", 25));
		h1.showInfo();
	}
	// 1. java를 컴파일과 실행과정을 Person.java을 기준으로 기술하세요
	// 컴파일과정(코드==>기계어로 변경, ctrl+s 저장) javac Person.java ==> Person.class
	// 실행과정(main()메서드가 있는 클래스에서 호출할 때) java Person ==> memory에 로딩과 내부적인 코딩 내용이 수행
	/*
	public class Person {
		// 다른 패키지에 있는 field
		private String name = "홍길동"; // private는 다른 클래스에서 호출 불가능하다
		int age = 25; default는 같은 패키지에서만 호출이 가능하다
		public String loc = "서울"; public은 외부패키지에서 접근이 가능해 호출이 가능하다
	}
	*/
	
	// 2.
	/*
	System.out.println("출력할문자열-줄바꿈포함");
	System.out.print(); // "줄바꿈없이 출력"
	\n (줄바꿈처리), \t (탭간격처리)
	*/
	
	// 3.
	/*
	 String name = "홍길동";
	int kors = 70;
	int eng = 80;
	int math = 90;
	int tot = kors+eng+math;
	int avg = tot/3;
		
	System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
	System.out.println(name+"\t"+kors+"\t"+eng+"\t"+math+"\t"+tot+"\t"+avg);
	 */
	
	// 4.
	/*
	import java.util.Scanner;
	
	Scanner sc = new Scanner(System.in);
	System.out.print("이름: ");
	String name = sc.nextLine();
	System.out.print("국어성적: ");
	int kors = sc.nextInt();
	System.out.print("영어성적: ");
	int eng = sc.nextInt();
	System.out.print("수학성적: ");
	int math = sc.nextInt();
	int tot = kors+eng+math;
	int avg = tot/3;
	System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
	System.out.println(name+"\t"+kors+"\t"+eng+"\t"+math+"\t"+tot+"\t"+avg);
	*/
	
	// 5.
	/*
	class Person{
		String name;
		int i;
		Person(String name, int i){
			this.name = name;
			this.i = i;
		}
		void ifSentence() {
			for(int i=this.i;i<15;i++) {
				if(i>10) {
					System.out.println("10보다 크다");
				}else {
					System.out.println("10보다 작다");
				}
			}
			
		}
	}
	class Person{
		String name;
		Person(String name){
			this.name = name;
		}
		String getName(){
			return name;
		}
		void showInfo(String data){
			if (data.equals("홍길동")){
				System.out.println("관리자");
		}
	}
	*/
	
	// 6. 
	/*
	 기본 데이터의 유형
	 	정수형 : byte, short, **int, long, char(문자)
	 	실수형 : float, **double
	 	boolean : true/false
	 	int integer = 100;
		double double1 = 0.7;
		boolean boolean1 = true;
		System.out.println(integer+"과 "+double1+"를 더하면 100.7이다 ("+boolean1+")");
	 */
	
	// 7. 
	/*
	 타입 캐스팅은 작은 컵에 있는 물을 큰 컵에 담거나 큰컵에 있는 물을 작은 컵에 담는 것처럼 
	 항변환 중, 큰데이터 유형을 작은데이터 유형의 메모리에 할당될 때, 사용된다.
	 	int num = 67;
		char char01 = (char)num; // ()형식으로 캐스팅한다
		System.out.println(char01);
	 */
	
	// 8. 
	/*
	 비교 연산자는 두 값의 관계를 판단하여 boolean값을 도출하는 연산자이고(boolean isPass = point >=70)
	 논리 연산자는 비교연산자를 통한 결과 처리된 boolean값을 and(&&),or(||)을 활용하여 
	 논리값을 판단한다	ex) boolean isFreePass = age < 5 || age >=65;
	 	int score = 85;
		if (score>=80 && score<90) {
			System.out.println("B학점 입니다");
		}
	 */
	
	// 9.
//	 (연산자)가 최우선, (*,/)(곱셉과 나눗셈), +,-
	
	// 10.
	/*
	 	for(int i=15;i<=50;i++) {
			if(i%3 == 0) {
				System.out.println("@");
			}else {
				System.out.println(i+"\t");
		}
	 */
	
	// 11.
	/*
	 	if문과 함께 반복처리시 해당 step 이후로 처리를 하지 않고, 다음 반복단계를 수행 처리
		ex) for(int cnt=1;cnt<=10;cnt++){
			if(cnt==5){
				continue;
			}
		}
		System.out.println(cnt); // 5만 출력되지 않고, 1~10까지 출력
		
		break : 반복문을 완전히 종료 처리
		ex) for(int cnt=1;cnt<=10;cnt++){
			if(cnt==5){
				break;
			}
		}
		System.out.println(cnt); // 5 이후 내용을 출력하지 않는다
	 */
	
	// 12.
	/*
	 	String enames[] = {"홍길동","마길동","신길동"};
		String empnos[] = {"211105번", "191105번", "101105번"};
		String jobs[] = {"사원", "부장", "팀장"};
		System.out.println("이름\t사원번호\t직책");
		// 반복문을 이용하는 배열을 효과적으로 처리
		 1. 배열의 index의 시작 0부터 처리한다
		 2. 배열의 index번호는 배열의 길이보다 1적다 idx < enames.length
		 3. 배열의 index가 증가처리 한다 idx++
		for(int idx=0;idx<enames.length;idx++){
			System.out.print(enames[idx]+"\t");
			System.out.print(empnos[idx]+"\t");
			System.out.print(jobs[idx]+"\t");
		}
	 */
	
	//13. 
	/* 카드모양: ♠ ♣ ♥ ◈
	 	String shapes[] = {"♠", "♣", "♥", "◈"}
	 	String numbers[] = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"}
	 	Card[] cards = new Card[52];
	 	// 모양을 반복해서 처리할 데이터
		for(int inx=0;idx<shapes.length;idx++){
				System.out.println(shapes[idx]);
			// 숫자를 반복해서 처리할 데이터
			for(int jdx<numbers.length.jdx++){
				System.out.print(shapes[idx]+numbers[jdx]+",");
			}
			System.out.println();
		}
	 	
	 	-----------
		class Card{
			String shape;
			int cardNum;
			Card(String shape, int cardNum){
				this.shape = shape;
				this.cardNum = cardNum;
			}
			void show() {
				System.out.println("카드 모양: "+ this.shape);
				System.out.println("카드 번호: "+ this.cardNum);
			}
		}
	 
	 main()
	 	Card c1 = new Card("네모", 213214);
		c1.show();
	 */
	
	// 14.
	/*
	
	
	main()
	
	*/
}
class House{
	String hName;
	Person person;
	House(String hName){
		this.hName = hName;
	}
	void getPerson(Person person) {
		this.person = person;
	}
	void showInfo() {
		System.out.println("아파트명: "+hName);
		System.out.println("Person 객체의 할당여부: "+(person!=null));
		if(person!=null) {
			person.show();
		}else {
			System.out.println("거주자는 없음");
		}
	}
}
class Person{
	String name;
	int age;
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	void show(){
		System.out.println("거주자 이름은: "+name);
	}
}



