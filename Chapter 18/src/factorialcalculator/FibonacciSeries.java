package factorialcalculator;

public class FibonacciSeries {

	public static void main(String[] args) {
		int count = 20 , n1 = 0 ,n2 = 1 ,n3;
		System.out.print(n1 + " " + n2);
		
		for(int i = 0; i < count - 2;i ++) {
			n3 = n1+ n2;
			n1 = n2;
			n2 = n3;
			System.out.print(" " + n3);
		}

	}

}
