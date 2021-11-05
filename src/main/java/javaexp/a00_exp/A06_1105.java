package javaexp.a00_exp;



public class A06_1105 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	// 1. 
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
	System.out.println("문자열"+"문자열");
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
	 작은데이터 유형을 큰데이터 유형으로 바꾸든 큰데이터 유형을 작은데이터 유형으로 바꿔준다
	 	int num = 67;
		char char01 = (char)num; // ()형식으로 캐스팅한다
		System.out.println(char01);
	 */
	
	// 8. 
	/*
	 비교 연산자는 두 값의 관계를 판단하고
	 논리 연산자는 두 값의 논리값을 판단한다
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
			}
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
	 	String person1[] = {"홍길동","211105번","사원"};
		String person2[] = {"마길동","191105번","팀장"};
		String person3[] = {"신길동","101105번","부장"};
		System.out.println("이름\t사원번호\t직책");
		System.out.println(person1[0]+"\t"+person1[1]+"\t"+person1[2]);
		System.out.println(person2[0]+"\t"+person2[1]+"\t"+person2[2]);
		System.out.println(person3[0]+"\t"+person3[1]+"\t"+person3[2]);
	 */
	
	//13. 
	/*
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
	class House{
		String hName;
		Person pe;
		House(String hName){
			this.hName = hName;
		}
		void getPerson(Person pe) {
			this.pe = pe;
		}
		void showInfo() {
			System.out.println("아파트명: "+hName);
			System.out.println("Person 객체의 할당여부: "+(pe!=null));
			if(pe!=null) {
				pe.show();
			}else {
				System.out.println("거주자는 없음");
			}
		}
	}
	class Person{
		String name;
		Person(String name){
			this.name = name;
		}
		void show(){
			System.out.println("거주자 이름은: "+name);
		}
	}
	
	main()
	House h1 = new House("프루지오");
	Person p1 = new Person("홍길동");
	h1.getPerson(p1);
	h1.showInfo();
	*/
}





