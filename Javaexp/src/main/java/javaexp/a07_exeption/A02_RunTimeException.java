package javaexp.a07_exeption;

public class A02_RunTimeException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		# 실행예외 처리
		1. System.out.println(1/0);를 기준으로 예외 처리 해보세요
		 */
		try {	
		// 1. 예외 나올만한 코드를 수행한다.
		String []arry = {"홍길동", "김길동"};
		System.out.println(arry[2]);
		// 2. 예외 내용을 복사한다.
		// 3. try{}catch(복사한예외 e){}
		// 4. catch문 블럭안에 예외의 내용 기술: e.getMessage(): 예외의 내용을 알 수 있는 메시지 처리
		// 5. 그 외 기본 형식 처리 finally{}
		}catch(ArrayIndexOutOfBoundsException e) {
			// 예외의 내용에 대한 api에서 지원하는 메서드
			System.out.println("# 예외 발생 #");
			System.out.println(e.getMessage());
		}finally {
			System.out.println("예외 내용 상관없이 처리할 내용");
		}
		System.out.println("종료");
		
		try {
			System.out.println(1/0);
		}catch(ArithmeticException e) {
			System.out.println("#예외#");
			System.out.println(e.getMessage());
		}finally {
			System.out.println("예외 내용 상관없이 처리할 내용");
		}
		System.out.println("종료");
	}

}
