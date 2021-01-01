package servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Shouyidao;
import javabean.Petprofit;

/**
 * Servlet implementation class Shouyiservlet
 */
@WebServlet("/Shouyiservlet")
public class Shouyiservlet extends HttpServlet {
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
 	    
 	    Shouyidao dao=new Shouyidao();
 	    
 	    List<Petprofit>list=dao.getProfit(petname);
 	    
 	    if(list==null||list.size()==0) {
 	    	
 	    	response.sendRedirect("hostmain.jsp");
 	    }else {
 	    	  Petprofit pro=list.get(0);
 	    	  
 	    	  request.getSession().setAttribute("pet", pro);
 	    	  
 	    	  response.sendRedirect("shouyi.jsp");
 	    }
	}

}
