package StreamAPI;

import java.util.List;
import java.util.Set;
//import static java.util.stream.Collectors.toList;
import java.util.stream.Collectors;

import FunctionalInterface.Student;
import FunctionalInterface.StudentDataBase;

public class StreamMapOperationExample {
		
	public static List<String> nameList(){
		
		List<String> studentName = StudentDataBase.getAllStudents().stream()
				.map(Student::getName)
				.collect(Collectors.toList());
		return studentName;
	}
	
public static Set<String> nameSet(){
		
		Set<String> studentSet = StudentDataBase.getAllStudents().stream()
				.map(Student::getName)
				.collect(Collectors.toSet());
		return studentSet;
	}
	
	public static void main(String[] args) {
		System.out.println(nameList());
		System.out.println(nameSet());
	}
}
