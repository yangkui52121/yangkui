package javabean;

public class Petsale {
     private String petname;
     private int petsalenumber;
     
	 public Petsale() { }

	public Petsale(String petname, int petsalenumber) {
		super();
		this.petname = petname;
		this.petsalenumber = petsalenumber;
	}

	public String getPetname() {
		return petname;
	}

	public void setPetname(String petname) {
		this.petname = petname;
	}

	public int getPetsalenumber() {
		return petsalenumber;
	}

	public void setPetsalenumber(int petsalenumber) {
		this.petsalenumber = petsalenumber;
	}
	 
	 
     
     
}
