package Exercise1614;

import java.util.LinkedList;
import java.util.Random;

public class SortedLinkedList {

	public static void main(String[] args) {
		Random random = new Random();
		LinkedList<Integer> mylist = new LinkedList<Integer>();
		int sum = 0;
		float average = 0;
		
		for (int i = 1;i <= 20; i ++) {
			int rand = random.nextInt(100);
			mylist.add(rand);
			sum = sum + rand;
			average = sum / 20;	
		}
		for(int i = mylist.size()-1;i > 0;i--) {
			for(int j = 0;j < i;j++) {
				if(mylist.get(j) > mylist.get(j + 1)) {
					swap(mylist , j ,j + 1);
				}
			}
		}
		System.out.println(mylist);
		System.out.println("The sum of the random numbers is " + sum);
		System.out.println("The average of the random numbers is " + average);

	}
	public static void swap(LinkedList<Integer> mylist,int i,int j) {
		if(i == j) {
			return;
		}
		int temp = mylist.get(i);
		mylist.set(i, mylist.get(j));
		mylist.set(j, temp);
	}

}
