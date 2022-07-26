package ParallelStream;

import java.util.stream.IntStream;

public class PerformSummation {
	
	public static void main(String[] args) {
		Sum sum1 = new Sum();
		Sum sum2 = new Sum();
		IntStream.rangeClosed(1, 1000)//500500
				 .forEach(sum1::performSum);
		
		
		IntStream.rangeClosed(1, 1000)//500500
		.parallel()
		 .forEach(sum2::performSum);

		System.out.println("Sequential Sum : " + sum1.getTotal());
		System.out.println("Parallel Sum : " + sum2.getTotal());
	}
}
