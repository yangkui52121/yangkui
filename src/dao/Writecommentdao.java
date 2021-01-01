package dao;

import java.util.List;

import javax.sql.DataSource;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import javabean.Comment;
import utils.DBCPUtils;

public class Writecommentdao {
     public static DataSource ds=DBCPUtils.getDatasource();
     
     public void saveComment(String petname,String petcomment) {
    	 try {
    		 QueryRunner qr=new QueryRunner(ds);   		 
    		 String sql1="insert into comment(petname,petcomment) values(?,?)";
    		 qr.update(sql1,petname,petcomment);
    		
    	 }catch(Exception e) {
    		 e.printStackTrace();
    	 }
    	 
     }
}
