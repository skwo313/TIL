package javaexp.a01_start;

public class A06_If {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		# 조건문..
		1. if(비교연산자)
		*/
		int inputPoint = 60;
		System.out.println("입력한 점수:"+inputPoint);
		if(inputPoint>=70) {
			//비교연산자의 결과가 true일 떄만 해당 내용을 수행처리..
			System.out.println("통과!");
		}
		System.out.println("처리 끝!");
		/*
		2. if(비교연산자){
				비교 연산자가 true일 때, 처리할 부분..
			}else{
				비교 연산자가 false일 떄, 처리할 부분..
			}
		 */
		int age = 25;
		System.out.println("입력한 나이:"+age);
		if(age>=18) {
			System.out.println("성인입니다!");
		}else {
			System.out.println("미성년입니다!");
		}
		// ex)
		int price = 3000;
		int cnt = 2;
		int tot = price*cnt;
		if(tot>=10000) {
			System.out.println("총합 "+tot+"원이므로 10% 할인으로"+(int)(tot*0.9)+"원입니다");
		}else {
			System.out.println("총합 "+tot+"원이므로 5% 할인으로"+(int)(tot*0.95)+"원입니다");
		}
	}
}
