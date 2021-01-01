package service;

import java.util.List;

import dao.Commentdao;
import javabean.Comment;
import javabean.Pagebean;

public class Commentservice {
	public Pagebean<Comment> findPagebean(int currpage){
   	 int pagesize=4;
   	 
   	 Pagebean<Comment> pb=new Pagebean<Comment>();
   	 
   	 pb.setCurrpage(currpage);
   	 
   	 pb.setPagesize(pagesize);
   	 
   	Commentdao dao=new Commentdao();
   	 
   	 int toltalcount=0;
   	 List<Comment> currpagepetcount=null;
   	 
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
