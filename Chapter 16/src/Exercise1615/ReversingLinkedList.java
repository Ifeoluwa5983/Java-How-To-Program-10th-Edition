package Exercise1615;

import java.util.LinkedList;
import java.util.Random;

public class ReversingLinkedList {

	public static void main(String[] args) {
		LinkedList<Character> mylist = new LinkedList<Character>();
		LinkedList<Character> mylist2 = new LinkedList<Character>();
		StringBuilder myList = new StringBuilder();
		
		mylist.add('a');
		mylist.add('b');
		mylist.add('c');
		mylist.add('d');
		mylist.add('e');
		mylist.add('f');
		mylist.add('g');
		mylist.add('h');
		mylist.add('i');
		mylist.add('j');
		
		System.out.printf("The linkedList:%s ", mylist);
		
		for(Character mine : mylist) {
			myList.append(mine);	
		}
		
		myList.reverse();
		
		String backToString = new String(myList);
		
		char[] stringToChar = backToString.toCharArray();
	
		for (char output : stringToChar) {
		      mylist2.add(output);
		}
		
		System.out.printf("%nReversed likedList:%s", mylist2);
		//for(String words : backToString.split(" ")) {
			//mylist2.add(words);
	//}
	}
}
