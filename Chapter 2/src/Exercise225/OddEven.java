package Exercise225;

import java.util.Scanner;

public class OddEven {
    public static void main(String... args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = userInput.nextInt();
        if(number % 2 == 0){
            System.out.println("The number is an even number");
        }
        else{
            System.out.println("The number is an odd number");
        }
        userInput.close();
        }
    }
