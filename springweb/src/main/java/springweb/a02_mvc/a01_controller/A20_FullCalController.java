package springweb.a02_mvc.a01_controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class A20_FullCalController {
	@GetMapping("calendar.do")
	public String calendar() {
		return "WEB-INF\\views\\a02_mvc\\a20_fullCalendar.jsp";
	}
}
