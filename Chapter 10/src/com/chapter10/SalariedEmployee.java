package com.chapter10;

public class SalariedEmployee extends Employee {
	
	private double weeklySalary;
	
	public SalariedEmployee(String firstName,String lastName,int securityNumber,double weeklySalary,Date birthdate) {
		super (firstName,lastName,securityNumber,birthdate);
		
		if(weeklySalary > 0.0) {
			this.weeklySalary = weeklySalary;
		}else {
			System.out.println("Weekly salary must be greater than 0.0");
		}	
	}
	public double getPayment() {
		return weeklySalary;
	}
	
	public double getWeeklySalary() {
		return weeklySalary;
	}

	public void setWeeklySalary(double weeklySalary) {
		if(weeklySalary > 0.0) {
			this.weeklySalary = weeklySalary;
		}else {
			System.out.println("Weekly salary  must be greater than 0.0");
		}
	}
	public String toString() { 
		return String.format("salaried employee: %s%n%s: $%,.2f",
		super.toString(), "weekly salary", getWeeklySalary());

	}


}

