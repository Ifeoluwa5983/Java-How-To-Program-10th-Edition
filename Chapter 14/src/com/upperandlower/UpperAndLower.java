package com.upperandlower;

import java.util.Scanner;

public class UpperAndLower {
	public static void main(String ...args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a line of text");
		String userInput = input.nextLine();
		String toUppercase = userInput.toUpperCase();
		String toLowercase = userInput.toLowerCase();
		
		System.out.println(toLowercase);
		System.out.println(toUppercase);
	}

}
