package ParallelStream;

import java.util.function.Supplier;
import java.util.stream.IntStream;

public class ParallelStreamExample1 {

	public static long checkPerformaceResult(Supplier<Integer> supplier, int noOfTimes) {
		long startTime = System.currentTimeMillis();
		
		for (int i = 0; i < noOfTimes; i++) {
			supplier.get();
		}
		long endTime = System.currentTimeMillis();
		
		return endTime - startTime;
	}
	
	public static int sumSequentialStream() {
		return IntStream.rangeClosed(1, 100000)
				.sum();
	}
	
	
	public static int sumParallelStream() {
		return IntStream.rangeClosed(1, 100000)
				.parallel()
				.sum();
	}
	
	public static void main(String[] args) {
		//How to get the nmber of processor in the machine
		System.out.println("No of processor in the machine is : " + Runtime.getRuntime().availableProcessors());
		
		System.out.println("Sequentail Stream Result : " 
						+ checkPerformaceResult(ParallelStreamExample1::sumSequentialStream, 20));
		System.out.println("Parallel Stream Result : " 
						+ checkPerformaceResult(ParallelStreamExample1::sumParallelStream, 20));
		
	}
}
