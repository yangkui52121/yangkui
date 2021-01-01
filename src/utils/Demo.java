package utils;

import java.sql.Connection;

public class Demo {

	public static void main(String[] args) {
		Connection conn=DBCPUtils.getConnection();
          if(conn!=null)
        	  System.out.println("skhf");
	}

}
