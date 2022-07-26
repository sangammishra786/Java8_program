//Program to remove null and Empty String from the array

package new_java8_program_DurgaSir;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PredicateExampleDemo2 {
	public static void main(String[] args) {
		
		String[] str = {"Durga", "", null, "Sangam", "Aman", "", null, "kajal"};
		Predicate<String> removeNullAndEmptyString = s -> s != null && s.length() != 0;
		
		m(removeNullAndEmptyString, str);
	}
	
	public static void m(Predicate<String> p, String[] names) {
		ArrayList<String> list = new ArrayList<String>();
		for(String s : names) {
			if(p.test(s)) {
				list.add(s);
			}
		}
		System.out.println(list);
	}
}
