package FunctionalInterface;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Predicate;

public class BiConsumerExample {
	
	public static void printNameAndActivities() {
		
	BiConsumer<String, List<String>> biconsumer2 = (name, activities) -> System.out.println(name+" : "+activities);
	List<Student> studentList = StudentDataBase.getAllStudents();
	studentList.forEach((student -> biconsumer2.accept(student.getName(), student.getActivities())));
	
	}
	
	public static void getNameAndGPA() {
		System.out.println("\n");
		BiConsumer<String, Double> biConsumer3 = (name, gpa) -> System.out.println(name +" : "+gpa);
		List<Student> studentList2 = StudentDataBase.getAllStudents();
		studentList2.forEach(student -> {
			if(student.getGpa() >= 3.9) {
				biConsumer3.accept(student.getName(), student.getGpa());
			}
		});
	}
	
	public static void main(String[] args) {
		
		BiConsumer<String, String> biConsumer = (a, b) -> {
			System.out.println(a.toUpperCase()+" "+b.toUpperCase());
		};
		biConsumer.accept("java7", "java8");
		
		
		/*
		 * Creating a program to perform operation using BiConsumer Interface
		 */
		
		BiConsumer<Integer, Integer> multiply = (a, b) -> System.out.println("Multiplication : "+(a*b));
		BiConsumer<Integer, Integer> division = (a, b) -> System.out.println("Division : "+(a/b));
		
		multiply.andThen(division).accept(20, 5);
		//printNameAndActivities();
		getNameAndGPA();
		
	}
}
