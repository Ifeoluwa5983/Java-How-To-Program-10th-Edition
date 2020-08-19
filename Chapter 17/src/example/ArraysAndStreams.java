package example;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class ArraysAndStreams {

	public static void main(String[] args) {
		Integer[] values = {3,10,6,1,4,8,2,5,9,7};
		
		System.out.printf("Original values: %s%n" , Arrays.asList(values));
		System.out.printf("Sorted values: %s%n" , 
				Arrays.stream(values)
				.sorted()
				.collect(Collectors.toList()));
		
		List<Integer> greaterThan4 = 
				Arrays.stream(values)
				.filter(value -> value > 4)
				.collect(Collectors.toList());
		
		List<Integer> greaterThan4sorted = 
				Arrays.stream(values)
				.filter(value -> value > 4)
				.sorted()
				.collect(Collectors.toList());
		
		
		List<Integer> greaterThan4Ascending = 
				greaterThan4.stream()
				.sorted()
				.collect(Collectors.toList());
		
	}

}
