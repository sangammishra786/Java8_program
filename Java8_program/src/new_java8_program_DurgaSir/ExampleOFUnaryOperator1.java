package new_java8_program_DurgaSir;

import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class ExampleOFUnaryOperator1 {
	public static void main(String[] args) {

		UnaryOperator<Integer> u = i -> i * i;
		System.out.println(u.apply(10));

		// BinaryOperator

		BinaryOperator<String> f = (s1, s2) -> s1 + s2;
		System.out.println(f.apply("Sangam", " Mishra"));
	}
}
