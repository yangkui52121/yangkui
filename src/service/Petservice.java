package service;

import java.util.List;

import dao.Petdao;
import javabean.Pagebean;
import javabean.Pet;

public class Petservice {
     public Pagebean<Pet> findPagebean(int currpage){
    	 int pagesize=4;
    	 
    	 Pagebean<Pet> pb=new Pagebean<Pet>();
    	 
    	 pb.setCurrpage(currpage);
    	 
    	 pb.setPagesize(pagesize);
    	 
    	 Petdao dao=new Petdao();
    	 
    	 int toltalcount=0;
    	 List<Pet> currpagepetcount=null;
    	 
    	 try {
    		 toltalcount=dao.getToltalcount();
    		 currpagepetcount=dao.getToltalpetmes(currpage, pagesize);
    	 }catch(Exception e) {
    		 e.printStackTrace();
    	 }
    	 
    	 pb.setTotalcount(toltalcount);
    	 
    	 pb.setList(currpagepetcount);
    	 
    	 
    	 return pb;
     }
}
