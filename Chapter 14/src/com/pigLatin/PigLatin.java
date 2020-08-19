package com.pigLatin;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PigLatin {

	public static void main(String[] args) {
		 
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a word or a phrase");
		String ans = input.nextLine();
		List<String> words = new ArrayList<String>();
		
		for(String word : ans.split(" ")) {
			char just = word.charAt(0);
			String w = word.substring(1);
			System.out.printf("%s%s%n",w + just + 'a' ,'y');	
		}
	}

}
