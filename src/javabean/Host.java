package javabean;

public class Host {
     private String hostaccount;
     private String hostpassword;
	 private String hostID;
	 private String hostsex;
	 private String hostyear;
	 private String hosttelephone;
	
	 public Host() {}

	public Host(String hostaccount, String hostpassword, String hostID, String hostsex, String hostyear,
			String hosttelephone) {
		super();
		this.hostaccount = hostaccount;
		this.hostpassword = hostpassword;
		this.hostID = hostID;
		this.hostsex = hostsex;
		this.hostyear = hostyear;
		this.hosttelephone = hosttelephone;
	}

	public String getHostaccount() {
		return hostaccount;
	}

	public void setHostaccount(String hostaccount) {
		this.hostaccount = hostaccount;
	}

	public String getHostpassword() {
		return hostpassword;
	}

	public void setHostpassword(String hostpassword) {
		this.hostpassword = hostpassword;
	}

	public String getHostID() {
		return hostID;
	}

	public void setHostID(String hostID) {
		this.hostID = hostID;
	}

	public String getHostsex() {
		return hostsex;
	}

	public void setHostsex(String hostsex) {
		this.hostsex = hostsex;
	}

	public String getHostyear() {
		return hostyear;
	}

	public void setHostyear(String hostyear) {
		this.hostyear = hostyear;
	}

	public String getHosttelephone() {
		return hosttelephone;
	}

	public void setHosttelephone(String hosttelephone) {
		this.hosttelephone = hosttelephone;
	}
	 
	 
	 
	 
}
