package springweb.a01_start.a01_controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import springweb.vo.Person;
import springweb.vo.Player;

// springweb.a01_start.a01_controller.A05_ModelCtrl
@Controller
public class A05_ModelCtrl {
	
	@RequestMapping("/modelExp1.do")
	public String modelExp1(Model d) {
		// # model 처리
		// 1. view단에 전달할 핵심 데이터로, 문자열, 객체를 통해서 전달가능하다.
		// 2. .addAttribute("모델명","설정값") 형식을 처리한다.
		d.addAttribute("var01","변수1"); // 뷰단에서 호출 ${var01}
		d.addAttribute("var02",30); // ${var01} ${var02+20}
		d.addAttribute("obj01",new Person("홍길동",25,"방배동"));
		// ${obj01.name}  ${obj01.age}  ${obj01.loc}
		return "WEB-INF\\views\\a05_modelexp1.jsp";
	}
	
	@RequestMapping("/modelExp2.do")
	public String modelExp2(Model d) {
		d.addAttribute("pname", "사과");
		d.addAttribute("price", 3000);;
		d.addAttribute("cnt", 3);
		d.addAttribute("playerObj", new Player("홍길동", 1));
		return "WEB-INF\\views\\a06_modelExp2.jsp";
	}
}
