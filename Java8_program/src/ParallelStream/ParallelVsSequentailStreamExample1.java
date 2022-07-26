package ParallelStream;

import java.util.List;
import java.util.stream.Collectors;

import FunctionalInterface.Student;
import FunctionalInterface.StudentDataBase;

public class ParallelVsSequentailStreamExample1 {

	public static List<String> sequentialPrintActivities(){
		long startTime = System.currentTimeMillis();
		List<String> listOfActivities = StudentDataBase.getAllStudents()
				.stream()
				.map(Student::getActivities)
				.flatMap(List::stream)
				.sorted()
				.collect(Collectors.toList());
		
		long endTime = System.currentTimeMillis();
		System.out.println("Duration of Sequential Stream is : " + (endTime - startTime));
		return listOfActivities;
	}
	
	
	public static List<String> parallelPrintActivities(){
		long startTime = System.currentTimeMillis();
		List<String> listOfActivities = StudentDataBase.getAllStudents()
				.parallelStream()
				.map(Student::getActivities)  //stream<list<string>>
				.flatMap(List::stream)  //stream<string>
				.sorted()
				.collect(Collectors.toList());
		
		long endTime = System.currentTimeMillis();
		System.out.println("Duration of Sequential Stream is : " + (endTime - startTime));
		return listOfActivities;
	}
	
	public static void main(String[] args) {
		sequentialPrintActivities();
		parallelPrintActivities();
	}
}
