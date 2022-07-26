package Default_static;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class DefaultMethodsExample {
	public static void main(String[] args) {
		
		/*
		 *sort the list name in alphabetical order 
		 */
		 
		List<String> stringList = Arrays.asList("sangam","aman","saurabh",
				"rahul","kajal","vinay");
		/*
		 * prior to java 8
		 */
		Collections.sort(stringList);
		System.out.println("Sort the list using collection : " + stringList);
		
		/*
		 * Using java 8
		 */

		stringList.sort(Comparator.naturalOrder());
		System.out.println("Sort the list using Java 8 : " + stringList);
		
	}
}
