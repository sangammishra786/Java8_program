package StreamAPI;

import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import FunctionalInterface.Student;
import FunctionalInterface.StudentDataBase;

public class StreamFlatMapExample {
 
	public static List<String> studentActivities(){
		
		List<String> studentActivities = StudentDataBase.getAllStudents().stream()  //stream<student>
		.map(Student::getActivities)  //stream<List<String>>
		.flatMap(List::stream)
		.distinct()
		.sorted()
		.collect(Collectors.toList());
		
		return studentActivities;
	}
	
	public static Set<Student> setOfStudentActivities(){
		
		return StudentDataBase.getAllStudents().stream()  //stream<student>
				.sorted(Comparator.comparing(Student::getName))
				/*
				 * .map(Student::getActivities) //stream<List<String>> .flatMap(List::stream)
				 * .distinct()
				 */
		.collect(Collectors.toSet());
		
		//return setOfStudentActivities;
	}
	
public static long getStudentActivitiesCount(){
		
		long studentActivitiesCount = StudentDataBase.getAllStudents().stream()  //stream<student>
		.map(Student::getActivities)  //stream<List<String>>
		.flatMap(List::stream)
		.distinct()
		.count();
		
		return studentActivitiesCount;
	}
	
	public static void main(String[] args) {
		System.out.println("using List\n"+studentActivities());
		setOfStudentActivities().forEach(System.out::println);
		System.out.println("\nCount no of avtivities\n" + getStudentActivitiesCount());
	}
}
