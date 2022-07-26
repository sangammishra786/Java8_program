package new_java8_program_DurgaSir;

import java.util.ArrayList;
import java.util.function.BiConsumer;

class Employeee{
	String name;
	double salary;
	
	Employeee(String name, double salary){
		this.name = name;
		this.salary = salary;
	}
	
	public String toString() {
		return "("+name+" -> "+salary+")";
	}
}

public class BiFunctionalInterfaceExample3 {
	public static void main(String[] args) {
		
		ArrayList<Employeee> list = new ArrayList<Employeee>();
		populate(list);
		
		
		BiConsumer<Employeee, Double> biCon = (emp, incr) -> emp.salary = emp.salary + incr;
		
		for(Employeee e : list) {
			biCon.accept(e, (double)900);
		}
		
		for(Employeee e : list) {
			System.out.println("Name : "+e.name+", Salary : "+e.salary);
		}
	
	}
	
	public static void populate(ArrayList<Employeee> list) {
		list.add(new Employeee("Sangam", 25000));
		list.add(new Employeee("Kajal", 26000));
		list.add(new Employeee("vinay", 20000));
		list.add(new Employeee("saurabh", 18000));
		list.add(new Employeee("chintu", 15000));
		list.add(new Employeee("Anurag", 25000));
		
	}
}
