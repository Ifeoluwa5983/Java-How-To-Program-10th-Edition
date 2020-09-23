package factorialcalculator;

public class FactorialCalculator {
	
	public static long calculatorFactorial(int number)
	{
		if(number <= 1) {
			return 1;
		}
		else {
			return number * calculatorFactorial(number - 1);
		}
	}
	public static void main(String[] args) {
		 for (int i = 1;i <= 21; i++) {
			 System.out.printf("%d! = %d%n" , i, calculatorFactorial(i));
		 }

	}

}

