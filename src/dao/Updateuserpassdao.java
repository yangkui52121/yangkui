package dao;

import java.util.List;

import javax.sql.DataSource;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import javabean.User;
import utils.DBCPUtils;

public class Updateuserpassdao {
	public static DataSource ds=DBCPUtils.getDatasource();
	
	public void updatePassword(String useraccount,String password) {
		try {
		QueryRunner qr=new QueryRunner(ds);
		String sql="update user set userpassword=? where useraccount=?";
		qr.update(sql,password,useraccount);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public List<User> isExist(String userID){
		 List<User>list=null;
		try {
			QueryRunner qr=new QueryRunner(ds);
			String sql="select * from user where userID=?";
			list=(List<User>)qr.query(sql, new BeanListHandler(User.class),userID);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return list;
	}

}
