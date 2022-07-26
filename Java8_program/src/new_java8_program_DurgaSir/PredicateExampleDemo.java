//Program to print the name of person whose name start with K
package new_java8_program_DurgaSir;

import java.util.function.Predicate;
public class PredicateExampleDemo {
	
	public static void main(String[] args) {
		
	
	String[] str = {"katrina", "kajal", "kareena", "kamal", "Aman", "Sangam"};
	
	Predicate<String> startsWithK = s -> s.charAt(0) == 'k';
	
	System.out.println("The name start with k are given below : ");
		m(startsWithK, str);
	
	}
	
	public static void m(Predicate<String> p, String[] names) {
		for(String req_name : names) {
			if(p.test(req_name)) {
				System.out.print(req_name+", ");
			}
		}
	}
}
