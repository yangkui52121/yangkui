package dao;

import java.util.List;

import javax.sql.DataSource;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import javabean.Comment;
import javabean.Pet;
import utils.DBCPUtils;

public class Commentdao {
	public static DataSource ds=DBCPUtils.getDatasource();
    //��ȡ���ݿ�������
    public int getToltalcount() {
  	  int x=0;
  	  try {
  		  QueryRunner qr=new QueryRunner(ds);
  		  String sql="select count(*) from comment ";
  		  x=((Long) qr.query(sql, new ScalarHandler())).intValue();
  	  }catch(Exception e) {
  		  e.printStackTrace();
  	  }
  	  return x;
    }
    //��ȡ������ʼ�е���ֹ�е�����
    public List<Comment> getToltalpetmes(int currpage,int pagesize){
  	  List<Comment> list=null;
  	  try {
  		  QueryRunner qr=new QueryRunner(ds);
  		  String sql="select * from comment limit ?,?";  
  		  list=(List<Comment>)qr.query(sql, new BeanListHandler(Comment.class),(currpage-1)*pagesize,pagesize);
  	  }catch(Exception e) {
  		  e.printStackTrace();
  	  }
  	  
  	  return list;
    }
}
