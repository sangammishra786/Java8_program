package new_java8_program_DurgaSir_EMP_App;

public class Employee {
	String name;
	String designation;
	double salary;
	String city;

	public Employee(String name, String designation, double salary, String city) {
		super();
		this.name = name;
		this.designation = designation;
		this.salary = salary;
		this.city = city;
	}

	@Override
	public String toString() {
		String string = String.format("(%s, %s, %.2f, %s)", name, designation, salary, city);

		return string;
	}

	@Override
	public boolean equals(Object obj) {
		Employee e = (Employee)obj;
		if(name.equals(e.name)&&designation.equals(e.designation)&&salary == e.salary && city.equals(e.city)) {
			return true;
		}else
		{
			return false;
		}
	}
}
