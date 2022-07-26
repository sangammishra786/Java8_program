package new_java8_program_DurgaSir;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

class Employee {
	String name;
	double salary;

	public Employee(String name, double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}

	public String toString() {
		return String.format("%s,%.2f", name, salary);
	}
}

public class EmployeeSalaryExample {
	public static void main(String[] args) {

		ArrayList<Employee> list = new ArrayList<Employee>();
		populate(list);
		System.out.println("Salary Before Increment");
		System.out.println(list);

		Predicate<Employee> p = e -> e.salary < 3000;
		Function<Employee, Employee> f1 = e -> {
			e.salary = e.salary + 500;
			return e;
		};

		ArrayList<Employee> l2 = new ArrayList<Employee>();
		for (Employee e : list) {
			if (p.test(e)) {
				l2.add(f1.apply(e));
			}
		}

		System.out.println("Salary After Increment");
		System.out.println(l2);

		Function<ArrayList<Employee>, Double> f = l -> {
			double total = 0;
			for (Employee e : list) {
				total = total + e.salary;
			}
			return total;
		};

		System.out.println("Total Employee salary is : " + f.apply(list));
	}

	public static void populate(ArrayList<Employee> list) {
		list.add(new Employee("Aman", 2000));
		list.add(new Employee("Sangam", 3500));
		list.add(new Employee("Saurabh", 3000));
		list.add(new Employee("kamal", 2000));
		list.add(new Employee("naman", 2500));
	}
}
