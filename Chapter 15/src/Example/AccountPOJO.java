package Example;

import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class AccountPOJO {
	
	private static Formatter output; 
	public static void main(String[] args){
		
		 addRecords();
		 closeFile();
		 } 
		public static void addRecords(){
			Scanner input = new Scanner(System.in);
		try {
		System.out.printf("%s%n%s%n? ", 
		"Enter account number, first name, last name and balance.",
		"Enter end-of-file indicator to end input.");
			
		while (input.hasNext()) {
			try {output = new Formatter("Piece.txt");
				output.format("%d %s %s %f%n", input.nextInt(),
					 input.next(), input.next(), input.nextDouble());}
		 
			catch (FormatterClosedException formatterClosedException)
			 {
			 System.err.println("Error writing to file. Terminating."); 
			break;
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
		}
		}	 
		catch (NoSuchElementException elementException)
			 {
			 System.err.println("Invalid input. Please try again.");
			 input.nextLine(); // discard input so user can try again
			 } 
			
			 System.out.print("? ");
		} 
		
			public static void closeFile()
			 {
			 if (output != null)
				 output.close();
			
			 
			} 

		 }


