package javaexp.a01_start;

public class A07_Loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// # 반복문의 기본 형식
		// for(초기값선언;반복할조건;증감연산자){
		//
		//}
		for(int cnt=1;cnt<=19;cnt++) {
			System.out.println("카운트:"+cnt);
		}
		for(int cnt=10;cnt<=20;cnt++) {
			System.out.println("카운트:"+cnt);
		}
		// ex1)
		System.out.println("#30~50#");
		for(int cnt=30;cnt<=50;cnt++) {
			System.out.println("카운트:"+cnt);
		}
		// cnt -- : 감소 연산자
		// cnt>=90 : 90보다 클때까지..
		for(int cnt=100;cnt>=90;cnt--) {
			System.out.println(cnt+",");
		}
	}

}
