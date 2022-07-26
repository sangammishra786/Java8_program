package FunctionalInterface;

import java.util.Comparator;
import java.util.function.BinaryOperator;

public class BinaryOperatorExample {
	static Comparator<Integer> comparator = (a,b)-> a.compareTo(b);
	
	public static void main(String[] args) {
		
		BinaryOperator<Integer> binaryOperator = (a,b) -> a*b;
		
		System.out.println(binaryOperator.apply(17, 19));
		
		BinaryOperator<Integer> maxBy = BinaryOperator.maxBy(comparator);
		System.out.println("Result is maxBy  " + maxBy.apply(23, 2));
		
		BinaryOperator<Integer> minBy = BinaryOperator.minBy(comparator);
		System.out.println("Result is minBy  " + minBy.apply(23, 2));
		
	}
}
