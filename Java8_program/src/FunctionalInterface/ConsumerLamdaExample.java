package FunctionalInterface;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerLamdaExample {
		
	static Consumer<Student> c1 = (student)->System.out.println(student);
	static Consumer<Student> c2 = (student)->System.out.print(student.getName());
	static Consumer<Student> c3 = (student)->System.out.println(student.getActivities());
		
	public static void printStudent() {
			System.out.println("\nprintStudent");
			List<Student> studentList = StudentDataBase.getAllStudents();
			studentList.forEach(c1);
		}
		
		public static void printNameAndActivities() {
			System.out.println("\nprintNameAndActivities");
			List<Student> studentList2 = StudentDataBase.getAllStudents();
			studentList2.forEach(c2.andThen(c3));
		}
		
		public static void printNameAndActivitiesApplyingCondition() {
			System.out.println("\nprintNameAndActivitiesApplyingCondition");
			List<Student> listStudent3 = StudentDataBase.getAllStudents();
			listStudent3.forEach((student -> {
				if(student.getGradeLevel() >= 3) {
					c2.andThen(c3).accept(student);
				}
			}));
		}
		
		
		
		
		
		/*
		 * Consumer<String> consumer = (str) -> System.out.println("Result is : "+
		 * str.toUpperCase()); consumer.accept("sangam");
		 */
		public static void main(String[] args) {
		printStudent();
		printNameAndActivities();
		printNameAndActivitiesApplyingCondition();
	}
}
