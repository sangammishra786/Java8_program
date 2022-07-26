package Numericstream;

import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class NumericStreamAggregateExample {
	public static void main(String[] args) {
		
		//Apply the sum(), Min(), Max(), average()
		int summation = IntStream.rangeClosed(1, 50).sum();
		System.out.println("Sum of natural number is : "+ summation);
		
		OptionalInt optionalInt = IntStream.rangeClosed(1, 45).max();
		System.out.println("Max value is : " + optionalInt.isPresent() != null ? optionalInt.getAsInt() : 0);
		
		OptionalInt optionalInt2 = IntStream.rangeClosed(52, 100).min();
		System.out.println("Min value is : " + optionalInt2.isPresent() != null? optionalInt2.getAsInt() : 0);
		
		OptionalDouble optionalDouble = LongStream.rangeClosed(1, 50).average();
		System.out.println("Average is : " + optionalDouble.getAsDouble());
	}
}
