package jspexp.a02_mvc.a01_controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class A01_controller
 */
@WebServlet(name = "ajaxMvc01.do", urlPatterns = { "/ajaxMvc01.do" })
public class A04_ControllerAjax extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public A04_ControllerAjax() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// 1. 요청값 처리..
		request.setCharacterEncoding("UTF-8");
		//	
		
		// 2. model 데이터 처리
		
		// 3. view단 호출 처리..
		//		1) out객체로 출력 처리..
		//			response 객체는 client단에 전달하는 객체로 기능메서드 getWriter()를 통해서
		//			화면을 출력하는 PrintWriter 객체를 리턴한다.
		
		// 한글 데이터 출력
		response.setCharacterEncoding("UTF-8"); 
		response.setContentType("text/html; charset=UTF-8");
		// 출력할 내용의 한글 처리..
		PrintWriter out = response.getWriter();
//		{"name":"홍길동", "age": 25, "loc": "신림동"}
		out.print("{\"name\":\"홍길동\", \"age\":25, \"loc\": \"신림동\"}");
//		out.print("hello! 안녕하세요!");
		
		//		2) jsp를 호출(연동)
		/*
		String page="a01_begin\\a30_mvc01.jsp";	// 이동할 경로와 jsp파일..
		// 요청객체와 반응객체와 함께 넘길 jsp 페이지 호출
		RequestDispatcher rd = request.getRequestDispatcher(page);
		rd.forward(request, response);
		*/
	}

}
