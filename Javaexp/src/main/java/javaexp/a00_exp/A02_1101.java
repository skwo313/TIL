package javaexp.a00_exp;

import java.util.Scanner;

public class A02_1101 {
	static int[] getArray() {
		return new int[] {2000,3000,4000};
	}
	static double getChangeType() {
		double num01 = 25; // promote(작은데이터가 큰데이터유형에 할당)
		return 35;
	}
	static double getChangeType2() {
		int num02 = (int)42.24; // casting(큰데이터를 작은데이터유형에 할당될떄는 casting)
//		int num02 = 42.24; // 바로 할당은 에러 발생
		return (int)45.24;
	}
	static int getInt2() {
		int num01 =25;
		num01+=3;
		return num01;
	}
	// 리턴값이 없는 경우에는
	// 1. 입력값을 통해서 저장
	// 2. 프로세스 처리
	// 3. 화면 출력 처리
	// ==> 리터유형 void를 쓴다. 마지막 라인에 return을 삭제..
	static void show() {
		System.out.println("출력하는 처리..(리턴값 필요없음)");
	}
	static void show2(int num01) {
		int sum =30;
		sum += num01;
		System.out.println("메서드에 입력된 값: "+num01);
		System.out.println("총합계:"+sum);
	}
	static void show3() {
		System.out.println("반갑습니다");
	}
	static void show4(String hello) {
		
		System.out.println(hello+"님 안녕하세요");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub;
		show();
		show2(25);
		show();
		show();
		show();
		show2(30);
		show2(50);
		show3();
		show4("홍길동");
		// 1) 
		//	기본입력 형식 코드: 
//		System.out.println("출력할문자열-줄바꿈포함");
//		System.out.println("문자열"+"문자열"); 
//		System.out.print("문자열"); // "줄바꿈없이 출력"
//		int tot = 100000;
//		String date = "11월 1일";
//		String incomeOrExd = "지출";
//		String contents = "커피 구매";
//		int price = 6000;
//		int remainPrice = tot - price;
//		System.out.println("날짜:"+ date + " 수입지출구분:"+incomeOrExd+" 내용:"+contents+" 금액:"+price+" 처리후잔액"+remainPrice);
		
		// 풀이
		// 1 변수지정
		int restMoney = 1000000;
		String date = null; // 객체의 경우 초기값을 null로 선언한다
		String div = null; // 수입지출구분
		String content = null;
		int money = 0;  // 숫자형 데이터 초기값을 0으로 선언한다
		// 2 Scanner객체 생성
		Scanner sc = new Scanner(System.in); 
		// 3 데이터 입력 처리 
		System.out.print("날짜를 입력하세요(MM/DD):");
		date = sc.nextLine();
		System.out.print("수입지출구분(수입/지출):");
		div = sc.nextLine();
		System.out.print("내역을 입력:");
		content = sc.nextLine();
		System.out.print("금액을 입력:");
		money = sc.nextInt();
		System.out.println(" # 처리 결과 # ");
		System.out.println("날짜\t구분\t내용\t금액\t잔액");
		System.out.print(date+"\t");
		System.out.print(div+"\t");
		System.out.print(content+"\t");
		System.out.print(money+"\t");
		//System.out.print(restMoney+"\t")
		// 조건으로 잔액의 증가 또는 감소 처리.
		// 문자열의 비교는 == (자바의 경우에는 문자열 비교시 문제 발생 경우), 
		// 문자열1.equals("문자열2")
		if(div.equals("수입")) {
			restMoney += money;
		}else {
			restMoney -= money;
		}
		System.out.print(restMoney+"\n");
		
		// 4 입력된 데이터를 출력형식에 맞게 출력 처리
		
		
		// 2)
//		() : 소괄호, 메서드나 생성의 매개변수를 선언/호출시
//			Person(String name){}
//			Person p = new Person("홍길동");
//		{} : 중괄호, 클래스명/생성자/매서드에 범위를 지정하고, 조건/반복문에서 주로 활용한다
//		[] : 대괄호, 배열을 선언하고, index별로 데이터를 저장 호출할 때 사용한다
//			String[] array = null;
//			array = new String[3];
//			array = new String[] {"사과","바나나","딸기"};
		// 3)
//		선언하고, 다시 데이터유형을 선언하고, 같은 이름으로 선언시 발생
//		에러 내용: duplicate local variables
//		-변수명을 중복되지 않게 변경
		// 4)
//		배열 선언 유형: 타입[] 변수, 타입 변수[]
//					String[] arry = null;
//					String arry2[] = new String[3];
//		배열 할당 유형: (1) 변수 선언과 동시에 값 목록 대입
//						데이터타입[] 변수 = {값1,값2,값3,....}
//					(2) 변수 선언 후 값 목록 대입
//					변수 = new 타입[]{값1,값2,값3....};
		// 5) 
		String singerName[] = {"김범수","나얼","박효신"};
		String musicTitle[] = {"보고싶다","바람기억","야생화"};
		System.out.println("이름\t노래제목");
		System.out.println(singerName[0]+"\t"+musicTitle[0]);
		System.out.println(singerName[1]+"\t"+musicTitle[1]);
		System.out.println(singerName[2]+"\t"+musicTitle[2]);
		// 6)
		int num05 = 5;
		num05++; // 1씩 증가
		num05 = num05 + 2; //현재 할당된 데이터에서 2를 더해서 다시 num05에 할당처리
		num05 += 3; // 간략히 했을 떄
		
		// 7) 배열의 크기를 넘어서서 index를 선언한다는 말이 어떤 경우인지 기술하세요
		
		int num99[]= new int[10]; // 10이 배열의 크기
//		System.out.println("11번째: "+ num99[11]); (x) 크기보다 큰 index를 선언했을 시 에러  
		// 8)
		// 
		String name01 = getName("홍길동");
		System.out.println("처리된 결과:"+name01);
		
		// 9) 상속의 기본형식을 기술하세요
		/*
		class 상위클래스 {
			구성요소
		}
		class 하위클래스 extends 상위클래스{
			
		}
		*/
		Soccer s1 = new Soccer();
		Goal g1 = new Goal();
		System.out.println(g1.playerName1+": "+g1.sonGoalCnt+"골!");
		System.out.println(g1.playerName2+": "+g1.hwangGoalCnt+"골!");
	}
	static String getName(String name){
		name = name + "님^^";
		return name;
	}
	
	
}

class Soccer {
	String playerName1 = "손흥민";
	String playerName2 = "황희찬";
}
class Goal extends Soccer {
	int sonGoalCnt = 2;
	int hwangGoalCnt = 1;
}
