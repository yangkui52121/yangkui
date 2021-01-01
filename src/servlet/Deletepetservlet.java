package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Deletpetdao;

/**
 * Servlet implementation class Deletepetservlet
 */
@WebServlet("/Deletepetservlet")
public class Deletepetservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
 	    response.setContentType("text/html;charset=UTF-8");
 	    
 	    String petname=request.getParameter("petname");
 	    
 	    Deletpetdao dao=new Deletpetdao();
 	    
 	    boolean x=dao.isExist(petname);
 	    
 	    if(x==true) {
 	    	response.sendRedirect("returndeletpet.jsp");
 	    }else {
 	    	dao.deletPet(petname);
 	    	response.sendRedirect("returndeletpetsuc.jsp");
 	    }
	}

}
