package Optional;

import java.util.Optional;

import FunctionalInterface.Student;
import FunctionalInterface.StudentDataBase;

public class OptionalExample {
	//Simple way using null check
	public static String getStudentName() {
		//Student student = StudentDataBase.supplierStudent.get();
		Student student = null;
		if(student != null)
			return student.getName();
		
		return null;
	}
	
	//Using Optional to avoid burden of null check
	public static Optional<String> getStudentNameOptional(){
		
		Optional<Student> studentName = Optional.ofNullable(StudentDataBase.supplierStudent.get());
		//Optional<Student> studentName = Optional.ofNullable(null);
		if(studentName.isPresent()) {
			return studentName.map(Student::getName);
		}
		return Optional.empty();
	}
	
	
	public static void main(String[] args) {
		
		/*
		 * String name = getStudentName(); if(name != null)
		 * System.out.println("Length of student name is : " + name.length()); else
		 * System.out.println("Name not found");
		 */
		
		 
		
		//Using Optional
		
		  Optional<String> name1 = getStudentNameOptional(); 
		  if(name1.isPresent())
			  System.out.println("Length of student name is : " + name1.get().length());
		  else 
			  System.out.println("name not found");
		 
	}
}
