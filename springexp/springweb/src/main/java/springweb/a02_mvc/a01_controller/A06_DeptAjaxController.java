package springweb.a02_mvc.a01_controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import springweb.a02_mvc.a02_service.A02_DeptService;
import springweb.vo.Dept;

@Controller
public class A06_DeptAjaxController {
	@Autowired
	private A02_DeptService service;
	
	// http://localhost:7080/springweb/deptAjax.do
	@GetMapping("/deptAjax.do")
	public String deptAjaxFrm() {
		return "WEB-INF\\views\\a02_mvc\\a06_deptAjaxList.jsp";
	}
	@GetMapping("/deptAjax01.do")
	public String deptAjax(Dept sch, Model d) {
		d.addAttribute("dList", service.getDeptList(sch));
		return "pageJsonReport";
	}
}
