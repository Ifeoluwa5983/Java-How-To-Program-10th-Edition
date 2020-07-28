package exercise719;
import java.util.Scanner;
public class AirlineReservation {
	public static void main(String[]  args) {
		
		boolean[] seat = new boolean[10];
		int economyCount = 1;
		int firstCount = 1;
		boolean finished;
		Scanner input = new Scanner(System.in);
		
		while(true) {
			System.out.println("Please type 1 for First-class and 2 for Economy-class......enter 0 to quit");
			int ans = input.nextInt();
			if(ans == 0) {break;
			}
			if(ans == 1) {
				for(int i = 0;i < 5;i ++) {
					if(seat[i] == false) {
						seat[i] = true;
						firstCount++;
						System.out.println("You are in the first class section and your seat number is " + (i + 1));
						break;
					}
					if(firstCount > 5){
						System.out.print("First section is full.Enter 1 to be placed in a economy class section");
						break;
					}
				}
			}
			else if(ans == 2) {
				for(int j = 5;j < 10;j++) {
					if(seat[j] == false) {
						seat[j] = true;
						economyCount ++;
						System.out.println("You are in the economy class section and your seat number is " + (j + 1));
						break;
					}
					if(economyCount > 5){
						System.out.print("Economy section is full.Enter 1 to be placed in a first class section");
						break;
					}
				}
				
				}
			if(economyCount > 5 && firstCount > 5 ) {
				System.out.println("All sections are full");
				break;
			}
			for(boolean seats : seat) {
				System.out.print(seats + " ");
				
			}
		}
	}
		
	}


