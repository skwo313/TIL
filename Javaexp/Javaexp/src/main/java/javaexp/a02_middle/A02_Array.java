package javaexp.a02_middle;

public class A02_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 배열의 선언, 
		int[] array;
		// 배열의 객체 생성 : 정수형 3개가 데이터로 할당할 수 있는 배열 객체 생성..
		array = new int[3];
		// 0부터 시작하는 index별로 배열의 데이터 할당
		array[0] = 25;
		array[1] = 30;
		array[2] = 40;
		System.out.println("배열에 할당한 데이터: " + array[0]);
		System.out.println("배열에 할당한 데이터: " + array[1]);	
		System.out.println("배열에 할당한 데이터: " + array[2]);
		
		int[] points;
		points = new int[3];
		points[0] = 70;
		points[1] = 80;
		points[2] = 90;
		System.out.println("국어점수: " + points[0]);
		System.out.println("영어점수: " + points[1]);
		System.out.println("수학점수: " + points[2]);
	}

}
