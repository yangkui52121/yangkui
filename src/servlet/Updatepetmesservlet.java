package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Updatepetdao;

/**
 * Servlet implementation class Updatepetmesservlet
 */
@WebServlet("/Updatepetmesservlet")
public class Updatepetmesservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
 	    response.setContentType("text/html;charset=UTF-8");
 	    
 	    String petname=request.getParameter("petname");
 	    String pettype=request.getParameter("pettype");
 	    String petyear=request.getParameter("petyear");
 	    String petprice=request.getParameter("petprice");
 	    String petshape=request.getParameter("petshape");
 	    String petstatus=request.getParameter("pettype");
 	    
 	    Updatepetdao dao=new Updatepetdao();
 	    
 	    dao.updatePet(petname, pettype, petyear, petprice, petshape, petstatus);
 	    //跳转到成功页面
 	    response.sendRedirect("updatepetmessuc.jsp");
	}

}
