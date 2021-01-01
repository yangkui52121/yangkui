package dao;

import java.util.List;

import javax.sql.DataSource;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import javabean.Host;
import javabean.User;
import utils.DBCPUtils;

/* 
 * 用于用户注册的操作类
 * */
public class Registerdao {
	public static DataSource datasource = DBCPUtils.getDatasource();
	
	//向数据库添加管理员注册的信息
	public void Save(String hostaccount,String hostpassword,
			 String hostID,String hostsex,String hostyear,String hosttelephone) {
		try {
				QueryRunner qr=new QueryRunner(datasource);
				String sql="insert into host(hostaccount,hostpassword,hostID,hostsex,hostyear,hosttelephone) values(?,?,?,?,?,?)";
				Object[] param= {hostaccount,hostpassword,hostID,hostsex,hostyear,hosttelephone};
				int flag=qr.update(sql,param);
				if(flag>0) {
					   System.out.println("添加成功");
				   }else {
					   System.out.println("添加失败");
				   }
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	//检查该账号是否已经被注册
	public boolean isExist(String account) {
		boolean flag=false;
		try {
			Object[] param= {account};
			QueryRunner qr=new QueryRunner(datasource);
			String sql="select * from host where hostaccount=?";
			List<Host>list=(List<Host>)qr.query(sql, new BeanListHandler(Host.class),param);
			if(list==null||list.size()==0) {
				flag=true;
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return flag;
	}
	
	public void UserSave(String useraccount,String userpassword,
			 String userID,String usersex,String useryear,String usertelephone) {
		try {
				QueryRunner qr=new QueryRunner(datasource);
				String sql="insert into user(useraccount,userpassword,userID,usersex,useryear,usertelephone) values(?,?,?,?,?,?)";
				Object[] param= {useraccount,userpassword,userID,usersex,useryear,usertelephone};
				int flag=qr.update(sql,param);
				if(flag>0) {
					   System.out.println("添加成功");
				   }else {
					   System.out.println("添加失败");
				   }
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public boolean isuserExist(String account) {
		boolean flag=false;
		try {
			Object[] param= {account};
			QueryRunner qr=new QueryRunner(datasource);
			String sql="select * from user where useraccount=?";
			List<User>list=(List<User>)qr.query(sql, new BeanListHandler(User.class),param);
			if(list==null||list.size()==0) {
				flag=true;
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return flag;
	}
}
