package Exercise219;

public class SalesCommissionTest {

	public static void main(String[] args) {
		SalesCommissionCalculator obj = new SalesCommissionCalculator(239.99);
		SalesCommissionCalculator calculations = new SalesCommissionCalculator(239.99);
        System.out.printf("Your earning for this month is %f%n", calculations.calculateEarnings(239.99));
	}

}
