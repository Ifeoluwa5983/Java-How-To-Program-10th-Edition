package Exercise1713;

import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class DuplicateWords {

	public static void main(String[] args) {
		
		 Stream.of("HelLo", "hI", "HI")
		.map( x -> x.toLowerCase())
		.distinct()
		.forEach(System.out::println);
	
	}

}
