package payRollModification;

public class Date extends Employee  {
	
	private int birthday;
	double wage = 0.0;
	CommissionEmployee comEmploy = new CommissionEmployee();
	public Date(String firstName,String lastName,int securityNumber,int birthdate,int birthday) {
		super(firstName,lastName,securityNumber,birthdate);
		
		this.birthday= birthday;
	}

	public int getBirthday() {
		return birthday;
	}

	public void setBirthday(int birthday) {
		this.birthday = birthday;
	}
	public String toString() {
		return String.format("%s: %s %n%s : %s", 
		"commission employee", super.toString(), 
		"Birthday", getBirthday());
	}
	
	public void calculateEarnings(int birth) {
		int[] birthday = new int[11];
		for(int i = 0;i <= birthday.length;i++) {
			if (birth == getBirthday()) {
				wage = comEmploy.earnings() + 100;
				break;
			}
		}
		
	}
	public double earnings() {
		return wage;
	}

}
