package Numericstream;

import java.util.List;
import static java.util.stream.Collectors.toList;
import java.util.stream.IntStream;

public class NumbericStreamBoxingUnboxingExample {
	
	//Perform the boxing convert int value into wrapper class
	public static List<Integer> boxing() {
		return IntStream.rangeClosed(1, 10)
		.boxed()
		.collect(toList());
	}
	
	//Convert wrapper class into int value
	public static int unBoxing(List<Integer> integerList) {
		return integerList.stream()
		.mapToInt(Integer::intValue)  //intStream(intValue of the wrapper class)
		.sum();
	}
	
	
	//Convert each element into mapToObject method
	
	public static List<Integer> mapToObject() {
		return IntStream.rangeClosed(1, 5)
				.mapToObj((i) ->{
					return new Integer(i);
				})
				.collect(toList());
	}
	
	public static void main(String[] args) {
		System.out.println("Boxing is : " + boxing());
		List<Integer> integerList = boxing();
		System.out.println("UnBoxing is : " + unBoxing(integerList));
		
		System.out.println("mapToObject : " + mapToObject());
	}
}
