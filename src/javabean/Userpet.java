package javabean;

public class Userpet {
      private String username;
      private String upetname;
      private String upettype;
      private int upetnum;
      
	public Userpet() {	}

	public Userpet(String username, String upetname, String upettype, int upetnum) {
		super();
		this.username = username;
		this.upetname = upetname;
		this.upettype = upettype;
		this.upetnum = upetnum;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getUpetname() {
		return upetname;
	}

	public void setUpetname(String upetname) {
		this.upetname = upetname;
	}

	public String getUpettype() {
		return upettype;
	}

	public void setUpettype(String upettype) {
		this.upettype = upettype;
	}

	public int getUpetnum() {
		return upetnum;
	}

	public void setUpetnum(int upetnum) {
		this.upetnum = upetnum;
	}

	@Override
	public String toString() {
		return "Userpet [username=" + username + ", upetname=" + upetname + ", upettype=" + upettype + ", upetnum="
				+ upetnum + "]";
	}
	
	
	
      
      
}
