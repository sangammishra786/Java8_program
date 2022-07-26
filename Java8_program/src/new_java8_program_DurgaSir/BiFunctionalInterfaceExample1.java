package new_java8_program_DurgaSir;

import java.util.ArrayList;
import java.util.function.BiFunction;

class Studnt {
	String name;
	int rollno;

	public Studnt(String name, int rollno) {
		super();
		this.name = name;
		this.rollno = rollno;
	}

	@Override
	public String toString() {
		return name + " " + rollno;
	}
}

public class BiFunctionalInterfaceExample1 {
	public static void main(String[] args) {
		ArrayList<Studnt> list = new ArrayList<Studnt>();

		BiFunction<String, Integer, Studnt> biFunc = (name, roll) -> new Studnt(name, roll);

		list.add(biFunc.apply("Sangam", 10));
		list.add(biFunc.apply("Kajal", 11));
		list.add(biFunc.apply("Shubhi", 12));
		list.add(biFunc.apply("Vinay", 13));

		for (Studnt s : list) {
			System.out.println("Student Name : " + s.name + " " + s.rollno);
		}
	}
}
