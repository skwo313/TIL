package javaexp.a01_start;

import java.util.Scanner;

public class A08_Input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		# 자바의 입력데이터 처리 방식
//		1. Scanner를 활용
//		2. 기본코드
//			Scanner sc = new Scanner(System.in);
//			Scanner : 입력을 처리해주는 객체
//			Scanner.in : 자바에서 console창에 입력되는 내용을 stream형식으로 받아서
//			처리하는 기본 객체인 InputStream을 말한다
//			sc.nextLine() : enter키를 입력시까지 데이터를 받아들인다
//			sc.nextInt(): 정수형 데이터를 입력 받는다
//			sc.nextDouble(): 실수형 데이터를 입력 받는다
		Scanner sc = new Scanner(System.in);
		System.out.println("이름을 입력하세요");
		String name = sc.nextLine();
		System.out.println("입력한 이름은 "+name);
		
		// A09_InputExp.java를 만들고 좋아하는 
	}

}
