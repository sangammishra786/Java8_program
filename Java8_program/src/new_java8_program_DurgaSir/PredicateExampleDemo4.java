package new_java8_program_DurgaSir;

import java.util.function.Predicate;

class SoftwareEngineer{
	String name;
	int age;
	boolean isHavingGf;
	public SoftwareEngineer(String name, int age, boolean isHavingGf) {
		super();
		this.name = name;
		this.age = age;
		this.isHavingGf = isHavingGf;
	}
	
	@Override
	public String toString() {
		return name;
	}
}

public class PredicateExampleDemo4 {
	public static void main(String[] args) {
		SoftwareEngineer[] list = { new SoftwareEngineer("sangam", 26, false),
				new SoftwareEngineer("Aman", 26, true),
				new SoftwareEngineer("Saurabh", 25, true),
				new SoftwareEngineer("Karan", 17, true),
				new SoftwareEngineer("Prashant", 40, false)
		};
		
		Predicate<SoftwareEngineer> allowed = se -> se.age >= 18 && se.isHavingGf == true;
		for(SoftwareEngineer se : list)
		if(allowed.test(se)) {
			System.out.println(se);
		}
		
	}
}
