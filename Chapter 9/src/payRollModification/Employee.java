package payRollModification;

public abstract class Employee {
	private String firstName;
	private String  lastName;
	private int securityNumber;
	private CompensationModel compel;
	
	
	public Employee(String firstName,String lastName,int securityNumber,CompensationModel compel) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.securityNumber = securityNumber;
		this.compel = compel;
	}

	public Employee () {
		
	}
	//public abstract  double getEarnings();

	public CompensationModel getCompel() {
		return compel;
	}

	public void setCompel(CompensationModel compel) {
		this.compel = compel;
	}


	public String getFirstName() {
		return firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public int getSecurityNumber() {
		return securityNumber;
	}
	
	public abstract  double earnings();
	
	public String toString() {
		return String.format("%s %s %d", getFirstName(),getLastName(),getSecurityNumber());
	}

}
