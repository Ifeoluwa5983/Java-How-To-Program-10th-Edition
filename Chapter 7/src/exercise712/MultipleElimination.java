package exercise712;
import java.util.Scanner;
import java.util.Arrays;
public class MultipleElimination {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int [] array = new int[5];
		
		
		System.out.println("Enter a number between 10 and 100 inclusive");
		
		
		for(int i = 0; i < array.length; i++) {
			int num = input.nextInt();
			while(true) {
				if(num > 9 && num < 101) {
						
					if(num != array[i]) {
						array[i] = num;
						break;
					}
					else {
						System.out.println("number already exists");
						break;
						}
				}
				else {
					System.out.println("Enter a number between 10 and 100 inclusive");
					break;
			}
			
				}
		
		}
		
		for(int counter = 0;counter < array.length;counter++){
			System.out.println(array[counter]);
		}
		
	}		  
		
		
	}


