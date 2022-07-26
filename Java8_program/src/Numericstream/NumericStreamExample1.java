package Numericstream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class NumericStreamExample1 {

	public static int sumOfNumbers(List<Integer> integerList) {
		
		return integerList.stream()
				.reduce(0, (a,b)-> (a + b));  //Unboxing to convert Integer to int
	}
	
	public static int sumOfNumbersIntStream() {
		return IntStream.rangeClosed(1, 6)
				.sum();
	}
	
	public static void main(String[] args) {
		List<Integer> interList = Arrays.asList(1,2,3,4,5,6);
		System.out.println("Sum of natural number is : " + sumOfNumbers(interList));
		System.out.println("Sum of n natural number using IntStream : " + sumOfNumbersIntStream());
	}
}
