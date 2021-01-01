package dao;

import java.util.List;

import javax.sql.DataSource;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import javabean.User;
import utils.DBCPUtils;

public class Usermesdao {
      public static DataSource ds=DBCPUtils.getDatasource();
      
      public List<User> cheakAll(String useraccount){  
    	  List<User>list=null;
    	  try {
    		  QueryRunner qr=new QueryRunner(ds);
    		  String sql="select * from user where useraccount=?";
    		  Object[]param= {useraccount};
    		  list=(List<User>)qr.query(sql, new BeanListHandler(User.class),param);  		  	  
    	  }catch(Exception e) {
    		  e.printStackTrace();
    	  }
    	  return list;
      }
}
