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
@WebServlet(name = "ajaxMvc03.do", urlPatterns = { "/ajaxMvc03.do" })
public class A06_Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public A06_Controller() {
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
		String pname = request.getParameter("pname"); 
		if(pname==null) pname=""; // 요청값이 없을 때, 공백
		int price=0, cnt= 0;
		String priceS = request.getParameter("price"); 
		if(priceS!=null) price = Integer.parseInt(priceS); //데이터 입력값이 있을 때, 숫자형 변환
		String cntS = request.getParameter("cnt");
		if(cntS!=null) cnt = Integer.parseInt(cntS);
		int tot =price*cnt;
		
		// 2. model 데이터 처리
		
		// 3. view단 호출 처리..
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		// {"pname":"사과", "price":3000, "cnt":3}
		// {"id" : "id", "pass":"pass", "result":"result"}
		out.print("{\"pname\":\""+pname+"\", \"tot\":"+tot+"}");
		
	}

}
