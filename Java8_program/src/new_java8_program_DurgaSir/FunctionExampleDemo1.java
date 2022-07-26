package new_java8_program_DurgaSir;

import java.util.function.Function;

public class FunctionExampleDemo1 {
	
	public static void main(String[] args) {
		
		Function<String, Integer> f = s -> s.length();
		System.out.println(f.apply("Sangam"));
		
		//Program to remove all the spaces present in the string.
		
		String str = "Sangam Mishra is working in HCL Technologies";
		Function<String, String> f1 = s -> s.replaceAll(" ", "");
		System.out.println(f1.apply(str));
		
		//program to count the number of spaces present in the string.
		Function<String, Integer> f2 = s -> s.length() - s.replaceAll(" ", "").length();
		System.out.println(f2.apply(str));
		
		}
}
