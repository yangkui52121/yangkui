package dao;

import java.util.List;

import javax.sql.DataSource;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import javabean.Petprofit;
import utils.DBCPUtils;

public class Shouyidao {
       public static DataSource ds=DBCPUtils.getDatasource();
       
       public List<Petprofit> getProfit(String petname){
    	   List<Petprofit>list=null;
    	   try {
    		   QueryRunner qr=new QueryRunner(ds);
    		   String sql="select * from petprofit where petname=?";
    		   list=(List<Petprofit>)qr.query(sql, new BeanListHandler(Petprofit.class),petname);
    	   }catch(Exception e) {
    		   e.printStackTrace();
    	   }
    	   return list;
       }
}
