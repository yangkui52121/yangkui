package servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Updateuserpassdao;
import javabean.User;



/**
 * Servlet implementation class Updateuserpassservlet
 * �û��޸�����
 */
@WebServlet("/Updateuserpassservlet")
public class Updateuserpassservlet extends HttpServlet {
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
 	    
 	    String useraccount=request.getParameter("useraccount");
 	   String userpassword=request.getParameter("userpassword");
 	  String userID=request.getParameter("userID");
 	    
 	    Updateuserpassdao dao=new Updateuserpassdao();
 	    
 	    List<User>list=dao.isExist(userID);
 	    //���
 	    int x=0;
 	    if(list==null||list.size()==0) {
 	    	//��ת��ʧ��ҳ��
 	    	response.sendRedirect("updatepassdf.jsp");
 	    }else {
 	    	for(int i=0;i<list.size();i++) {
 	    		if(list.get(i).getUserID().equals(userID)) {
 	    			x=1;
 	    			break;
 	    		}else {
 	    			x=0;
 	    		}
 	    	}
 	    		if(x==1) {
 	    			//��ת���ɹ�ҳ��
 	    			dao.updatePassword(useraccount, userpassword);
 	    			response.sendRedirect("updatepasssuc.jsp");
 	    		}else {
 	    			//��ת��ʧ��ҳ��
 	    			response.sendRedirect("updatepassdf.jsp");
 	    		}
 	    	
 	    		
 	    }
 	    
 	    
	}

}
