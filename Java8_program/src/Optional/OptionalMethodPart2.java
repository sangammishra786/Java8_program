package Optional;

import java.util.Optional;

import FunctionalInterface.Student;
import FunctionalInterface.StudentDataBase;

public class OptionalMethodPart2 {
	
	public static String orElseMethod() {
		//Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.supplierStudent.get());
		Optional<Student> studentOptional = Optional.ofNullable(null);
		String name = studentOptional.map(Student::getName).orElse("Default");
		return name;
	}
	
	public static String orElseGetMethod() {
		Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.supplierStudent.get());
		//Optional<Student> studentOptional = Optional.ofNullable(null);
		String name = studentOptional.map(Student::getName).orElseGet(()-> "Default");
		return name;
	}
	
	public static String orElseThrowMethod() {
		Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.supplierStudent.get());
		//Optional<Student> studentOptional = Optional.ofNullable(null);
		String name = studentOptional.map(Student::getName).orElseThrow(()-> new RuntimeException("No Data Found"));
		return name;
	}
	
	
	public static void main(String[] args) {
		System.out.println("orElseMethod : " + orElseMethod());
		System.out.println("orElseGetMethod : " + orElseGetMethod());
		System.out.println("orElseThrowMethod : " + orElseThrowMethod());
	}
}
