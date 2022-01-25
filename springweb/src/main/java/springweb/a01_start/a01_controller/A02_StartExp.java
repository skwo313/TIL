package springweb.a01_start.a01_controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class A02_StartExp {
	// springweb.a01_start.a01_controller.A02_StartExp
	// http://localhost:7080/springweb/start2.do?name=홍길동
	@RequestMapping("/start2.do")
	public String start2(@RequestParam("name") String name, Model d) {
		d.addAttribute("m01", "모델명:"+name);
		return "WEB-INF\\views\\a02_secondView.jsp";
	}
	
	// http://localhost:7080/springweb
	// 추가되는 주소 /gogo.do를 통해서 호출 된다.
	// url 호출  - http://localhost:7080/springweb/gogo.do
	@RequestMapping("/gogo.do")
	public String start() {
		return "WEB-INF\\views\\a03_show.jsp";
		// return ""; // view단 호출 부분.. view의 소스(jsp)
		// 의 기준경로인  springweb\src\main\webapp
		// 이후의 경로와 파일명을 적어준다.
	}
}
