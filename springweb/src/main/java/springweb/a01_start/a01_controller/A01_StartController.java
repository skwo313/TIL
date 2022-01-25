package springweb.a01_start.a01_controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
// springweb.a01_start.a01_controller.A01_StartController
@Controller
public class A01_StartController {
	// http://localhost:7080/springweb/start.do
	@RequestMapping("/start.do")
	public String start() {
		return "WEB-INF\\views\\a01_springStart.jsp";
	}
}
