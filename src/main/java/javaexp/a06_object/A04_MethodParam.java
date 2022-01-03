package javaexp.a06_object;

public class A04_MethodParam {
	static void paraInt(int num01) {
		System.out.println("입력된 데이터1:"+num01);
	}
	static void paraInt2(int num01, int num02) {
		System.out.println("입력된 데이터1:"+num01);
		System.out.println("입력된 데이터2:"+num02);
		System.out.println("입력된 데이터 합산:"+(num01+num02));
	}
	static void paraDbl3(double num01) {
		System.out.println("입력되는 데이터:"+num01);
	}
	
	
	public static void main(String args[]) {
		paraInt(25);
		paraInt2(27,30);
		double num01 = 5;
		paraDbl3(num01);
		paraDbl3(25.7);
		/*
		# 기능메서드 매개변수처리 연습
		1. 기능메서드는 외부에서 호출할 떄, 입력되는 데이터의 타입과
			갯수에 따라서 매개변수를 선언하여 활용할 수 있다.
		2. 기본형식
			리턴유형 메서드명(매개변수1, 매개변수2...){
			
			}
		3. 연습예제
			static void : 객체생성없이 활용되고, 리턴값 처리를 하지 않아도 
			되는 메서드 선언..
		 */
		//ex)
		ParamExpObj po = new ParamExpObj();
		po.paramBoolean(25>=3);
		po.paramBoolean(true);
		po.paramInt(30);
		po.paramChar('A');
		po.paramChar((char)66);
		po.calMethod(25, 5);
	}
}
class ParamExpObj{
	static void show00(boolean b, int num01, char c) {
		System.out.println("입력된 데이터1:"+b);
		System.out.println("입력된 데이터2:"+num01);
		System.out.println("입력된 데이터3:"+c);
	}
	void paramBoolean(boolean b) {
		System.out.println("입력된 데이터1:"+b);
	}
	void paramInt(int num01) {
		System.out.println("입력된 데이터1:"+num01);
	}
	void paramChar(char c) {
		System.out.println("입력된 데이터1:"+c);
	}
	void calMethod(int num01, int num02) {
		System.out.println(num01+" + "+ num02 +" = "+(num01+num02));
		System.out.println(num01+" - "+ num02 +" = "+(num01-num02));
		System.out.println(num01+" X "+ num02 +" = "+(num01*num02));
		System.out.println(num01+" / "+ num02 +" = "+(num01/num02));
	}
}
