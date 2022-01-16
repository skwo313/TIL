package jspexp.a02_mvc.a01_controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class A05_Controller
 */
@WebServlet(name = "ajaxMvc02.do", urlPatterns = { "/ajaxMvc02.do" })
public class A05_Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public A05_Controller() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// 1. 요청값 처리..
		request.setCharacterEncoding("utf-8");
		//
		String id = request.getParameter("id");
		String pass = request.getParameter("pass");
		System.out.println("id:"+id);
		System.out.println("pass:"+pass);
		String result = "미인증";
		if(id!=null&&pass!=null) {
			if(id.equals("himan") && pass.equals("7777")) {
				result = "인증";
			}
		}
		
		// 2. model 데이터 처리
		
		// 3. view단 호출 처리..
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		// {"pname":"사과", "price":3000, "cnt":3}
		// {"id" : "id", "pass":"pass", "result":"result"}
		out.print("{\"id\" : \""+id+"\", \"pass\":\""+pass+"\", \"result\":\""+result+"\"}");
		
	}

}
