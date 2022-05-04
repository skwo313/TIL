package javaexp.a01_start;

import java.util.Scanner;

public class A09_InputExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("좋아하는 과일을 입력하세요: ");
		String name = sc.nextLine();
		System.out.println("입력한 과일명: "+name);
		System.out.print("나이를 입력하세요:");
		int age = sc.nextInt();
		System.out.println("나이: "+ age);
		System.out.print("몸무게를 입력하세요:");
		double weight = sc.nextDouble();
		System.out.println("몸무게: "+ weight);
		
		
		
	}

}
