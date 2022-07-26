package new_java8_program_DurgaSir;

import java.util.function.BiFunction;

//Calculate the monthly salary with Employee and TimeSheet object as input by using BiFunction

class Employees {
	int emp_no;
	String name;
	double dailywagaes;

	public Employees(int emp_no, String name, double dailywagaes) {
		super();
		this.emp_no = emp_no;
		this.name = name;
		this.dailywagaes = dailywagaes;
	}
}

class TimeSheet {
	int emp_no;
	int noOfDays;

	public TimeSheet(int emp_no, int noOfDays) {
		super();
		this.emp_no = emp_no;
		this.noOfDays = noOfDays;
	}
}

public class BiFunctionalInterfaceExample2 {

	public static void main(String[] args) {
		
		Employees e = new Employees(101,"Sangam",1500);
		TimeSheet t = new TimeSheet(101, 26);
		
		BiFunction<Employees, TimeSheet, Double> bif = (emp,time) -> (e.dailywagaes * t.noOfDays);
		
		System.out.println(e.name+" : " + bif.apply(e, t));
		
	}
}
