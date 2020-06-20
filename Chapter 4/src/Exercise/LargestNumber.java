package Exercise;
import java.util.Scanner;
public class LargestNumber {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		
		int num = 0;
		int counter = 1;
		int largest = 0;
		
		while(counter <= 10) {
			System.out.println("Enter a number");
			num = input.nextInt();
			counter++;
			
			if (num > largest) {
				largest = num;
			}
		}
		System.out.println(largest);

	}

}
