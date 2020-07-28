package payRollModification;

public class EmployeeTest {

	public static void main(String[] args) {
		HourlyEmployee He = new HourlyEmployee("Ifeoluwa","Oluwafemi",1234,24,500.60,12);
		CommissionEmployee Ce = new CommissionEmployee(0.6,5000.765,"Ifeoluwa","Dorcas",5678,16);
		Date date = new Date("Iclass","Chimaobi",6789,12,4);
		He.earnings();
		Ce.earnings();
		date.earnings();
		//System.out.println(He.toString());
		//System.out.println(Ce.toString());
		//System.out.println(date.toString());
		date.calculateEarnings(4);
		System.out.println(date.wage);
	}

}
