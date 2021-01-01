package javabean;

public class Pet {
    private String petname;
    private String pettype;
    private String petyear;
    private String petprice;
    private String petshape;
    private String petstatus;
    
	public Pet() {}

	public Pet(String petname, String pettype, String petyear, String petprice, String petshape, String petstatus) {
		super();
		this.petname = petname;
		this.pettype = pettype;
		this.petyear = petyear;
		this.petprice = petprice;
		this.petshape = petshape;
		this.petstatus = petstatus;
	}

	public String getPetname() {
		return petname;
	}

	public void setPetname(String petname) {
		this.petname = petname;
	}

	public String getPettype() {
		return pettype;
	}

	public void setPettype(String pettype) {
		this.pettype = pettype;
	}

	public String getPetyear() {
		return petyear;
	}

	public void setPetyear(String petyear) {
		this.petyear = petyear;
	}

	public String getPetprice() {
		return petprice;
	}

	public void setPetprice(String petprice) {
		this.petprice = petprice;
	}

	public String getPetshape() {
		return petshape;
	}

	public void setPetshape(String petshape) {
		this.petshape = petshape;
	}

	public String getPetstatus() {
		return petstatus;
	}

	public void setPetstatus(String petstatus) {
		this.petstatus = petstatus;
	}
    
	
    
}
