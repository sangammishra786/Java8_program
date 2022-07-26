package StreamAPI;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import FunctionalInterface.Student;
import FunctionalInterface.StudentDataBase;

public class StreamApiExample {
	public static void main(String[] args) {
		
	Predicate<Student> p1 = (student) -> student.getGradeLevel()>=3;
	Predicate<Student> p2 = (student) -> student.getGpa()>=3.9;
		
	Map<String, List<String>> studentDetails =  StudentDataBase.getAllStudents().stream()
			.peek(student->{
				System.out.println("Without applying filter" + student);
			})
			.filter(p1)
			.peek(student->{
				System.out.println("after applying 1st filter" + student);
			})
			.filter(p2)
			.filter(p1)
			.peek(student->{
				System.out.println("after applying 2nd filter" + student);
			})
		.collect(Collectors.toMap(Student::getName, Student::getActivities));
	
	System.out.println(studentDetails);
	}
}
