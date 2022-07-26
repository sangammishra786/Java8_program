package MethodReference;

import java.util.function.Function;

public class FunctionMethodReferenceExample {
		
	static Function<String, String> toUpeerCase = (s)-> s.toUpperCase();  //it is the simole way
	
	//Now using the method referencing
	static Function<String, String> toUpperCaseReference = String::toUpperCase;
	public static void main(String[] args) {
	
		System.out.println(toUpeerCase.apply("sangam"));
		System.out.println(toUpperCaseReference.apply("sangam"));
	}
}
