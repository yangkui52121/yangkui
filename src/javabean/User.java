package javabean;

public class User {
	private String useraccount;
	private String userpassword;
    private String userID;
    private String usersex;
    private String useryear;
    private String usertelephone;
    
	public User() {}

	public User(String useraccount, String userpassword, String userID, String usersex, String useryear,
			String usertelephone) {
		super();
		this.useraccount = useraccount;
		this.userpassword = userpassword;
		this.userID = userID;
		this.usersex = usersex;
		this.useryear = useryear;
		this.usertelephone = usertelephone;
	}

	public String getUseraccount() {
		return useraccount;
	}

	public void setUseraccount(String useraccount) {
		this.useraccount = useraccount;
	}

	public String getUserpassword() {
		return userpassword;
	}

	public void setUserpassword(String userpassword) {
		this.userpassword = userpassword;
	}

	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) {
		this.userID = userID;
	}

	public String getUsersex() {
		return usersex;
	}

	public void setUsersex(String usersex) {
		this.usersex = usersex;
	}

	public String getUseryear() {
		return useryear;
	}

	public void setUseryear(String useryear) {
		this.useryear = useryear;
	}

	public String getUsertelephone() {
		return usertelephone;
	}

	public void setUsertelephone(String usertelephone) {
		this.usertelephone = usertelephone;
	}
    
	
    
}
