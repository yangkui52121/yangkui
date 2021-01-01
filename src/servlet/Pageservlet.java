package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import javabean.Pagebean;
import javabean.Pet;
import service.Petservice;

/**
 * Servlet implementation class Pageservlet
 */
@WebServlet("/Pageservlet")
public class Pageservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
 	    response.setContentType("text/html;charset=UTF-8");
		
 	    String currpage=request.getParameter("currpage");
 	    
 	    int icurrpage=0;
 	    
 	    if(currpage!=null) {
 	    	icurrpage=Integer.parseInt(currpage);
 	    }else {
 	    	icurrpage=1;
 	    }
 	    
 	    Petservice petservice=new Petservice();
 	    
 	    Pagebean<Pet> pb=petservice.findPagebean(icurrpage);
 	    
 	    request.getSession().setAttribute("pb",pb);
 	    
 	    response.sendRedirect("cheackpet.jsp");
	}
		

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
    }
}
