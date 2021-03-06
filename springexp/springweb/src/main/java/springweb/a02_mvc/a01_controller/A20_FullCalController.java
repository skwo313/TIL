package springweb.a02_mvc.a01_controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import springweb.a02_mvc.a02_service.A10_FullCalService;
import springweb.vo.Calendar;

@Controller
public class A20_FullCalController {
	@Autowired
	private A10_FullCalService service;
	
	@GetMapping("calendar.do")
	public String calendar() {
		return "WEB-INF\\views\\a02_mvc\\a20_fullCalendar.jsp";
	}
	
	// http://localhost:7080/springweb/calList.do
	@RequestMapping("calList.do")
	public String calList(Model d) {
		d.addAttribute("calList", service.getCalendarList());	
		return "pageJsonReport";
	}
		
	@PostMapping("insertCalendar.do")
	   public String insertCalendar(Calendar ins) {
	      service.insCalendar(ins);
	      return "redirect:/calendar.do";
	   }
}
