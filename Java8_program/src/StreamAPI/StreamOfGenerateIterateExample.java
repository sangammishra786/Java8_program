package StreamAPI;

import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class StreamOfGenerateIterateExample {

	public static void main(String[] args) {
		
		//of() method of stream API
		Stream<String> streamString = Stream.of("sangam", "milan", "pawan");
		streamString.forEach(System.out::println);
		
		//Itereate() of Stream API
		Stream.iterate(1, x->x*2)
		.limit(10)
		.forEach(System.out::println);
		
		Supplier<Integer> streamSupplier = new Random()::nextInt;
		Stream.generate(streamSupplier)
		.limit(5)
		.forEach(System.out::println);
	}
}
