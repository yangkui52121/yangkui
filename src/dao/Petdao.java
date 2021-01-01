package dao;

import java.util.List;

import javax.sql.DataSource;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import javabean.Pet;
import utils.DBCPUtils;

/*
 * 用于查询宠物所有信息
 * 数据库操作类
 *  */
public class Petdao {
      public static DataSource ds=DBCPUtils.getDatasource();
      //获取数据库总行数
      public int getToltalcount() {
    	  int x=0;
    	  try {
    		  QueryRunner qr=new QueryRunner(ds);
    		  String sql="select count(*) from pet";
    		  x=((Long) qr.query(sql, new ScalarHandler())).intValue();
    	  }catch(Exception e) {
    		  e.printStackTrace();
    	  }
    	  return x;
      }
      //获取数据起始行到终止行的数据
      public List<Pet> getToltalpetmes(int currpage,int pagesize){
    	  List<Pet> list=null;
    	  try {
    		  QueryRunner qr=new QueryRunner(ds);
    		  String sql="select * from pet limit ?,?";  
    		  list=(List<Pet>)qr.query(sql, new BeanListHandler(Pet.class),(currpage-1)*pagesize,pagesize);
    	  }catch(Exception e) {
    		  e.printStackTrace();
    	  }
    	  
    	  return list;
      }
}
