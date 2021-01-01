package javabean;

public class Petprofit {
    private String petname;
    private int petprofit;
    
	public Petprofit() { }

	public Petprofit(String petname, int petprofit) {
		super();
		this.petname = petname;
		this.petprofit = petprofit;
	}

	public String getPetname() {
		return petname;
	}

	public void setPetname(String petname) {
		this.petname = petname;
	}

	public int getPetprofit() {
		return petprofit;
	}

	public void setPetprofit(int petprofit) {
		this.petprofit = petprofit;
	}
    
	
    
}
