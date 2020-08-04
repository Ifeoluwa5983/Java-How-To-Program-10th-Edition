package com.chapter10;



public abstract class Employee implements Payable {
	private String firstName;
	private String  lastName;
	private int securityNumber;
	private Date birthdate ;
	Employee employee[] = new Employee[5];

	
	
	public Employee(String firstName,String lastName,int securityNumber,Date birthdate) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.securityNumber = securityNumber;
		this.birthdate = birthdate;
	}

	public Employee () {
		
	}
	

	public Date getBirthdate() {
		return birthdate;
	}


	public void setBirthdate(Date birthdate) {
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
	
	public abstract  double getPayment();
	
	public String toString() {
		return String.format("%s %s %d", getFirstName(),getLastName(),getSecurityNumber());
	}

}
