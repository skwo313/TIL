package a01_diexp;

import java.util.ArrayList;

import org.springframework.context.support.GenericXmlApplicationContext;

import a01_diexp.db.A03_EmpService;
import a01_diexp.db.Emp;


public class DIExp_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// DI(의존성 주입)을 위한 연습 환경 만들기..
		String path = "a01_diexp\\di13.xml";
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext(path);
		// 컨테이너에 객체의 생성과 설정을 확인할 수 있다.
		A03_EmpService service = ctx.getBean("service", A03_EmpService.class);
		ArrayList<Emp> emplist = service.empListPre("", "");
		System.out.println("총데이터건수:"+emplist.size());
		ctx.close();
	}

}
