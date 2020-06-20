package Exercise;
import java.util.Scanner;
public class InputPalindromes {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        System.out.println("Enter a five digit number");
		int number = input.nextInt(), reversedInput = 0, remainder, originalInput;
		originalInput = number;
  		if(number < 100000 && number >= 10000) {
			while(number != 0 ) {
				remainder = number % 10;
				reversedInput = reversedInput * 10 + remainder;
				number = number / 10;
			}
			if(originalInput == reversedInput) System.out.println(originalInput +  " is a palindrome");
		    
			else System.out.println(originalInput +  " is not a palindrome");
	

		}
         else {
        	 System.out.println("Please Enter a five digit  number");
        	 number = input.nextInt();
        	 if(number < 100000 && number >= 10000) {
     			while(number != 0 ) {
     				remainder = number % 10;
     				reversedInput = reversedInput * 10 + remainder;
     				number  /= 10;
     				
     				}
     				if(originalInput == reversedInput){
     					System.out.println(originalInput +  " is a palindrome");
     		     }
     				else {
     					System.out.println(originalInput +  " is not a palindrome");
     						}

     						}
         }
						}
		}

