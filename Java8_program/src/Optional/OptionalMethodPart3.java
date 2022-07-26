package Optional;

import java.util.Optional;

import FunctionalInterface.Bike;
import FunctionalInterface.Student;
import FunctionalInterface.StudentDataBase;

public class OptionalMethodPart3 {
	//filter()
	public static void filetrMethod() {
		Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.supplierStudent.get());
				 studentOptional
						.filter(student -> student.getGpa()>= 3.5)
						.ifPresent(student -> System.out.println(student));
						
	}
	//map()
	public static void mapMethod() {
		Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.supplierStudent.get());
		if(studentOptional.isPresent()) {
			Optional<String> stringOptional = studentOptional
						.filter(student -> student.getGpa()>= 3.5)
						.map(Student::getName);
				 System.out.println(stringOptional.get());
		}
	}
	//flatMap()
	public static void flatMapMethod() {
		Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.supplierStudent.get());  //Optional<Student>
			
		Optional<String> bikeName = studentOptional
			.filter(student -> student.getGpa()>=3.5)  //Optional<Student <Optional<Bike>>>
			.flatMap(Student:: getBike) //Optional<Bike>
			.map(Bike::getName);
			
		bikeName.ifPresent(s-> System.out.println("Name : " + s));
			
	}
	
	public static void main(String[] args) {
		filetrMethod();
		mapMethod();
		flatMapMethod();
	}
}
