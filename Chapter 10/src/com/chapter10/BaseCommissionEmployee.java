package com.chapter10;

public class BaseCommissionEmployee extends CommissionEmployee{
	
	private double baseSalary;
	
	public BaseCommissionEmployee(double baseSalary,double commissionRate,double grossSales,String firstName,String lastName,int securityNumber,Date birthdate) {
		super(commissionRate,grossSales,firstName,lastName,securityNumber,birthdate);
		
		if(baseSalary > 0.0) {
			this.baseSalary = baseSalary;
		}
	}

	public double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}
	
}