package payRollModification;

public class SalariedEmployee extends Employee {
	
	private double weeklySalary;
	
	public SalariedEmployee(String firstName,String lastName,int securityNumber,double weeklySalary,CompensationModel compel) {
		super (firstName,lastName,securityNumber,compel);
		
		if(weeklySalary > 0.0) {
			this.weeklySalary = weeklySalary;
		}else {
			System.out.println("Weekly salary must be greater than 0.0");
		}	
	}
	public double earnings() {
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
