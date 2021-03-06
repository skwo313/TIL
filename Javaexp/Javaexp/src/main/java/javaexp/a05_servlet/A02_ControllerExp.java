package javaexp.a05_servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class A02_ControllerExp
 */
@WebServlet(name = "mvc2.do", urlPatterns = { "/mvc2.do" })
public class A02_ControllerExp extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public A02_ControllerExp() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// mvc2.do?kor=70&eng=80&math=90
		// 1. 요청
		String korS = request.getParameter("kor");
		String engS = request.getParameter("eng");
		String mathS = request.getParameter("math");
		int kor = 0;
		int eng = 0;
		int math = 0;
		// 요청값이 있을 떄, 형변환을 해서 데이터를 할당 처리..
		if(korS!=null) kor=Integer.parseInt(korS);
		if(engS!=null) eng=Integer.parseInt(engS);
		if(mathS!=null) math=Integer.parseInt(mathS);
		
		// 2. 모델
		request.setAttribute("kor", kor);
		request.setAttribute("eng", eng);
		request.setAttribute("math", math);
		request.setAttribute("tot", kor+eng+math);
		request.setAttribute("avg", (kor+eng+math)/3);
		
		// 3. view
		String viewPage = "a00_exp\\a05_1208.jsp";
		RequestDispatcher rd = request.getRequestDispatcher(viewPage);
		rd.forward(request, response);
		 
	}

}
