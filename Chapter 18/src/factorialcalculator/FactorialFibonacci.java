package factorialcalculator;


public class FactorialFibonacci {
	static int n1 =0 , n2 = 1,n3;
	public static void fibonacci(int count) {
		if(count > 1) {
			n3 = n1 + n2;
			n1 = n2;
			n2 = n3;
			System.out.println(n3);
		}
		count = count - 1;
		
	}

	public static void main(String[] args) {
		int count = 20;
		System.out.println(n1);
		System.out.println(n2);
		for(int i = 0;i <count - 2;i ++) {
			fibonacci(count);
		}
	}

}
