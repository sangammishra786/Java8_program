package FunctionalInterface;

import java.util.function.Predicate;

public class PredicateExample {
	static Predicate<Integer> predicate = (i)-> {return i%2==0;};
	static Predicate<Integer> predicate1 = (i)-> i%2==0;
	static Predicate<Integer> predicate2 = (i)-> i%5==0;
	
	public static void PredicateAnd() {
		System.out.println("Result of predicate and is "+ predicate1.and(predicate2).test(22));
	}
	
	public static void PredicateOr() {
		System.out.println("Result of predicate or is "+ predicate1.or(predicate2).test(22));
	}
	
	public static void PredicateNegate() {
		System.out.println("Result of predicate negate is "+ predicate1.negate().test(12));
		System.out.println("Result of predicate (negate+ or) is "+ predicate1.or(predicate2).negate().test(17));
	}
	
	public static void main(String[] args) {
		
		System.out.println("Result is : "+ predicate.test(10));
		System.out.println("Result is : "+ predicate1.test(13));
		PredicateAnd();
		PredicateOr();
		PredicateNegate();
	}
}
