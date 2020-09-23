package factorialcalculator;

import java.math.BigInteger;

public class IntegerCalculator {	
		
		public static BigInteger calculatorFactorial(BigInteger number)
		{
			if(number.compareTo(BigInteger.ONE) <= 0) {
				return BigInteger.ONE;
			}
			else {
				return number.multiply(calculatorFactorial(number.subtract(BigInteger.ONE)));
			}
		}
		public static void main(String[] args) {
			 for (int i = 1;i <= 50; i++) {
				 System.out.printf("%d! = %d%n" , i, calculatorFactorial(BigInteger.valueOf(i)));
			 }

		}

	}
