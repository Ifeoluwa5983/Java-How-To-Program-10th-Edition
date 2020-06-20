package exercise216;
import java.util.Scanner;
public class Compare {
	  public static void main(String... args){
          Scanner input=new Scanner(System.in);
          System.out.println("Enter the first number");
          int firstNumber=input.nextInt();
          System.out.println("Enter the second number");
          int secondNumber=input.nextInt();
          if(firstNumber > secondNumber){
              System.out.println("First number is greater than second number");
          }
          else if(firstNumber < secondNumber){
              System.out.println("First number is less than second number");
          }
          else{
              System.out.println("First number is equals to second number");
      }
          input.close();
  }

}
