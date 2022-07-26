package FunctionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierExample {
	
	static Supplier<Student> supplier = ()-> {
		return  new Student("Adam",2,4.0,"male", Arrays.asList("swimming", "basketball","volleyball"));
	};
	
	static Supplier<List<Student>> studentSuplier = () -> StudentDataBase.getAllStudents();
	public static void main(String[] args) {
		
		Student student = supplier.get();
		System.out.println(student);
		
		System.out.println(studentSuplier.get()+"\n");
	}
}
