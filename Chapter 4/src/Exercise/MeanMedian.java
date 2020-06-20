package Exercise;
import java.util.Scanner;
public class MeanMedian {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("Enter a positive number");
		int num = userInput.nextInt();
		
		int counter = 0;
		int totalInput = 0;
		
		while(num >= 0) {
			totalInput = totalInput + num;
			counter++;
			System.out.println("Enter a positive number");
			num = userInput.nextInt();
		}
		int mean = totalInput /counter;
		System.out.println(mean);

	}

}
