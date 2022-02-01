package javaexp.a00_exp;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // 종류
		int K = sc.nextInt(); // 가치의 합
		
		ArrayList<Integer> array = new ArrayList<Integer>();
		int coin = 1;
		for(int i = 0; i<N; i++) {
			if(i == 0) {
				array.add(coin);
			}else if(i%2 == 1) {
				coin = coin*5;
				array.add(coin);
			} else {
				coin = coin*2;
				array.add(coin);
			}
		}
		for(int i = 0;i<array.size();i++) {
			if(array.get(i) < K && )
		}
	}
}

