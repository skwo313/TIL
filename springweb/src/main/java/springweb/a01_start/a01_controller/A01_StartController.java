package springweb.a01_start.a01_controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import springweb.a01_start.a02_service.A01_StartService;
// springweb.a01_start.a01_controller.A01_StartController
@Controller
public class A01_StartController {
	// http://localhost:7080/springweb/start.do
	
	// 현재 private A01_StartService service; 선언된 객체에 할당
	@Autowired
	private A01_StartService service;
	
	@RequestMapping("/start.do")
	public String start(Model d) {
		d.addAttribute("service", service.call());
		return "WEB-INF\\views\\a01_springStart.jsp";
	}
}
