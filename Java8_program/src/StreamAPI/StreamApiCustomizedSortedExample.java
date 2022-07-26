package StreamAPI;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import FunctionalInterface.Student;
import FunctionalInterface.StudentDataBase;

public class StreamApiCustomizedSortedExample {

	//Sort the student data by name
	public static List<Student> sortStudentName(){
		
		return StudentDataBase.getAllStudents()
		.stream().sorted(Comparator.comparing(Student::getName))
		.collect(Collectors.toList());
	}
	
	//Sort the student data by gpa
	public static List<Student> sortStudentByGpa(){
		
		return StudentDataBase.getAllStudents()
		.stream().sorted(Comparator.comparing(Student::getGpa))
		.collect(Collectors.toList());
	}

	//	Sort the student data by gpa desc
	public static List<Student> sortStudentByGpaDesc(){
		
		return StudentDataBase.getAllStudents()
		.stream().sorted(Comparator.comparing(Student::getGpa).reversed())
		.collect(Collectors.toList());
	}
	
	public static void main(String[] args) {
		
		System.out.println("Student in sorted manner\n");
		sortStudentName().forEach(System.out::println);
		
		System.out.println("Sorted the student by GPA\n");
		sortStudentByGpa().forEach(System.out::println);
		
		System.out.println("Sorted the student by GPA in Desc\n");
		sortStudentByGpaDesc().forEach(System.out::println);
	}
}
