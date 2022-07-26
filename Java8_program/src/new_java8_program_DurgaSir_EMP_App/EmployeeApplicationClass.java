package new_java8_program_DurgaSir_EMP_App;

import java.util.ArrayList;
import java.util.function.Predicate;

public class EmployeeApplicationClass {

	public static void main(String[] args) {

		ArrayList<Employee> list = new ArrayList<Employee>();
		populate(list);

		System.out.println("All the Managers Informations are : ");
		System.out.println("===================================================================");
		Predicate<Employee> p1 = emp -> emp.designation.equals("Manager");
		display(p1, list);

		System.out.println("All the Employee Information belongs to Gurgaon : ");
		System.out.println("===================================================================");
		Predicate<Employee> p2 = emp -> emp.city.equals("Gurgaon");
		display(p2, list);
		
		System.out.println("All the employee Information having salary greater than or equal to 50000");
		System.out.println("===================================================================");
		Predicate<Employee> p3 = emp -> emp.salary >= 50000;
		display(p3, list);
		
		System.out.println("Employee Information having salary more than 25000 and belongs to Banglore : ");
		System.out.println("======================================================================================");
		Predicate<Employee> p4 = emp -> emp.salary >= 25000 && emp.city.equals("Banglore");
		display(p4, list);
		
		System.out.println("All the Manager belongs to Noida get the pink slip");
		System.out.println("===================================================================");
		display(p1.and(p2), list);
		
		System.out.println("All the Managers Informations are : ");
		System.out.println("===================================================================");
		display(p1.negate(), list);
		
		//Let's see the working of isEquals() method
		Predicate<Employee> isCEO = Predicate.isEqual(new Employee("Sangam", "CEO", 100000, "Noida"));
		Employee e1 = new Employee("Sangam", "CEO", 100000, "Noida");
		Employee e2 = new Employee("Aman", "CEO", 100000, "Gurgaon");
		
		System.out.println(isCEO.test(e1));
		System.out.println(isCEO.test(e2));
		

	}

	public static void populate(ArrayList<Employee> list) {
		list.add(new Employee("Sangam", "CEO", 100000, "Noida"));
		list.add(new Employee("Kajal", "General Manager", 55000, "Noida"));
		list.add(new Employee("Aman", "Manager", 35000, "Gurgaon"));
		list.add(new Employee("Mallika", "Manager", 50000, "Gurgaon"));
		list.add(new Employee("saurabh", "Analyst", 25000, "Banglore"));
		list.add(new Employee("Vinay", "Lead", 40000, "Banglore"));
		list.add(new Employee("Aysuh", "project Head", 50000, "Delhi"));
		list.add(new Employee("Ayushi", "Developer", 40000, "Delhi"));
		list.add(new Employee("Ashima", "Developer", 35000, "Delhi"));
		list.add(new Employee("Shubhi", "Developer", 25000, "Kolkatta"));
	}

	private static void display(Predicate<Employee> p1, ArrayList<Employee> list) {
		for (Employee emp : list) {
			if (p1.test(emp)) {
				System.out.println(emp);
			}
		}
		System.out.println("******************************************************************************\n");

	}
}
