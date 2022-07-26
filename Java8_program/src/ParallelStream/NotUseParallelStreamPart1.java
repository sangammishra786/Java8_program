package ParallelStream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NotUseParallelStreamPart1 {

	public static int sequentialStreamSum(List<Integer> integerList) {
		
	long startTime = System.currentTimeMillis();
	int sum = integerList.stream()
			.reduce(0, (a, b) -> a + b);
	
	long endTime  = System.currentTimeMillis();
	System.out.println("Duration in sequential : " + (endTime- startTime));
	
	return sum;
	}
	
	public static int parallelStreamSum(List<Integer> integerList) {
		
		long startTime = System.currentTimeMillis();
		int sum = integerList
				.parallelStream()
				.reduce(0, (a, b) -> a + b);  //it perform unboxing from Integer to int
		
		long endTime  = System.currentTimeMillis();
		System.out.println("Duration in Parallel : " + (endTime- startTime));
		
		return sum;
		}
	
	public static void main(String[] args) {
		List<Integer> integerList = IntStream.rangeClosed(1, 100000)
				.boxed()
				.collect(Collectors.toList());
		sequentialStreamSum(integerList);
		parallelStreamSum(integerList);
	}
}
