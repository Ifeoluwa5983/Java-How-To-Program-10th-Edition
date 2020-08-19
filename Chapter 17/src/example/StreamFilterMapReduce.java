package example;

import java.util.stream.IntStream;

public class StreamFilterMapReduce {

	public static void main(String[] args) {
		System.out.printf("Sum of the triples of the even numbers from 2 through 10 is : %d%n" ,
				IntStream.rangeClosed(2, 10).filter(x -> x % 2 == 0)
				.map(x -> x * 3)
				.sum());
	}

}
