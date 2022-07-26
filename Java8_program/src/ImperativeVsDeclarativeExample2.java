import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;import java.util.stream.Collector;
import java.util.stream.Collectors;


public class ImperativeVsDeclarativeExample2 {
	public static void main(String[] args) {
		
		/**
		 * Imperative Approach to get the List with unique numbers
		 */
		
		//create a list of integers
		List<Integer> integerList = Arrays.asList(1,2,2,3,3,4,4,5,5,6,7,8,8,9,10,10);
		
		List<Integer> uniqueList = new ArrayList<Integer>();
		long startTime = System.nanoTime();
		for (Integer integer : integerList) {
			if(!uniqueList.contains(integer)) {
				uniqueList.add(integer);
			}
		}
		long endTime = System.nanoTime();
		long totalTime = endTime - startTime;
		
		System.out.println("Imperative Approach : " + uniqueList+"\nTime taking is : "+totalTime);
		
		/**
		 * Declarative Approach to get the List with unique numbers
		 */
		
		long startTime1 = System.nanoTime();
		List<Integer> uniqueList1 = integerList.stream()
					.distinct()
					.collect(Collectors.toList());
		long endTime1 = System.nanoTime();
		long totalTime1 = endTime1 - startTime1;
		System.out.println("Declarative Approach : " + uniqueList1+"\nTime taking is : "+totalTime1);
	}
}
