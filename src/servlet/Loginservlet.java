package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Logindao;

/**
 * Servlet implementation class Loginservlet
 */
@WebServlet("/Loginservlet")
public class Loginservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
 	    response.setContentType("text/html;charset=UTF-8");
 	    
 	    String account=request.getParameter("account");
 	    String password=request.getParameter("password");
 	    String x=request.getParameter("select");
 	    
 	    Logindao dao=new Logindao();
 	    
 	   if(x.equals("1")) {
	    	boolean flag=dao.cheakhostLogin(account, password);
	    	if(flag==false) {
	    		System.out.println("返回登陆页面");
	    		response.sendRedirect("logindf.jsp");
	    	}else {
	    		System.out.println("进入主页面");
	    		response.sendRedirect("hostmain.jsp");
	    	}
	    }else if(x.equals("2")) {
	    	boolean flag=dao.cheakuserhostLogin(account, password);
	    	if(flag==false) {
	    	System.out.println("返回登陆页面");
    		response.sendRedirect("logindf.jsp");
	    	}else {
	    		System.out.println("进入主页面");
	    		response.sendRedirect("usermain.jsp");
	    	}
	    }
	}

}
