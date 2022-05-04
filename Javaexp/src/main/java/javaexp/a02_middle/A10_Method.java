package javaexp.a02_middle;

public class A10_Method {
	
		
		// static은 객체 생성없이 사용할 수 공유메모리 영역의 속성을 사용할 떄,
		// 선언되는 키워드이다 - 클래스/객체에서 다시 언급
		// 1. 메서드의 구성요소
		//	1) 리턴 유형
		//	2) 매개변수
		//	3) 기능 프로세스 처리
		// 	4) 리턴값
		static String getName(String name) {
			name = name + "님^^";
			return name;
		}
		// 1. 리턴 유형은 해당 메서드를 통해서 리턴하는 값의 유형을 선언하는 것으로
		//		리턴값에 할당할 수 있는 유형으로 선언되어야 한다
		/*
		 ex) 사람의 말을 하는 경우 : 객체가 저장된 음성데이터를 조합해서 말을 한다
		 		결과물로 말이라는 것을 리턴한다.
		 	 사람이 뛰어 간다 : 객체가 특정 상황에 판단하여 행동양식으로 뛰어가는 것을 처리함
		 	 메서드는 저장/포르세스처리/결과정보를 나오게 하며
		 */
		static int getNum() {
			return 15;
		}
		
		
		static double getWeight() {
			return 30.5;
		}
		// ex) 
		static int getNum1() {
			return 211101;
		}
		
		static String getName1() {
			return "홍기동";
		}
		static double getWeight2() {
			return 75.24;
		}
		static int[] getArray() {
			// 배열이 리턴됨으로 한꺼번에 여러 데이터 처리
			return new int[] {2000,3000,4000};
		}
		
			public static void main(String[] args) {
			// TODO Auto-generated method stub
			String name01 = getName("신길동");
			System.out.println("메서드 처리후 결과값: "+name01);
			System.out.println("메서드 처리후 결과값: "+getName("심혜영"));
			System.out.println(getNum()+30);
			System.out.println("사원번호:"+getNum1());
			System.out.println("이름:"+getName1());
			System.out.println("몸무게"+getWeight2());
			
		}
}