package example;

import static org.junit.Assume.assumeFalse;

import java.util.stream.IntStream;

public class StreamMapReduce {

	public static void main(String[] args) {
		System.out.printf("Sum of even numbers from range 2- 20 is: %d%n",
				IntStream.rangeClosed(1,10).map((int x) ->{return x * 2;}).sum());//x -> return x * 2
		
	}

}
