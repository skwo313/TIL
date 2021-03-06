package jspexp.a02_mvc.a01_controller.ajax;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jspexp.a04_member.Member_DAO;
import jspexp.a04_member.Member_VO;

/**
 * Servlet implementation class A11_CheckId
 */
@WebServlet(name = "CheckIdMvc.do", urlPatterns = { "/CheckIdMvc.do" })
public class A11_CheckId extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public A11_CheckId() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// 1. 요청값
		request.setCharacterEncoding("utf-8");
		String id = request.getParameter("id"); if(id==null) id="";
		
		// 2. DAO연결, id가 있는지 확인
		Member_DAO dao = new Member_DAO();
		Member_VO m = dao.getMember(id);
		
		// 3. 전달할 keyword, json
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html; utf-8");
		PrintWriter out = response.getWriter();
		if(!id.equals("") && m==null) {
			out.print("Y");
		}else {
			out.print("N");
		}
	}

}
