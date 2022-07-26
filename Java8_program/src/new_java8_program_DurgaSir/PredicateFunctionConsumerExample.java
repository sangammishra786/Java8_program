package new_java8_program_DurgaSir;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class Students {
	String name;
	int marks;

	public Students(String name, int marks) {
		super();
		this.name = name;
		this.marks = marks;
	}
}

public class PredicateFunctionConsumerExample {
	public static void main(String[] args) {
	
	
	ArrayList<Students> l = new ArrayList<Students>();

	populate(l);

	Function<Students, String> f = s -> {
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

	Predicate<Students> p = s -> s.marks >= 60;
	Consumer<Students> c = s -> {
		System.out.print("[Name : "+s.name+", Marks : "+s.marks+", Grade : "+f.apply(s)+"]");
		System.out.println();
	};
		
		for(Students s : l) {
			if(p.test(s)) {
				c.accept(s);
				
			}
		}
	}

	public static void populate(ArrayList<Students> list) {
		list.add(new Students("Aman", 65));
		list.add(new Students("Sangam", 85));
		list.add(new Students("Saurabh", 30));
		list.add(new Students("Kamal", 55));
		list.add(new Students("janam", 40));
	}
}
