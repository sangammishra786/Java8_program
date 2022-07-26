package new_java8_program_DurgaSir;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

class Student {
	String name;
	int marks;

	public Student(String name, int marks) {
		super();
		this.name = name;
		this.marks = marks;
	}
}

public class FunctionExampleStudentGrade {
	public static void main(String[] args) {

		ArrayList<Student> l = new ArrayList<Student>();
		populate(l);

		Function<Student, String> f = s -> {
			int marks = s.marks;
			if (marks >= 80)
				return "A[Dictinction]";
			else if (marks >= 60)
				return "B[First class]";
			else if (marks >= 50)
				return "C[Second class]";
			else if (marks >= 35)
				return "D[Third class]";
			else
				return "E[Fail]";
		};

		Predicate<Student> p = s -> s.marks >= 60;

		for (Student s : l) {
			if (p.test(s)) {

				System.out.println("Name : " + s.name);
				System.out.println("Marks : " + s.marks);
				System.out.println("Grade : " + f.apply(s));
				System.out.println("*************\n");

			}
		}

	}

	public static void populate(ArrayList<Student> list) {
		list.add(new Student("Aman", 65));
		list.add(new Student("Sangam", 85));
		list.add(new Student("Saurabh", 30));
		list.add(new Student("Kamal", 55));
		list.add(new Student("janam", 40));
	}
}
