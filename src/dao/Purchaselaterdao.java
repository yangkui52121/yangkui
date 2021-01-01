package dao;

import java.util.List;

import javax.sql.DataSource;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import javabean.Pet;
import javabean.Petprofit;
import javabean.Petsale;
import javabean.Userpet;
import utils.DBCPUtils;

public class Purchaselaterdao {
    	public static DataSource ds=DBCPUtils.getDatasource();
    	/* 
    	 * 获取宠物收益
    	 * */
    	public void purchasePetprofit(String petname,int x) {
    		try {
    			QueryRunner qr=new QueryRunner(ds);
    			String sql="select * from pet where petname=?";
    			Object[]param= {petname};
    			List<Pet>list=(List<Pet>)qr.query(sql, new BeanListHandler(Pet.class),param);
    			if(x==0) {
    				Pet p=list.get(0);       			
        			int pp=Integer.parseInt(p.getPetprice());
        			String sql1="select * from petprofit where petname=?";
        			List<Petprofit>list1=(List<Petprofit>)qr.query(sql1, new BeanListHandler(Petprofit.class),petname);
        			int pro1=list1.get(0).getPetprofit();
        			
        			int all=pp+pro1;
        			
        			String sql2="update petprofit set petprofit=? where petname=?";
        			
        			Object[]param1= {all,petname};
        			
        			int flag=qr.update(sql2,param1);
        			
        			if(flag>0) {
        				System.out.println("成功");
        			}else {
        				System.out.println("失败");
        			}
    			}else if(x==1) {
    				String sql3="insert into petprofit(petname,petprofit) values(?,?)";
    				String petname1=list.get(0).getPetname();
    				int price=Integer.parseInt(list.get(0).getPetprice());
    				Object[]param2= {petname1,price};
    				int flag1=qr.update(sql3,param2);
    				if(flag1>0) {
    					System.out.println("成功");
    				}else {
    					System.out.println("失败");
    				}
    			}
    			
    			
    			
    			
    		}catch(Exception e) {
    			e.printStackTrace();
    		}
    	}
    	/*
    	 * 存储已购数量
    	 * */
    	public void petSale(String petname,int x) {
    		 try {
    			 QueryRunner qr=new QueryRunner(ds);
    			 String sql="select * from petsale where petname=?";
    			 List<Petsale>list=(List<Petsale>)qr.query(sql, new BeanListHandler(Petsale.class),petname);
    			 if(list==null||list.size()==0) {
    				 String sql1="insert into petsale (petname,petsalenumber) values (?,?)";
    				 
    				 qr.update(sql1, petname,x);
    			 }else {
    				 String sql2="update petsale set petsalenumber=? where petname=?";
    				 int all=list.get(0).getPetsalenumber()+x;
    				 qr.update(sql2,all,petname);
   			 
    			 }
    		 }catch(Exception e) {
    			 e.printStackTrace();
    		 }
    	}
    	/*
    	 * 存储用户已购宠物信息
    	 * */
    	public void purchasedPet(String username,String petname,int num) {
    		try {
    			QueryRunner qr=new QueryRunner(ds);
    			String sql="select * from userpet where upetname=?";
    			List<Userpet>list=(List<Userpet>)qr.query(sql, new BeanListHandler(Userpet.class),petname);
    			
    			if(list==null||list.size()==0) {
    				String sql1="select * from pet where petname=?";
    				List<Pet>list1=(List<Pet>)qr.query(sql1, new BeanListHandler(Pet.class),petname);
    				String pettype=list1.get(0).getPettype();
    				
    				String sql2="insert into userpet (username,upetname,upettype,upetnum) values(?,?,?,?)";
    				Object[]param= {username,petname,pettype,num};
    				qr.update(sql2,param);
    				
    			}else {
    				String sql3="select * from pet where petname=?";
    				List<Pet>list3=(List<Pet>)qr.query(sql3, new BeanListHandler(Pet.class),petname);
    				String pettype=list3.get(0).getPettype();
    				
    				int x=list.get(0).getUpetnum();
    				int all=x+num;
    				
    				String sql4="update userpet set upetnum=? where upetname=?";
    				Object[]param4= {all,petname};
    				qr.update(sql4,param4);
    				}
    			   			
    		}catch(Exception e) {
    			e.printStackTrace();
    		}
    	}
    	
    	public int petproIsexist(String petname) {
    		int x=0;
    		try {
    			QueryRunner qr=new QueryRunner(ds);
    			String sql="select * from petprofit where petname=?";
    			Object[]param= {petname};
    			List<Pet>list=(List<Pet>)qr.query(sql, new BeanListHandler(Pet.class),param);
    			if(list==null||list.size()==0) {
    				x=1;
    			}else {
    				x=0;
    			}
    		}catch(Exception e) {
    			e.printStackTrace();
    		}
    		
    		return x;
    	}
     
}
