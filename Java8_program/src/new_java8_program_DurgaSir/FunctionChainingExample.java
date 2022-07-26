package new_java8_program_DurgaSir;

import java.util.function.Function;

public class FunctionChainingExample {
	public static void main(String[] args) {

		String str = "Sangammishra";
		Function<String, String> f1 = s -> s.toUpperCase();
		Function<String, String> f2 = s -> s.substring(0, 9);

		System.out.println(f1.apply(str));
		System.out.println(f2.apply(str));
		System.out.println(f1.andThen(f2).apply(str));
		System.out.println(f1.compose(f2).apply(str));

		// difference between andThen() and compose()
		Function<Integer, Integer> f3 = i -> i + i;
		Function<Integer, Integer> f4 = i -> i * i * i;

		System.out.println(f3.andThen(f4).apply(2));
		System.out.println(f3.compose(f4).apply(2));
		
		//Demo of identity() method
		
		Function<String, String> f = Function.identity();
		System.out.println(f.apply(str));

	}
}
