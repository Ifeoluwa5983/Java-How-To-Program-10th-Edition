package exercise215;
import java.util.Scanner;

public class MultipleCalculation 
{
    public static void main(String ...args)
    {
    	Scanner userInput = new Scanner(System.in);
        
    	System.out.println("Enter the first number");
        int firstNumber = userInput.nextInt();
        
        System.out.println("Enter the second number");
        int secondNumber= userInput.nextInt();
        
        int product = firstNumber * secondNumber;
        int sum = firstNumber + secondNumber;
        int quotient = firstNumber / secondNumber;
        int difference = firstNumber - secondNumber;
        
        System.out.println("the product is "  +  product);
        System.out.println("the sum is " +  sum);
        System.out.println("the quotient is " +  quotient);
        System.out.println("the difference is " +  difference);
        
        userInput.close();
    }
}
