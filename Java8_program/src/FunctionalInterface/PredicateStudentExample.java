package FunctionalInterface;

import java.util.List;
import java.util.function.Predicate;

public class PredicateStudentExample {
	static Predicate<Student> p1 = (student)->{return student.getGradeLevel()>=3;};
	static Predicate<Student> p2 = (student)->{return student.getGpa()>=3.9;};
	
	public static void printDetails() {
		System.out.println("PredicateStudentExample...................");
		List<Student> studentList = StudentDataBase.getAllStudents();
		studentList.forEach((student -> {
			if(p1.test(student)) {
				System.out.println(student);
			}
		}));
	}
	
	public static void filterStudents() {
		System.out.println("\nfilterStudents..................");
		List<Student> studentList1 = StudentDataBase.getAllStudents();
		studentList1.forEach((student ->{
			if(p1.and(p2).test(student)) {
				System.out.println(student);
			}
			/*
			 * else { System.out.println("Data Not found"); }
			 */
		}));
	}
	public static void main(String[] args) {
		printDetails();
		filterStudents();
	}
}
