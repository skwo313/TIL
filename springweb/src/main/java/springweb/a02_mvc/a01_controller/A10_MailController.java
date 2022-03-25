package springweb.a02_mvc.a01_controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import springweb.a02_mvc.a02_service.A10_MailService;
import springweb.vo.Mail;

@Controller
public class A10_MailController {
	@Autowired
	private A10_MailService service;
	
	@RequestMapping( value= "mailFrm.do", method = RequestMethod.GET)
	public String mailFrm() {
		return "WEB-INF\\views\\a02_mvc\\a10_mailForm.jsp";
	}
	
	@RequestMapping( value = "mailSend.do", method = RequestMethod.POST)
	public String mailSend(Mail mail, Model d) {
		
		d.addAttribute("msg", service.sendMail(mail));
		return "WEB-INF\\views\\a02_mvc\\a10_mailForm.jsp";
	}
}
