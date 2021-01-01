package servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Salehotdao;
import javabean.Petsale;

/**
 * Servlet implementation class Salehotservlet
 */
@WebServlet("/Salehotservlet")
public class Salehotservlet extends HttpServlet {
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
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");
 	    response.setContentType("text/html;charset=UTF-8");
 	    
 	    String select=request.getParameter("saleselect");
 	    
 	    Salehotdao dao=new Salehotdao();
 	    
 	    List<Petsale>list=dao.sortPetsaleASC(select);
 	    
 	    if(list==null||list.size()==0) {
 	    	//Ìø×ªµ½Ê§°ÜÒ³Ãæ
 	    	response.sendRedirect("salehotdf.jsp");
 	    }else {
 	    	Petsale ps=list.get(0);
 	 	    
 	 	    request.getSession().setAttribute("sale",ps );
 	 	  response.sendRedirect("salehot.jsp");
 	    }
 	    
	}

}
