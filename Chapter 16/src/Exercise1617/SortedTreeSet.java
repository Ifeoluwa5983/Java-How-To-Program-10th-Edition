package Exercise1617;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

import Exercise1613.DuplicateWordException;

public class SortedTreeSet {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a line of text");
		String userInput = input.nextLine();

		TreeSet<String> result = new TreeSet<String>();
		
		for(String results : userInput.split(" ")) {
			results = results.toLowerCase();
			result.add(results);
		}
		
		System.out.println(result);
	 

	}

}
