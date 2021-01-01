package utils;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSourceFactory;

public class DBCPUtils {
      public static DataSource ds=null;
      static {
    	  try {
    		  Properties prop=new Properties();
    		  prop.load(DBCPUtils.class.getClassLoader().getResourceAsStream("config/db.properties"));
    		  ds=BasicDataSourceFactory.createDataSource(prop);
    	  }catch(Exception e) {
    		  throw new ExceptionInInitializerError("DBCP初始化异常，请检查配置文件！！！");
    	  }
      }
      
      public static DataSource getDatasource() {
    	  return ds;
      }
      
      public static Connection getConnection() {
   	   try {
   		   return ds.getConnection();
   	   }catch(SQLException e) {
   		   throw new RuntimeException("服务器忙。。。");
   	   }
      }
      
      public static void releaseALL(Connection conn, Statement ps, ResultSet rs) {
   	   if(conn!=null) {
   		   try {
   			   conn.close();
   		   }catch(Exception e) {
   			   e.printStackTrace();
   		   }
   	   }
   	   
   	   if(ps!=null) {
   		   try {
   			   ps.close();
   		   }catch(Exception e) {
   			   e.printStackTrace();
   		   }
   	   }
   	   
   	   if(rs!=null) {
   		   try {
   			   rs.close();
   		   }catch(Exception e) {
   			   e.printStackTrace();
   		   }
   	   }
      }
}
