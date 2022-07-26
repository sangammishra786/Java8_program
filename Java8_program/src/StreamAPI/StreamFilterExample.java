package StreamAPI;

import java.util.List;
import java.util.stream.Collectors;

import FunctionalInterface.Student;
import FunctionalInterface.StudentDataBase;

public class StreamFilterExample {

	public static List<Student> filterStudent(){
		return StudentDataBase.getAllStudents().stream()
				.filter((student -> student.getGender().equals("female")))
				.filter(student-> student.getGpa()>=3.9)
				.collect(Collectors.toList());
	}
	
	public static void main(String[] args) {
		filterStudent().forEach(System.out::println);
	}
}
