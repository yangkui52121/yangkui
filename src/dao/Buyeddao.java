package dao;

import java.util.List;

import javax.sql.DataSource;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import javabean.Userpet;
import utils.DBCPUtils;

public class Buyeddao {
      public static DataSource ds=DBCPUtils.getDatasource();
      
      public List<Userpet> purchasedPet(String username,String upetname){
    	  List<Userpet>list=null;
    	  try {
    		  QueryRunner qr=new QueryRunner(ds);
    		  String sql="select * from userpet where username=? and upetname=?";
    		  list=(List<Userpet>)qr.query(sql, new BeanListHandler(Userpet.class),username,upetname);
    		  
    	  }catch(Exception e) {
    		  e.printStackTrace();
    	  }
    	  
    	  return list;
      }
}
