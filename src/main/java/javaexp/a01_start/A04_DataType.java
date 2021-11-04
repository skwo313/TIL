package javaexp.a01_start;

public class A04_DataType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 1. 정수형과 실수형 데이터 처리
		 2. char 유형의 변경..
		 */
		int num01 = 25;
		double num02 = 30.45;
		System.out.println("정수형 데이터: "+ num01);
		System.out.println("실수형 데이터: "+ num02);
		char ch01 = 'A'; //홀따옴표로 문자 한자를 할당할 수 있다
		System.out.println("문자형 데이터: "+ ch01);
		// char ==> char[](문자열) ==> String 문자열객체 사용..
		int code01 = 66;
		char ch02 = (char)code01; // int형의 값을 유형변경으로 char로
		// 할당하면 해당 코드값에 연결된 문자가 할당할 수 있다.
		System.out.println(code01+"의 문자: "+ ch02);
		
		String name = "홍길동";
		int score01 = 90;
		int score02 = 94;
		int score03 = 98;
		int sum = score01 + score02 + score03;
		double aver = sum/3;
		
		System.out.println("학생 이름: "+ name);
		System.out.println("국어: "+ score01);
		System.out.println("영어: "+ score02);
		System.out.println("수학: "+ score03);
		System.out.println("총점: "+ sum);
		System.out.println("평균: "+ aver);
		
		// ex2)
		int applePrice = 3000;
		int appleCnt = 2;
		int appleTot = applePrice*appleCnt;
		int bananaPrice = 4000;
		int bananaCnt = 3;
		int bananaTot = bananaPrice*bananaCnt;
		int strawberryPrice = 12000; 
		int strawberryCnt = 5;
		int strawberryTot = strawberryPrice*strawberryCnt;
		int tot = appleTot + bananaTot + strawberryTot;
		
		System.out.println("총비용: "+ tot);				
	}
	

}
