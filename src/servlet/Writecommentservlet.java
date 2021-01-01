package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Writecommentdao;

/**
 * Servlet implementation class Writecommentservlet
 * �û���д���ۣ�
 */
@WebServlet("/Writecommentservlet")
public class Writecommentservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
 	    response.setContentType("text/html;charset=UTF-8");
 	    
 	    String petname=request.getParameter("petname");
 	    String petcomment=request.getParameter("petcomment");
 	    
 	    Writecommentdao dao=new Writecommentdao();
 	    
 	    dao.saveComment(petname, petcomment);
 	    
 	    response.sendRedirect("Writecomment.jsp");
	}

}
