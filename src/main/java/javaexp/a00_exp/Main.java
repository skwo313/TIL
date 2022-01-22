package javaexp.a00_exp;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int units = B%10;
		int tens = ((B%100)-units)/10;
		int hundreds = (B-(B%100))/100;
		System.out.println(A*units);
		
	}
}

