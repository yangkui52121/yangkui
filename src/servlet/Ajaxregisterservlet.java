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
 * Servlet implementation class Ajaxregisterservlet
 * ����˺��Ƿ��Ѵ���
 */
@WebServlet("/Ajaxregisterservlet")
public class Ajaxregisterservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
 	    response.setContentType("text/html;charset=UTF-8");
 	    
 	    String account=request.getParameter("hostaccount");
 	    
 	    System.out.println(account);
 	     int flag=0;
 	    
 	    Registerdao dao=new Registerdao();
 	    
 	    if(dao.isExist(account)==false||dao.isuserExist(account)==false) {
 	    	flag=1;
 	    }
 	     System.out.println(flag);
 	    PrintWriter writer = response.getWriter();
 	    writer.println(flag);
 	    writer.flush();
 	    writer.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
