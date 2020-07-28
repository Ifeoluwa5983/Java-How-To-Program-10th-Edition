package payRollModification;

public class HourlyEmployee extends Employee{
	private double hourlyWage;
	private int hour;
	
	
	public HourlyEmployee(String firstName,String lastName,int securityNumber,int birthdate,double hourlyWage,int hour) {
		super(firstName,lastName,securityNumber,birthdate);
		if(hourlyWage > 0.0) {
			this.hourlyWage = hourlyWage;
		}else {
			System.out.println("Hourly wage must be greater than 0.0");
		}
		if(hour > 0 && hour < 168) {
			this.hour = hour;
		}else {
			System.out.println("Hour must be greater than 0 and less than 168");
		}
	}


	public double getHourlyWage() {
		return hourlyWage;
	}
	
	public void setHourlyWage(double hourlyWage) {
		if(hourlyWage > 0.0) {
			this.hourlyWage = hourlyWage;
		}else {
			System.out.println("Hourly wage must be greater than 0.0");
		}
	}
	
	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		if(hour > 0 && hour < 168) {
			this.hour = hour;
		}else {
			System.out.println("Hour must be greater than 0 and less than 168");
		}
	}
	
	public double earnings() {
		if(hour > 40) {
			double wage = hourlyWage* hour * 1.5;
			return wage;
		}
		else { 
			double wage = hourlyWage * hour; 
			return wage;
		}
		}
	
	public String toString() {
		 
		return String.format("hourly employee: %s %n%s: $%s %n%s: %s",
		 
		super.toString(), "hourly wage", getHourlyWage(), 
		 
		"hours worked", getHour()); 
	}
	

}
