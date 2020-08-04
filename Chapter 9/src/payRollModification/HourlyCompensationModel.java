package payRollModification;

public class HourlyCompensationModel extends CompensationModel{
	 private double hoursWorked;
	 private double hourlyWage;
	 
	 public double getEarnings() {
			return hoursWorked * hourlyWage;
		}

	public double getHoursWorked() {
		return hoursWorked;
	}

	public void setHoursWorked(double hoursWorked) {
		this.hoursWorked = hoursWorked;
	}

	public double getHourlyWage() {
		return hourlyWage;
	}

	public void setHourlyWage(double hourlyWage) {
		this.hourlyWage = hourlyWage;
	}

	 
	 
	 
	 
	 

}
