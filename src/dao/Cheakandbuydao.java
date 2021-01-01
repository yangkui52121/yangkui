package dao;

import java.util.List;

import javax.sql.DataSource;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import javabean.Pet;
import utils.DBCPUtils;

public class Cheakandbuydao {
      public static DataSource ds=DBCPUtils.getDatasource();
      
      public List<Pet> chaekMea(String petname) {
    	  List<Pet>list=null;
    	  try {
    		  QueryRunner qr=new QueryRunner(ds);
    		  String sql="select * from pet where petname=?";
    		  Object[]param= {petname};
    		  list=(List<Pet>)qr.query(sql, new BeanListHandler(Pet.class),param);
    	  }catch(Exception e){
    		 e.printStackTrace();
    	  }
    	  
    	  return list;
      }
}
