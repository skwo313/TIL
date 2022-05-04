package javaexp.a00_exp;

import java.util.ArrayList;

public class A07_1108 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Card c1 = new Card();
		Friend1 f1 = new Friend1("홍길동");
		Friend1 f2 = new Friend1("마길동");
		Friend1 f3 = new Friend1("신길동");
		Friend1 f4 = new Friend1("김길동");
		c1.getName(f1);
		c1.getCard();
		c1.getName(f2);
		c1.getCard();
		c1.getName(f3);
		c1.getCard();
		c1.getName(f4);
		c1.getCard();
		
		
	}
/*
1. java 에서 필드값을 private로 설정하는 이유
	필드값을 직접적인 접근을 하는 것을 방지함으로 데이터의 효과적인 보안 처리와 객체지향 프로그램의 encapsulation 개념에 합치되게
	처리하기 위한 것이다.
	encapsulation이란 특정 데이터를 접근하기 위한 방법을 마련하여, 해당 방법으로만 해당 데이터를 처리하기 위한 개념으로
	vo 객체같은 경우 읽기를 하는 메서드 getXXX()와 쓰기를 하는 메서드 setXXX()로만 데이터를 처리하게한 것을 말한다
	 -캡슐화(encapsulation)는 일반적으로 연관 있는 변수와 함수를 클래스로 묶는 작업으로써
	 정보를 은닉하고 외부에 영향없이 객체 내부 구현 변경이 가능하다
	 자료를 보호할 수 있고 내부적으로만 사용할 수 있기 떄문에 필드값을 private로 쓴다

2. 
	하나의 파일로 하나의 클래스만 public 클래스를 사용할 수 있다
	보통의 파일명으로 지정한 클래스를 public 클래스로 사용한다.
	외부에서 선언할 때, 패키지가 달라도 선언이 가능하게 한다.
	public Book(){}
	선언된 클래스를 객체 생성을 통해서 처리할 떄, 접근제어자에 의해 영향을 미친다
	외부 패키지에서도 해당 객체를 생성할려면 접근 제어자가 public이여야 한다 
	
	필드값은 private 형태로 작성,
	생성자, 호출메서드, 저장메서드 등은 public 형태로 작성한다
	
3. 
public class A04_Computer {
	private String company;
	private String cpu;
	private int ram;
	private int hdd;
	public A04_Computer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public A04_Computer(String company, String cpu, int ram, int hdd) {
		super();
		this.company = company;
		this.cpu = cpu;
		this.ram = ram;
		this.hdd = hdd;
	}
	public String getCompany() {
		return company;
	}
	public String getCpu() {
		return cpu;
	}
	public int getRam() {
		return ram;
	}
	public int getHdd() {
		return hdd;
	}
}
	
main()
	A04_Computer c01 = new A04_Computer("삼성전자", "11세대 타이거레이크", 8, 600);
	System.out.println("제조사: "+ c01.getCompany());
	System.out.println("cpu: "+ c01.getCpu());
	System.out.println("ram: "+ c01.getRam()+"GB");
	System.out.println("hdd: "+ c01.getHdd()+"GB");
	
4. 
배열은 정적데이터이여서 구조자체가 초기에 크기가 정해지면 변경하지 못하는 반면 
자바에서 지원하는 ArrayList는 동적배열로 데이터를 생성하고 변경하고 가져오고 배열의 크기를 알 수 있다
		ArrayList schedule = new ArrayList();
		schedule.add("영화시청");
		schedule.add("독서");
		schedule.add("독서");
		schedule.add("독서");
		schedule.add("운동");
		schedule.set(2, "카페가기");
		schedule.set(3, "친구만나기");
		schedule.add(0, "운동"); // .add(추가할 index, 추가할 데이터);
		System.out.println("ArrayList의 크기: " + schedule.size());
		System.out.println("# 주말의 일정 우선순위 #");
		for(int idx=0;int<schedule.size();idx++){
			// index와 순번과의 차이가 1이기에 +1로 순번 처리를 하였다
			System.out.println(idx+1+"번째 일정: "+schedule.get(idx));
		}
		System.out.println("토요일: "+schedule.get(0)+"\t"+schedule.get(1)+"\t"+schedule.get(2));
		System.out.println("일요일: "+schedule.get(3)+"\t"+schedule.get(4));
		schedule.remove(2); // .remove(삭제할 index);
		
5. 
	웹에서 서버란 클라이언트에게 특정한 웹화면을 통해서 정보나 화면을 지원해주는 데몬을 말한다.
	웹서버라고 하는데, apche, IIS 등이 있다. 이 웹서버에 DB나 java와 같은 프로그램을 컴파일 시켜서
	처리해주는 것을 웹어플리케이션서버(WAS)라고 한다. tomcat, jeus, weblogic 등이 대표적인 was라고 할 수 있다
	웹에서 클라이언트란 웹서버에 요청을 하여, 특정한 화면이나 정보를 전달받는 프로그램을 말한다 
	html 형식으로 전달 받아, 랜더링하여 tag에 지정된 형태로 화면을 출력처리하는 브라우저를 말한다.
	브라우저의 종류로는 인터넷익스플로러, 사파리, 오페라, 크롬등이 잇다
	두개의 웹서버와 클라이언트는 넥트웍이라는 환경하에 상호간에 요청과 반응을 하면서 사용자가 필요로 하는 정보나
	화면 , 서비스를 전달받는 처리를 한다
	/웹은 요청과 응답 과정으로써 클라이언트(사용자)는 컴퓨터에 요청하는 쪽이고 서버(제공자)는 응답하는 쪽이다
	
6.  
	html 기본적으로 웹 화면을 구성하는 태그 언어를 말한다
	테이블형식 리스처리, 타이틀, 메뉴 목록 처리, 화면 구성 처리 등을 지원하는 태그들로 구성하고 있다.
	css는 html에 지원한 기본 태그에서 확장된 모양과 색상 크기를 지원하는 언어이다.
	효과적으로 웹화면을 구성할 수 있도록 지원한다.
	javaScript는 html와 css에 동적인 기능 처리를 할 수 있게 프로그램적으로 지원하는 것을 말한다
	html과 css에서 지원한 태그나 코드들을 DOM(document object model)이라는 개념으로 객체화하여
	객체지향적으로 프로그램화하여 지원하는 것을 말한다.
	# javaScript ==> jquery ==> ajax ==> node ==> vue
	
	/HTML은 웹 브라우저에서 문서 및 웹 페이지가 표시되는 방법을 규정하는 언어이며, 어떠한 웹사이트에서든 
	블록(block)을 구성하고 웹사이트의 구조를 만드는데에 사용되는 언어이다. 
	HTML로 만들어진 문서의 (컬러, 폰트 스타일, 레이아웃, 반응형 특징 등의) 스타일을 지정하는 방식을 규정하는 유명한 스타일 시트 언어이다.
	CSS는 웹사이트를 시각적으로 보다 매력적으로 만드는 기능을 제공한다.
	javaScript는 웹사이트가 로딩된 이후에 CSS와 HTML 구성요소들을 변경할 수 있게 해주며, 
	이를 통해서 웹사이트를 보다 인터랙티브(interactive)하게 만들고 사용자의 참여율도 높인다
	
	7. 52개 카드 배열을 활용하여, 친구 4명에게 임의 7장씩 카드를 출력하세요
		1) api에서 지원되는 내용으로 처리
		2) 알고리즘을 활용하는 방법
			- 카드 클래스 만들기 : 필드를 선언해보기
			- 카드 배열/동적배열 만들어서 데이터 입력하기.
				카드의 모양할당하기(for문)
				카드의 번호할당하기(for문)
				모양과 번호를 할당하는 (for문)
			- 52의 배열객체 중에서 랜덤 데이터 뽑아내기.(중복상관없이)
			- 중복하지 않고, 데이터를 섞어 만들고, 순서별로 카드를 만들어 돌리기
		
		cf) 알고리즘 연습의 단계
		1. 조건문 처리하기
			변수 중에 최대/최소값 뽑아내기
		2. 반복문 활용하기,
			아래와 같이 화면에 여러가지 출력형식 처리하기
			*****
			*
			***
			*****
		3. 배열 데이터를 처리하기.
			임의의 데이터 중에 가장 큰수/가장 작은 수 호출하기
			배열의 합산 처리하기
			배열의 데이터 중, 짝수/홀수만 출력하기
			배열의 데이터 짝수만 합산 처리하여 총계 처리하기
			
		4. 배열의 활용한 정렬 알고리즘 처리하기
			임의의 수를 할당하여
			순서로 정렬하기
			quick정렬
			버블정렬..
				
*/
	
}
class Card{
	int cardNum;
	String shape;
	Friend1 friend;
	void getName(Friend1 friend) {
		this.friend = friend;
	}
	void getCard() {
		String shapes[] = {"♠", "♣", "♥", "◈"};
		String numbers[] = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
		ArrayList cardDeck = new ArrayList();
		for(int idx=0;idx<shapes.length;idx++) {
			for(int jdx=0;jdx<numbers.length;jdx++) {
				cardDeck.add(shapes[idx]+numbers[jdx]);
			}
		}
		for(int cnt=1; cnt<=7;cnt++) {
			int index = (int)(Math.random()*52);
			System.out.println(friend.name+"님의 "+cnt+"번째 카드는: "+cardDeck.get(index));
		}
	}
	
	
}
class Friend1{
	String name;
	Friend1(String name){
		this.name = name;
	}
	void setName() {
		System.out.println(name+"님의 ");
	}
}















