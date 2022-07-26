package Default_static;

import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

import FunctionalInterface.Student;
import FunctionalInterface.StudentDataBase;

public class SortMethodPart1 {
	
	static Consumer<Student> studentConsumer = (student-> System.out.println(student));
	static Comparator<Student> nameComparator = Comparator.comparing(Student::getName);
	static Comparator<Student> gradeComparator = Comparator.comparing(Student::getGradeLevel);
	static Comparator<Student> gpaComparator = Comparator.comparing(Student::getGpa);
	
	public static void sortByName(List<Student> studentList) {
		System.out.println("After Sorting by name .........");
		studentList.sort(nameComparator);
		studentList.forEach(studentConsumer);
	}
	
	public static void sortByGpa(List<Student> studentList) {
		System.out.println("After Sorting by Gpa .........");
		studentList.sort(gpaComparator);
		studentList.forEach(studentConsumer);
	}
	
	public static void sortByGradeAndName(List<Student> studentList) {
		System.out.println("After Sorting by gradeAndThenName .........");
		Comparator<Student> studentComparator1 = Comparator.nullsLast(gradeComparator);
		Comparator<Student> studentComparator2 = Comparator.nullsLast(nameComparator);
		studentList.sort(studentComparator1.thenComparing(studentComparator2));
		studentList.forEach(studentConsumer);
	}
	
	public static void sortByNullValues(List<Student> studentList) {
		System.out.println("After Sorting by sortByNullValues .........");
		Comparator<Student> studentComparator1 = Comparator.nullsLast(nameComparator);
		studentList.sort(studentComparator1);
		studentList.forEach(studentConsumer);
	}
	
	public static void main(String[] args) {
		List<Student> studentList = StudentDataBase.getAllStudents();
		System.out.println("Before sorting......");
		studentList.forEach(studentConsumer);
		
		//sortByName(studentList);
		//sortByGpa(studentList);
		sortByGradeAndName(studentList);
		//sortByNullValues(studentList);
	}
}
