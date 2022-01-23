package javaexp.a00_exp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int T = Integer.parseInt(br.readLine());
			for(int i=1;i<=T;i++) {
				int A = Integer.parseInt(br.readLine());
				int B = Integer.parseInt(br.readLine());
				System.out.println(A+B);
			}
		} catch (IOException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}
}

