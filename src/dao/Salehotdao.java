package dao;

import java.util.List;

import javax.sql.DataSource;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import javabean.Petsale;
import utils.DBCPUtils;

public class Salehotdao {
        public static DataSource ds=DBCPUtils.getDatasource();
        
        public List<Petsale> sortPetsaleASC(String sort) {
        	List<Petsale>list=null;
        	try {
        		QueryRunner qr=new QueryRunner(ds);
        		if(sort.equals("»»œ˙")) {
        			String sqla="select * from petsale order by petsalenumber DESC";
        			list=(List<Petsale>)qr.query(sqla, new BeanListHandler(Petsale.class));
       
        		}else if(sort.equals("÷Õœ˙")) {
        			String sqle="select * from petsale order by petsalenumber ASC";
        			list=(List<Petsale>)qr.query(sqle, new BeanListHandler(Petsale.class));
        		}
        		
        	}catch(Exception e) {
        		e.printStackTrace();
        	}
        	return list;
        }
}
