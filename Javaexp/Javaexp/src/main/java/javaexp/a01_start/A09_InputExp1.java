package javaexp.a01_start;

import java.util.Scanner;

public class A09_InputExp1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("좋아하는 과일을 입력하세요: ");
		String name = sc.nextLine();
		System.out.println("입력한 과일명: "+name);
		System.out.print("가격을 입력하세요: ");
		int price = sc.nextInt();
		System.out.println("입력된 과일가격: "+ price);
		System.out.print("갯수를 입력하세요: ");
		int cnt = sc.nextInt();
		System.out.println("입력된 과일갯수: "+ cnt);
		
	}

}
