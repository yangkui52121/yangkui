package dao;

import java.util.List;

import javax.sql.DataSource;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import javabean.Host;
import javabean.User;
import utils.DBCPUtils;

/* 
 * �����û�ע��Ĳ�����
 * */
public class Registerdao {
	public static DataSource datasource = DBCPUtils.getDatasource();
	
	//�����ݿ���ӹ���Աע�����Ϣ
	public void Save(String hostaccount,String hostpassword,
			 String hostID,String hostsex,String hostyear,String hosttelephone) {
		try {
				QueryRunner qr=new QueryRunner(datasource);
				String sql="insert into host(hostaccount,hostpassword,hostID,hostsex,hostyear,hosttelephone) values(?,?,?,?,?,?)";
				Object[] param= {hostaccount,hostpassword,hostID,hostsex,hostyear,hosttelephone};
				int flag=qr.update(sql,param);
				if(flag>0) {
					   System.out.println("��ӳɹ�");
				   }else {
					   System.out.println("���ʧ��");
				   }
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	//�����˺��Ƿ��Ѿ���ע��
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
					   System.out.println("��ӳɹ�");
				   }else {
					   System.out.println("���ʧ��");
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
