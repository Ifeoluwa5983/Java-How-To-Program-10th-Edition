package example;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ArraysAndStreams2 {

	public static void main(String[] args) {
		String[] strings = {"Red","range","Yellow","Green","Blue","Indigo","Violet"};
		System.out.printf("Original strings:%s%n", Arrays.asList(strings));
		System.out.printf("strings in uppercase: %s%n", Arrays.stream(strings)
				.map(String::toUpperCase)
				.collect(Collectors.toList()));
		System.out.printf("strings greater than m ascending: %s%n", Arrays.stream(strings)
				.filter(s-> s.compareToIgnoreCase("n") < 0)
				.sorted(String.CASE_INSENSITIVE_ORDER)
				.collect(Collectors.toList()));
		System.out.printf("strings greater than m sorted descending: %s%n",
				Arrays.stream(strings)
				.filter(s -> s.compareToIgnoreCase("n") < 0)
				.sorted(String.CASE_INSENSITIVE_ORDER.reversed()).collect(Collectors.toList()));
	}

}
