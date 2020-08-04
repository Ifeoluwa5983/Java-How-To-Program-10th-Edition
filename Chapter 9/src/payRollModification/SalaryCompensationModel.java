package payRollModification;

public class SalaryCompensationModel extends CompensationModel {
	
	private double weeklySalary;

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
	public double getEarnings() {
	if(weeklySalary > 0.0) {
		return weeklySalary;
	}else {
		System.out.println("Weekly salary  must be greater than 0.0");
	
	}
	return weeklySalary;
	}
}
