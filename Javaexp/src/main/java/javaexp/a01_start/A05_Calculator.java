package javaexp.a01_start;

public class A05_Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 # 연산자
		 1. 데이터를 처리하여 결과를 산출하는 것을 말한다.
		 	연산자 : 연산에 사용되는 표지나 기호 (+,-,*,/,%,=,<=,++)
		 	피연산자 : 연산 대상이 되는 데이터(리터럴, 변수)
		 		30, 40, 50: ==> 리터럴 데이터
		 		int num01 = 25;
		 		num01 = 30; 
		 	연산식 : 연산자와 피연산자를 이용하여 연산의 과정을 기술하는 것
		 		int num01 = 30 + 25;
		 # 자바의 활용 연산자들
		 1. 산술연산자(사칙연산자와 나머지 연산자)
		  	1) 종류
		  	+,-,*,/,%
		  	% : 나눗셈의 나머지값
		  	2) 산술연산자를 처리하면 int형 이상에서 할당하여 처리할 수 있다.
		  	byte num01 = 25;
		  	byte num02 = 30;
		  	byte num03 = num01 + num02; (x)
		  	int num04 = num01 + num02;
		  	3) 나눗셈의 결과값이 소숫점이하가 되려면, 피연산자가 적어도 하나는 실수이어야 한다
		 	아니면, 항변환을 처리하여야 한다.
		 	10/3 ==> 3
		 	10/3.0 ==> 3.333
		 	10/(double)3 ==> 3.333
		 */
		int num01 = 25;
		int num02 = 5;
		// sysout + ctrl + space : 기본적인 출력 처리가 코드 생성.
		System.out.println(num01 + "+" + num02 + "=" + (num01+num02));
		// ()를 해주어야지 정상적인 연산 결과를 확인할 수 있따. -연산자 우선순위-
		// ex)
		int num03 = 30;
		int num04 = 20;
		System.out.println(num03 + "%" + num04 +"="+ (num03 % num04));
		// ex1
		int brd = 5;
		int frt = 3;
		System.out.println("곰돌이 1 먹은 총음식: " + brd + "+" + frt +"="+ (brd+frt));
		System.out.println("곰돌이 2 먹은 총음식: " + brd + "+" + frt +"="+ (brd+frt));
		System.out.println("총계: " + (brd+frt) + "+" + (brd+frt) +"="+ (brd+frt+brd+frt));
		// ex2)
		int tot = 1000000;
		int bus = 5000;
		int food = 7000;
		int totPay = bus + food;
		int rest = tot - totPay;
		System.out.println("전체금액:"+tot+", 소비금액:"+ totPay+", 현잔액:"+rest );
		
	}

}
