package Exercise625;

public class PrimeNumbers {

	public static void main(String[] args) {
		
		int i = 0;
		int j = 0;
		String primeNumbers = " ";
		
		for(i = 0;i <= 10000;i ++) {
			int counter = 0;
			for(j = i;j >= 1;j--) {
				if(i % j == 0) {
					counter = counter + 1;
			}	
			}
			if(counter == 2) {
				primeNumbers = primeNumbers + i + " ";
			}
		}
		System.out.print("These are the prime numbers from 1-1000 :" + primeNumbers);

	}

}
