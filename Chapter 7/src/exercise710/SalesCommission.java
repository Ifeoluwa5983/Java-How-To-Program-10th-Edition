package exercise710;
import java.util.Scanner;
public class SalesCommission {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int [] counter = new int [9];
		System.out.println("Enter salary: ");
		int salary = input.nextInt();
		
		while(salary >= 200) {
			int newSalary = salary / 100;
			
			
			switch(newSalary){
			case 2:
				counter[0]++;
				break;
			case 3:
				counter[1]++;
				break;
			case 4:
				counter[2]++;
				break;
			case 5:
				counter[3]++;
				break;
			case 6:
				counter[4]++;
				break;
			case 7:
				counter[5]++;
				break;
			case 8:
				counter[6]++;
				break;
			case 9:
				counter[7]++;
				break;
			case 10:
			default:
				counter[8]++;
				break;
			}
			System.out.println("Enter salary: ");
			salary = input.nextInt();
		}
		
		System.out.printf("$200 - 299: "+ counter[0] + "%n$300 - 399:  " + counter[1] + "%n$400 - 499: " + counter[2] + "%n$500 - 599: " + counter[3] + "%n$600 - 699: " + counter[4] + "%n$700 - 799: " + counter[5] + "%n$800 - 899: " + counter[6] + "%n$900 - 999: " + counter[7] + "%n$1000 and over:" + counter[8]);
		for(int i = 0;i < counter.length;i++) {
			;
			//System.out.print(counter[i]);
			
		}
	}

}
