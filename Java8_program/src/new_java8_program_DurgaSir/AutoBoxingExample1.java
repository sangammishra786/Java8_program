package new_java8_program_DurgaSir;

import java.util.function.IntFunction;
import java.util.function.IntPredicate;
import java.util.function.IntToDoubleFunction;
import java.util.function.ToIntFunction;

public class AutoBoxingExample1 {
	public static void main(String[] args) {
		
		//Integer i = 10;
		//It will automatically converted into
		//Integer i = Integer.valueOf(10);
		//System.out.println(i);
		
		
		//Example for primitive type functional interface
		int[] x = {0,5,10,15,20,25};
		
		IntPredicate p = i -> i % 2 == 0;
		for(int x1 : x) {
			if(p.test(x1)) {
				System.out.println(x1);
			}
		}
		/*
		 * Similarly for long and the Double primitive type interface is present
		 * 
		 * LongPredicate, DoublePredicate
		 */

		
		//Function
		IntFunction<Integer> f = i1 -> i1 * i1;
		System.out.println(f.apply(5));
		
		ToIntFunction<String> f1 = s -> s.length();
		System.out.println(f1.applyAsInt("sangam"));
		
		IntToDoubleFunction f2 = i -> Math.sqrt(i);
		System.out.println(f2.applyAsDouble(25));
	}
}
