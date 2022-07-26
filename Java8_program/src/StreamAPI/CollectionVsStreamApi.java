package StreamAPI;

import java.util.ArrayList;
import java.util.stream.Stream;

public class CollectionVsStreamApi {
	public static void main(String[] args) {
		
		//create a collection 
		ArrayList<String> names = new ArrayList<String>();
		names.add("Sangam");
		names.add("aman");
		names.add("saurabh");
		
		//names.remove(0);  //perform curd operation on collection 
		System.out.println(names);
		for (String string : names) {
			System.out.println(string);
		}
		
		for (String string : names) {
			System.out.println(string);
		}
		
		//create a stream 
		System.out.println("Stream API.............");
		Stream<String> nameStream = names.stream();
		nameStream.forEach(System.out::println);
		nameStream.forEach(System.out::println);
	}
}
