import java.util.stream.IntStream;

public class ImperativeVsDeclarativeExample1 {
	public static void main(String[] args) {
		
			/**
			 * Imperative Approach to fins the sum of first 100 numbers
			 */
		int sum = 0;
		long startTime = System.nanoTime();
		for (int i = 0; i <= 100; i++) {
			sum += i;
		}
		System.out.println("Sum of first 100 numbers using Imperative Approach : "+sum);
		long endTime   = System.nanoTime();
		long totalTime = endTime - startTime;
		System.out.println("Imperative Approach : " +totalTime);
		
		/**
		 * Decalarative Approach to get the sum of first 100 numbers
		 */
		
		long startTime1 = System.nanoTime();
		int sum1 = IntStream.rangeClosed(0, 100).parallel().sum();
		System.out.println("Sum of first 100 numbers using Declarative Approach : "+sum1);
		long endTime1   = System.nanoTime();
		long totalTime1 = endTime1 - startTime1;
		System.out.println("Decalarative Approach "+ totalTime1);
		
	}
}
