package a01_diexp;

import org.springframework.context.support.GenericXmlApplicationContext;

import a01_diexp.vo3.Person;
import a01_diexp.vo3.Student;


public class DIExp_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// DI(의존성 주입)을 위한 연습 환경 만들기..
		String path = "a01_diexp\\di12.xml";
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext(path);
		// 컨테이너에 객체의 생성과 설정을 확인할 수 있다.
		Student stud = ctx.getBean("stud", Student.class);
		System.out.println(stud.getName());
		System.out.println(stud.getKor());
		System.out.println(stud.getEng());
		System.out.println(stud.getMath());
		
		// msg 파일에 Person 클래스
		Person p01 = ctx.getBean("person", Person.class);
		System.out.println(p01.getName());
		System.out.println(p01.getAge());
		System.out.println(p01.getLoc());
		ctx.close();
	}

}
