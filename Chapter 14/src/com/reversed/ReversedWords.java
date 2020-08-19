package com.reversed;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReversedWords {

	public void reveseWord() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a sentence");
		String word = input.nextLine();
		duplicateText(word);
		List<String> reverse = new ArrayList<String>();
		
		StringBuilder build = new StringBuilder(word);
		build.reverse();
		String backToString = new String(build);
		
		for(String words : backToString.split(" ")) {
			reverse.add(words);
		}
		System.out.println(reverse);
		

	}
	public void duplicateText(String word) {
		word = word.toUpperCase();
		word = word.toLowerCase();
	}

}
