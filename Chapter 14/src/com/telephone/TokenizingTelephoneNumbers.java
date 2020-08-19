package com.telephone;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TokenizingTelephoneNumbers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a 10 digit number in the format: (000) 000-0000:");
		String number = input.nextLine();
		List<String> numbers = new ArrayList<String>();
		
		for(String token : number.split(" ")) {
			numbers.add(token);		
			}
		
		System.out.println(numbers);
		
		String areaCode = numbers.get(0);
		//System.out.println(areaCode);
		String[] arrayToken = numbers.get(1).split("-");
		for(String i : arrayToken) {
			System.out.println(i);
		}
		System.out.println(arrayToken[0] + " " + arrayToken[1]);
		System.out.printf("The phone number is %s%3s-%s" ,areaCode, arrayToken[0], arrayToken[1] );
		}

}
