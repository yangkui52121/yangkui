package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Purchaselaterdao;

/**
 * Servlet implementation class Purchaselaterservlet
 * 用于保存宠物收益以及宠物已购数量
 */
@WebServlet("/Purchaselaterservlet")
public class Purchaselaterservlet extends HttpServlet {
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
 	    
 	    String username=request.getParameter("username");
 	    String upetname=request.getParameter("upetname");
 	    int upetnum=Integer.parseInt(request.getParameter("upetnum"));
 	    
 	    Purchaselaterdao dao=new Purchaselaterdao();
 	    
 	    int x=dao.petproIsexist(username);
 	    //存储收益表
 	    dao.purchasePetprofit(upetname, x);
 	    //存储销售数量
 	    dao.petSale(upetname, x);
 	    //存储已购宠物
 	    dao.purchasedPet(username, upetname, x);
 	    
 	    //重定向到购买成功页面
 	    response.sendRedirect("purchasepet.jsp");
	}

}
