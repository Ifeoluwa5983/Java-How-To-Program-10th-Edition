package com.searchstrings;

import java.util.Scanner;

public class SearchingStrings {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a line of text");
		String userInput = input.nextLine();
		
		System.out.println("What letter do you want to search for");
		String letter = input.next();
		
		int count = 0;
		int numberOfTimes = 0;
		int number = 0;
		
		for (int i = 0, n = userInput.length(); i < n; i++) {
		    char c = userInput.charAt(i);
	}

}
}