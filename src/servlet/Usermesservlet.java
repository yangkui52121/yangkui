package servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Usermesdao;
import javabean.User;

/**
 * Servlet implementation class Usermesservlet
 */
@WebServlet("/Usermesservlet")
public class Usermesservlet extends HttpServlet {
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
 	    
 	    String useraccount=request.getParameter("useraccount");
 	    
 	    
 	    Usermesdao dao=new Usermesdao();
 	    
 	    List<User>list=dao.cheakAll(useraccount);
 	    
 	    User user=list.get(0);
 	  
 	    request.getSession().setAttribute("user", user);
 	    
 	    response.sendRedirect("cheakusermes.jsp");
 	   	    
	}

}
