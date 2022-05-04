package javaexp.a05_servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class A01_Controller
 */
@WebServlet(name = "mvc.do", urlPatterns = { "/mvc.do" })
public class A01_Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public A01_Controller() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// 1. 요청값.. q=mvc+패턴
		String schKeyword = request.getParameter("q");
		// 2. 모델데이터 : DB서버 접속..
		request.setAttribute("modelData", "DB에서 검색해온 데이터");
		// 3. view단을 호출..
		// 	위 요청값에 따라서 출력할 화면을 결정할 수 있다
		String page = "a05_comp\\\\a09_mvc_view.jsp";
		RequestDispatcher rd = request.getRequestDispatcher(page);
		rd.forward(request, response);
		
		// # controller
		// 1. 요청값 처리
		
		// 2. model 데이터 처리
		request.setAttribute("show", "안녕하세요(모델데이터)" );
		
		
		// 3. view단 호출
		String viewPage = "a05_comp\\a09_mvc_view.jsp";
		RequestDispatcher rd2 = request.getRequestDispatcher(viewPage);
		rd2.forward(request, response);
	}

}
