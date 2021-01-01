package dao;

import java.util.List;

import javax.sql.DataSource;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import javabean.Pet;
import utils.DBCPUtils;

/* 
 * 删除宠物信息所用的数据库
 * 操作函数
 * */
public class Deletpetdao {
        public static DataSource ds=DBCPUtils.getDatasource();
        
        public void deletPet(String petname) {
        	try {
        	QueryRunner qr=new QueryRunner(ds);
        	String sql="delete from pet where petname=?";
        	Object []param= {petname};
        	int x=qr.update(sql,param);
        	if(x>0) {
        		System.out.println("删除成功");
        	}else {
        		System.out.println("删除失败");
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
        	Object []param= {petname};
        	List<Pet>list=(List<Pet>)qr.query(sql, new BeanListHandler(Pet.class),param);
        	if(list==null||list.size()==0) {
        		flag=true;
        	}
        	}catch(Exception e) {
        		e.printStackTrace();
        	}
        	return flag;
        }
}
