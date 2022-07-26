package new_java8_program_DurgaSir_streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SteamsExample1 {
	public static void main(String[] args) {
		ArrayList<Integer> l = new ArrayList<Integer>();
		l.add(0);
		l.add(10);
		l.add(5);
		l.add(15);
		l.add(20);
		l.add(25);
		
		System.out.println(l);
		//find the even value from the list using the stream
		List<Integer> l1 = l.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
		System.out.println(l1);
		
		//create a new list and double the value according to their mapping
		
	List<Integer> l2 = l.stream().map(i -> i * 2).collect(Collectors.toList());
	System.out.println(l2);
	}
}
