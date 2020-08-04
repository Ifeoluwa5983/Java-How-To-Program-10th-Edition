package payRollModification;

public class BasePlusCommissionEmployee extends CommissionEmployee{
	
	private double baseSalary;
	
	public BasePlusCommissionEmployee(double baseSalary,double commissionRate,double grossSales,String firstName,String lastName,int securityNumber,CompensationModel compel) {
		super(commissionRate,grossSales,firstName,lastName,securityNumber,compel);
		
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
