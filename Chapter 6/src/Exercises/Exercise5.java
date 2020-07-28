package Exercises;

public class Exercise5 {

	public static void main(String[] args) {
		int count = 1;
		int number = 5;
		count = number - 1;
		for(int i = 1;i <= number;i = i++) {
			
			for(int j = 0;j < count;j++) {
			    System.out.print(" ");
			}
			
			for(int j = 0; j <= i;j++) {
			    System.out.print("* ");
		   }
			System.out.print("");
			count--;
		}	
       count = 1;
       for(int i = number;i > 0;i--) {
    	   for (int j = 0;j < count;j++) {
    		   System.out.print(" ");
    	   }
    	   
    	   for(int j = 0;j < i;j ++) {
    		   System.out.print("* ");
    	   }
    	   System.out.print("");
    	   count++;
       }
       
		}

}
