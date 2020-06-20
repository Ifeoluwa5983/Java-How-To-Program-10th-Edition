package exercise217;

import java.util.Scanner;

public class Arithmetic {
    public static void main(String ...args){
        Scanner UserInput = new Scanner(System.in);

        
        
        System.out.println("Enter the first number");
        int firstNumber = UserInput.nextInt();
        
        System.out.println("Enter the second number");
        int secondNumber= UserInput.nextInt();
        
        System.out.println("Enter the third number");
        int thirdNumber= UserInput.nextInt();
        
        int highestNumber = 0;
        int smallestNumber = 0;
        
        if(firstNumber > secondNumber) {
        	highestNumber = firstNumber;	
        }
        
        if (firstNumber > thirdNumber) {
        	highestNumber = firstNumber;
        }
        
        if(secondNumber > firstNumber) {
        	highestNumber = secondNumber;
        }
        
        if(secondNumber > thirdNumber) {
        	highestNumber = secondNumber;
        }
        
        if (thirdNumber > firstNumber)
        {
        	highestNumber = thirdNumber;
        }
        
        if (thirdNumber > secondNumber)
        {
        	highestNumber = thirdNumber;
        }
        
        if(firstNumber < secondNumber) {
        	smallestNumber = firstNumber;
        }
        
        if (firstNumber > thirdNumber)
        {
        	smallestNumber = firstNumber;
        }
        
        if(secondNumber < firstNumber) {
        	smallestNumber = secondNumber;
        }
        
        if(secondNumber < thirdNumber) {
        	smallestNumber = secondNumber;
        }
        
        if(thirdNumber < firstNumber) {
        	smallestNumber = thirdNumber;
        }
        
        if(thirdNumber < secondNumber) {
        	smallestNumber = thirdNumber;
        }
    
    	int product = firstNumber * secondNumber * thirdNumber;
    	int sum = firstNumber + secondNumber + thirdNumber;
    	int average = (firstNumber + secondNumber + thirdNumber)/2;
    
        System.out.println("the product is "  +  product);
        System.out.println("the sum is " +  sum);
        System.out.println("the average is "  +  average);
        System.out.println("the highest number is "  +  highestNumber);
        System.out.println("the smallest number is "  +  smallestNumber);
    }
}

