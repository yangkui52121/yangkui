package javabean;

public class Comment {
     private String petname;
     private String petcomment;
     
	public Comment() { }

	public Comment(String petname, String petcomment) {
		super();
		this.petname = petname;
		this.petcomment = petcomment;
	}

	public String getPetname() {
		return petname;
	}

	public void setPetname(String petname) {
		this.petname = petname;
	}

	public String getPetcomment() {
		return petcomment;
	}

	public void setPetcomment(String petcomment) {
		this.petcomment = petcomment;
	}
	
	
     
     
}
