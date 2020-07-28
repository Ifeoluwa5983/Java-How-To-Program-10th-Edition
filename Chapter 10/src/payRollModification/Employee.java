package payRollModification;

public abstract class Employee {
	private String firstName;
	private String  lastName;
	private int securityNumber;
	private int birthdate;
	
	
	public Employee(String firstName,String lastName,int securityNumber,int birthdate) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.securityNumber = securityNumber;
		this.birthdate = birthdate;
	}

	public Employee () {
		
	}

	public int getBirthdate() {
		return birthdate;
	}


	public void setBirthdate(int birthdate) {
		this.birthdate = birthdate;
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
