package dao;

import java.util.List;

import javax.sql.DataSource;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import javabean.Pet;
import utils.DBCPUtils;

/*
 * 添加宠物信息所用的
 * 数据库操作
 *  */
public class Insertpetdao {
      public static DataSource ds=DBCPUtils.getDatasource();
      
      public void insetPet(String petname,String pettype,String petyear,String petprice,
    		 String petshape,String petstatus) {
    	  try {
    	     QueryRunner qr=new QueryRunner(ds);
    	     String sql="insert into pet(petname,pettype,petyear,petprice,petshape,petstatus)values(?,?,?,?,?,?)";
    	     Object[]param= {petname,pettype,petyear,petprice,petshape,petstatus};
    	     int x=qr.update(sql, param);
    	     if(x>0) {
    	    	 System.out.println("添加成功");
    	     }else {
    	    	 System.out.println("添加失败");
    	     }
    	  }catch(Exception e) {
    		  e.printStackTrace();
    	  }
      }
      
      public boolean isExist(String petname) {
    	  boolean flag=false;
    	  try {
    		  QueryRunner qr=new QueryRunner(ds);
    	      String sql="select * from pet where petname=?";
    	      Object [] param= {petname};
    	      List<Pet>list=(List<Pet>)qr.query(sql, new BeanListHandler(Pet.class),param);
    	      if(list==null||list.size()==0) {
    	    	  flag=true;
    	      }
    	  }catch(Exception e){
    		  e.printStackTrace();
    	  }
    	  return flag;
    	     	  
      }
}
