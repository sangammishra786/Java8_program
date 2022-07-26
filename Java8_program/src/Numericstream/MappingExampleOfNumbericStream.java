package Numericstream;

import java.util.List;
import static java.util.stream.Collectors.*;

import FunctionalInterface.Student;
import FunctionalInterface.StudentDataBase;

public class MappingExampleOfNumbericStream {
	public static void main(String[] args) {
		
		//Old way
		List<String> nameStudent =  StudentDataBase.getAllStudents().stream()
						.map(Student::getName)
						.collect(toList());
		
		
		//Using mapping as a terminal operation
		List<String> nameStudentMapping = StudentDataBase.getAllStudents()
				.stream()
				.collect(mapping(Student::getName, toList()));
		
		
		System.out.println(nameStudent);
		System.out.println(nameStudentMapping);
	}
}
