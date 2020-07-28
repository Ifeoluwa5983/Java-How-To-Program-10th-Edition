package exercise717;

import java.util.Random;
public class RollDie {

	public static void main(String[] args) {
		Random rollDie = new Random();
		
		final int totalNumber = 36000000;
		int dice1, dice2, counter;
		
		int [] array = {2,3,4,5,6,7,8,9,10,11,12};
		int [] array2 = {array.length};
		
		dice1 = rollDie.nextInt(6) + 1;
		dice2 = rollDie.nextInt(6) + 1;
		
		for(counter = 1;counter <= totalNumber;counter++) {
			int sum = dice1 + dice2;
			
			if(array[counter]== sum) {
				array2[counter]++;
					}
			}
		for(int j = 1;j <= array.length;j++) {
			System.out.println();
		}

	}

}
