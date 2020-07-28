package exercise720;
import java.util.Scanner;
public class TotalSales {
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		int row = 5;
		int column= 4;
		
		int[][] array = new int [row][column];
		
		for(int columns[] : array) {
			for (int j = 0; j < columns.length; j++) {
				System.out.println("Enter your number");
				columns[j] = input.nextInt();
			}
		}
		for(int rows[] : array) {
			for (int j = 0; j < rows.length; j++) {
				System.out.println("Enter the product number");
				rows[j] = input.nextInt();
			}
		}
		System.out.println("Enter the total dollar value of that product sold that day");
		int ans3 = input.nextInt();
		
		for(int columns[] : array) {
			for (int j = 0; j < columns.length; j++) {
				System.out.print(columns[j]);
			}
		for(int rows[] : array) {
			for (int j = 0; j < rows.length; j++) {
				System.out.print(rows[j]);
				}
		}
	}
	}
}
