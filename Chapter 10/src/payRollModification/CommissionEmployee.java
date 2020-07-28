package payRollModification;

public class CommissionEmployee extends Employee {
	private double commissionRate;
	private double grossSales;
	
	public CommissionEmployee() {
		
	}
	
	public CommissionEmployee(double commissionRate,double grossSales,String firstName,String lastName,int securityNumber,int birthdate) {
		super(firstName,lastName,securityNumber,birthdate);
		if(commissionRate > 0.0 && commissionRate < 1.0) {
			this.commissionRate = commissionRate;
		}else {
			System.out.println("Commission Rate must be greater than 0.0 and less than 1.0");
		}	
		 
		 if(grossSales > 0.0) {
			 this.grossSales = grossSales;
		 }else {
				System.out.println("Gross sales must be greater than 0.0");
			}	
	}
	public double getCommissionRate() {
		return commissionRate;
	}

	public void setCommissionRate(double commissionRate) {
		if(commissionRate > 0.0 && commissionRate < 1.0) {
			this.commissionRate = commissionRate;
		}else {
			System.out.println("Commission Rate must be greater than 0.0 and less than 1.0");
		}	
	}

	public double getGrossSales() {
		return grossSales;
	}

	public void setGrossSales(double grossSales) {
		 if(grossSales > 0.0) {
			 this.grossSales = grossSales;
		 }else {
				System.out.println("Gross sales must be greater than 0.0");
			}	
		 }
	public double earnings() {
		double wage = commissionRate * grossSales;
		return wage;
	}
	public String toString() {
		return String.format("%s: %s %n%s $%s %n%s %s ", 
	 
		"commission employee", super.toString(), 
	 
		"gross sales", getGrossSales(), 
	 
		"commission rate", getCommissionRate()); 
	}

}
