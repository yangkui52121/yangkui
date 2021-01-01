package service;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Cheakandbuydao;
import javabean.Pet;

/**
 * Servlet implementation class Cheakandbuyservlet
 */
@WebServlet("/Cheakandbuyservlet")
public class Cheakandbuyservlet extends HttpServlet {
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
 	    
 	    Cheakandbuydao dao=new Cheakandbuydao();
 	    
 	    List<Pet>list=dao.chaekMea(petname);
 	    
 	    Pet pet=list.get(0);
 	    
 	    request.getSession().setAttribute("pet", pet);
 	    
 	    response.sendRedirect("cheakandbuy.jsp");
	}

}
