package springweb.a02_mvc.a01_controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import springweb.a02_mvc.a02_service.A01_EmpService;
import springweb.vo.Emp;

@Controller
public class A01_EmpController {
	
	@Autowired
	private A01_EmpService service;
	
	@RequestMapping("/empList.do")
	public String empList(Emp sch, Model d) {
		// service 객체에서 넘겨온 ArrayList<Emp>객체를 emplist라는
		// 이름으로 모델 데이터 선언하여, ${emplist}로 뷰단에서 쓸 수 있게
		// 해놓는다.
		d.addAttribute("emplist", service.getEmpList(sch));
		
		return "WEB-INF\\views\\a02_mvc\\a01_empList.jsp";
	}
	@RequestMapping("/emp.do")
	public String getEmpno(int empno, Model d){
		System.out.println("상세 empno:"+empno);
		d.addAttribute("emp",service.getEmp(empno));
		return "WEB-INF\\views\\a02_mvc\\a02_empDetail.jsp";
	}
	@RequestMapping("/uptEmp.do")
	public String uptEmp(Emp upt, Model d){
		d.addAttribute("proc", "수정완료");
		service.uptEmp(upt);
		// 수정된 내용을 기준으로 상세화면에 다시 확인하여야 하기에 아래와 같은 형식으로
		// forward 처리한다.
		return "WEB-INF\\views\\a02_mvc\\a02_empDetail.jsp";
	}
	@RequestMapping("/delEmp.do")
	public String delEmp(@RequestParam("empno") int empno, Model d){
		d.addAttribute("proc","삭제되었습니다");
		service.delEmp(empno);
		return "WEB-INF\\views\\a02_mvc\\a02_empDetail.jsp";
	}
}
