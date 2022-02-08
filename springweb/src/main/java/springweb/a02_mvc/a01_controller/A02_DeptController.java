package springweb.a02_mvc.a01_controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import springweb.a02_mvc.a02_service.A02_DeptService;
import springweb.vo.Dept;
import springweb.vo.Emp;

@Controller
public class A02_DeptController {
	@Autowired
	private A02_DeptService service;
	
	@RequestMapping("/deptList.do")
	public String DeptList(Dept sch, Model d){
		d.addAttribute("dlist", service.getDeptList(sch));
		return "WEB-INF\\views\\a02_mvc\\a10_deptList.jsp";
	}
	@RequestMapping("/insertDept.do")
	public String insertEmp(Dept ins, Model d){
		
		d.addAttribute("proc","등록완료");
		service.insertDept(ins);
		return "WEB-INF\\views\\a02_mvc\\a10_deptList.jsp";
	}	
}
