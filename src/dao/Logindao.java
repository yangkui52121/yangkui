package dao;

import java.util.List;

import javax.sql.DataSource;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import javabean.Host;
import javabean.User;
import utils.DBCPUtils;

/* 
 * 用户登陆时所用的数据库操作类
 *  */
public class Logindao {
	public static DataSource ds=DBCPUtils.getDatasource();
	
	public boolean cheakhostLogin(String account,String password) {
		boolean flag=false;
		try {
			QueryRunner qr=new QueryRunner(ds);
			Object[]param= {account};    		  
  		    String sql="select * from host where hostaccount=?";
  		    List<Host>list=(List<Host>) qr.query(sql,new BeanListHandler(Host.class),param);
  		  if(list==null||list.size()==0) {
			  flag=false;
		  }else {
			  Host host=(Host)list.get(0);
			  if(host.getHostpassword().equals(password)) {
				  flag=true;
			  }else {
				  flag=false;
			  }
		  }
		}catch(Exception e) {
			e.printStackTrace();
		}
		return flag;
	}
	
	public boolean cheakuserhostLogin(String account,String password) {
		boolean flag=false;
		try {
			QueryRunner qr=new QueryRunner(ds);
			Object[]param= {account};    		  
  		    String sql="select * from user where useraccount=?";
  		    List<User>list=(List<User>) qr.query(sql,new BeanListHandler(User.class),param);
  		  if(list==null||list.size()==0) {
			  flag=false;
		  }else {
			  User user=(User)list.get(0);
			  if(user.getUserpassword().equals(password)) {
				  flag=true;
			  }else {
				  flag=false;
			  }
		  }
		}catch(Exception e) {
			e.printStackTrace();
		}
		return flag;
	}
}
