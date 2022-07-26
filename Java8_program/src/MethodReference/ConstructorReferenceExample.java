package MethodReference;

import java.util.function.Function;
import java.util.function.Supplier;

import FunctionalInterface.Student;

public class ConstructorReferenceExample {

	static Supplier<Student> studentSupplier = Student::new;
	
	static Function<String, Student> studentReferenceFunction = Student::new;
	
	public static void main(String[] args) {
		System.out.println(studentSupplier.get());
		System.out.println(studentReferenceFunction.apply("sangam"));
	}
}
