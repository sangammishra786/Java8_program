package new_java8_program_DurgaSir_streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample2 {
	public static void main(String[] args) {
		
		ArrayList<String> l = new ArrayList<String>();
		l.add("Pawan");
		l.add("milan");
		l.add("Sangam");
		l.add("Nagaarjun");
		l.add("Jay");
		l.add("Joe");
		
		System.out.println(l);
		
		/*
		 * filter the list according to the length of the string. 
		 * I need a name of list having name length >= 5
		 */
		
		List<String> l1 = l.stream().filter(s -> s.length() >= 5).collect(Collectors.toList());
		System.out.println(l1);
		System.out.println(l.stream().filter(s -> s.length() >= 5).count());
		
		/*
		 * Create an new collection of string and convert all the string in Uppercase
		 */
		
		List<String> l2 = l.stream().map(s -> s.toUpperCase()).filter(s -> s.length() >= 5).collect(Collectors.toList());
		System.out.println(l2);
		
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(5);list.add(0);list.add(15);
		list.add(25);list.add(10);list.add(20);
		
		System.out.println(list);
		
		//Sorted the element based on natural sorting order
		List<Integer> l3 = list.stream().sorted().collect(Collectors.toList());
		System.out.println(l3);
		
		//Sort the element based on customized sorting order
		List<Integer> l4 = list.stream().sorted((i1, i2) -> -i1.compareTo(i2)).collect(Collectors.toList());
		System.out.println(l4);
		
		//processing by using toArrray() method
		String[] str = l.stream().toArray(String[] :: new);
		for(String s : str) {
			System.out.println(s);
		}
		
		//Using forEach() method
		System.out.println("forEach() method");
		l.stream().forEach(s -> System.out.println(s));
	}
}
