package Numericstream;

import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class NumericStreamRangeExample {
	public static void main(String[] args) {
		
		System.out.println("No of element in IntStream : " + IntStream.range(1, 50).count());
		IntStream.range(1, 50).forEach(values -> System.out.print(values+" "));
		
		System.out.println("\nNo of element in RangeClosed : " + IntStream.rangeClosed(1, 50).count());
		IntStream.rangeClosed(1, 50).forEach(values -> System.out.print(values+ " "));
		
		System.out.println("\nNo of element in LongStream : " + LongStream.range(1, 50).count());
		LongStream.range(1, 50).forEach(values -> System.out.print(values+" "));
		
		System.out.println("\nNo of element in RangeClosed : " + LongStream.rangeClosed(1, 50).count());
		LongStream.rangeClosed(1, 50).forEach(values -> System.out.print(values+ " "));
		
		System.out.println("\nNo of element in DoubleStream : " + IntStream.range(1, 50).count());
		IntStream.range(1, 50).asDoubleStream().forEach(values -> System.out.print(values+" "));
		
		
	}
}
