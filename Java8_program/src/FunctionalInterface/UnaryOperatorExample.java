package FunctionalInterface;

import java.util.function.UnaryOperator;

public class UnaryOperatorExample {
	public static void main(String[] args) {
		
		UnaryOperator<String> unaryOperator = (s) -> s.concat(" mishra");
		
		System.out.println(unaryOperator.apply("Sangam"));
		
	}
}
