package StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import FunctionalInterface.Student;
import FunctionalInterface.StudentDataBase;

public class StreamReduceExample1 {
	
	//When we using the reduce method with identity 
	public static int performReduceOperation(List<Integer> integerList) {
		
		return integerList.stream()
				.reduce(1, (a,b)-> a*b);
	}
	
	//Now, we use the reduce operation without identity
	public static Optional<Integer> performReduceOperationwithoutIdentity(List<Integer> integerList1) {
		return integerList1.stream()
				.reduce((a, b) -> (a * b));
	}
	
	//Get the student details whose gpa is highest among all
	public static Optional<Student> getHighestGpaStudent(){
		return StudentDataBase.getAllStudents().stream()
				.reduce((s1, s2)-> (s1.getGpa() > s2.getGpa() ? s1: s2));
	}
	
	public static void main(String[] args) {
	
		List<Integer> integerList = Arrays.asList(1,2,3,4,5);
		System.out.println(performReduceOperation(integerList));
				
		Optional<Integer> result = performReduceOperationwithoutIdentity(integerList);
		System.out.println(result.isPresent());
		System.out.println(result.get());
		
		List<Integer> integers = new ArrayList<Integer>();
		Optional<Integer> result1 = performReduceOperationwithoutIdentity(integers);
		if(result1.isPresent()) {
		System.out.println(result1.get());
		}else
			System.out.println("Sorry !!....List is empty");
		
		Optional<Student> student = getHighestGpaStudent();
		if(student.isPresent()) {
		System.out.println(student);
		}
	}
}
