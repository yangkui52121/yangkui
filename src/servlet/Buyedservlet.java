package servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Buyeddao;
import javabean.Userpet;

/**
 * Servlet implementation class Buyedservlet
 */
@WebServlet("/Buyedservlet")
public class Buyedservlet extends HttpServlet {
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
 	    
 	    String upetname=request.getParameter("upetname");
 	   String username=request.getParameter("username");
 	    
 	    Buyeddao dao=new Buyeddao();
 	    List<Userpet>list=dao.purchasedPet(username,upetname);
 	    
 	    if(list==null||list.size()==0) {
 	    	response.sendRedirect("buyeddf.jsp");
 	    }else {
 	    	Userpet upet=list.get(0);
 	    	request.getSession().setAttribute("upet",upet);
 	 	    
 	 	    response.sendRedirect("buyedjsp.jsp");
 	    }
 	    
	}

}
