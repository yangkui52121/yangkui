package servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Updatepetdao;
import javabean.Pet;

/**
 * Servlet implementation class Updatepetservlet
 */
@WebServlet("/Updatepetservlet")
public class Updatepetservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
 	    response.setContentType("text/html;charset=UTF-8");
 	    
 	    String petname=request.getParameter("petname");
 	    
 	    Updatepetdao dao=new Updatepetdao(); 	    
 	    List<Pet> x=dao.isExist(petname);
 	    Pet p=x.get(0);
 	    request.getSession().setAttribute("name",p);
 	    
 	    if(x.size()==0||x==null) {
 	    	//Ìø×ªµ½Ê§°ÜÒ³Ãæ
 	    	response.sendRedirect("updatepetmesdf.jsp");
 	    }else {
 	    	response.sendRedirect("updatepetmes.jsp");
 	    }
 	    
	}

}
