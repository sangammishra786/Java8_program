package StreamAPI;

import FunctionalInterface.Student;
import FunctionalInterface.StudentDataBase;

public class StreamMapReduceFilterExample {

	public static int noOfBooks() {
		int noOfBooks = StudentDataBase.getAllStudents().stream() //stream<Student>
				//apply the filter
		.filter(student-> student.getGradeLevel()>=3)
		.filter(student-> student.getGender().equals("female"))
		.filter(student-> student.getGpa()>=3.9)
		.map(Student::getNoOfBook)  //Method referencing
		.reduce(0, (a, b)->(a + b));
		
		return noOfBooks;
	}
	
	public static void main(String[] args) {
		System.out.println("No of books is : " + noOfBooks());
	}
}
