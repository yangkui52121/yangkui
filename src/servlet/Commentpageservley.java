package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import javabean.Comment;
import javabean.Pagebean;
import javabean.Pet;
import service.Commentservice;
import service.Petservice;

/**
 * Servlet implementation class Commentpageservley
 */
@WebServlet("/Commentpageservley")
public class Commentpageservley extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
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
 	    
 	    Commentservice commentservice=new Commentservice();
 	    
 	    Pagebean<Comment> pb=commentservice.findPagebean(icurrpage);
 	    
 	    request.getSession().setAttribute("pb",pb);
 	    //..........
 	    response.sendRedirect("comment.jsp");
 	    //.........
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
