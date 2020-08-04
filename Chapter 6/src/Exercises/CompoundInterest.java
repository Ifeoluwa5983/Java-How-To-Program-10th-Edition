package Exercises;

public class CompoundInterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double p = 1000.0;
		double r = 0.05;
		int n = 1;
	
		
		for(int i = 1;i <= 10; i++) {
			double amount = p * Math.pow(1.0 + r,n) ;
			System.out.printf("%4d %20f%n" ,n ,amount);
			n++;
		}
		System.out.println();
		

	}

}
