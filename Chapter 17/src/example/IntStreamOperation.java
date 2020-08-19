package example;

import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class IntStreamOperation {

	public static void main(String[] args) {
		int[] values = {3,10,6,1,4,8,2,5,9,7};
		double[] values2 = new double [values.length];
		for(int i = 0;i < values.length;i ++) {
			values2[i] = values[i];
		}
		
		System.out.print("Original values: ");
		System.out.println(IntStream.of(values).mapToObj(String::valueOf).collect(Collectors.joining(" ")));
		System.out.printf("%nCount: %d%n", IntStream.of(values).sum());
		System.out.printf("Min: %d%n", IntStream.of(values).min().getAsInt());
		System.out.printf("Max: %d%n", IntStream.of(values).max().getAsInt());
		System.out.printf("Average: %.2f%n", DoubleStream.of((values2)).average().getAsDouble());
		System.out.printf("%nsum via reduce method: %d%n", IntStream.of(values).reduce(0,(x, y) -> x + y));
		System.out.printf("Product via reduce method: %d%n", IntStream.of(values).reduce((x, y) -> x * y).getAsInt());
		System.out.printf("sum of square via map: %d%n%n", IntStream.of(values).map(x -> x * x).sum());
		System.out.printf("Values displayed in sort: %s%n", IntStream.of(values).sorted().mapToObj(String ::valueOf)
				.collect(Collectors.joining()));
	}

}
