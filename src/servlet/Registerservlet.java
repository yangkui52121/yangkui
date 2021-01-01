package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Registerdao;

/**
 * Servlet implementation class Registerservlet
 */
@WebServlet("/Registerservlet")
public class Registerservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
 	    response.setContentType("text/html;charset=UTF-8");
 	    
 	     PrintWriter out=response.getWriter();
 	     
 	    String hostaccount=request.getParameter("hostaccount");
 	    String hostpassword=request.getParameter("hostpassword");
 	    String hostID=request.getParameter("hostID");
 	    String hostsex=request.getParameter("hostsex");
 	    String hostyear=request.getParameter("hostyear");
 	    String hosttelephone=request.getParameter("hosttelephone");
 	    
 	    String shenfen=request.getParameter("select");
 	    
 	   if(shenfen.equals("1")) {
 		   Registerdao dao=new Registerdao();
 		  boolean x = dao.isExist(hostaccount);
 		 if(x==false) { 	    	
  	    	response.sendRedirect("register.jsp");
  	    	
  	        }else {
  	    	dao.Save(hostaccount, hostpassword, hostID, hostsex, hostyear, hosttelephone);
  	    	response.sendRedirect("registersuc.jsp");
  	    	 }
 	   }else if(shenfen.equals("2")){
 		  Registerdao dao=new Registerdao();
 		 boolean x=dao.isuserExist(hostaccount);
 		if(x==false) { 	    	
  	    	response.sendRedirect("register.jsp"); 	    	
  	        }else {
  	        	dao.UserSave(hostaccount, hostpassword, hostID, hostsex, hostyear, hosttelephone);
  	        	response.sendRedirect("registersuc.jsp");
  	        }
 	   }
	}

}
