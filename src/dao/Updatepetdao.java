package dao;

import java.util.List;

import javax.sql.DataSource;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import javabean.Pet;
import utils.DBCPUtils;

public class Updatepetdao {
      public static DataSource ds=DBCPUtils.getDatasource();
      
      public void updatePet(String petname,String pettype,String petyear,String petprice,String petshape,String petstatus) {
    	  try {
    		  QueryRunner qr=new QueryRunner(ds);
    		  String sql="update pet set pettype=?,petyear=?,petprice=?,petshape=?,petstatus=? where petname=?";
    		  Object[]param= {pettype,petyear,petprice,petshape,petstatus,petname};
    		  int x=qr.update(sql,param);
    		  if(x>0) {
    			  System.out.println("É¾³ý³É¹¦");
    		  }else {
    			  System.out.println("É¾³ýÊ§°Ü");
    		  }
    		  }catch(Exception e) {
    			  e.printStackTrace();
    		  }
    	  }
      
      public List<Pet> isExist(String petname) {
    	  List<Pet> list=null;
    	  try {
    		  QueryRunner qr=new QueryRunner(ds);
    		  String sql="select * from pet where petname=?";
    		  Object[]param= {petname};
    		  list=(List<Pet>)qr.query(sql, new BeanListHandler(Pet.class),param);
    		  if(list.size()>0) {
    			  return list;
    		  }
    	  }catch(Exception e) {
    		  e.printStackTrace();
    	  }
    	  return list;
      }
      
      }



