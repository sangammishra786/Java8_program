package MethodReference;

import java.util.function.Consumer;

import FunctionalInterface.Student;
import FunctionalInterface.StudentDataBase;

public class FunctionMethodConsumerExample {
		
	//ClassName::methodName
	static Consumer<Student> c1 = System.out::println;
	
	
	//className::instanceMethodName
	static Consumer<Student> c2 = Student::printListOfActivities;
	
	public static void main(String[] args) {
		StudentDataBase.getAllStudents().forEach(c1);
		
		StudentDataBase.getAllStudents().forEach(c2);
	}
}
