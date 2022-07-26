package InterviewCodingQuestion;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class InterviewQuestions {
	
	public static boolean isPrime(int number) {
		//return IntStream.rangeClosed(2, number/2).noneMatch(i -> number%i == 0);
		return !IntStream.rangeClosed(2,  number/2).anyMatch(i -> number%i == 0);
	}
	
	public static void main(String[] args) {
		
		//calculate the even and odd value
		List<Integer> myList = Arrays.asList(10,20,15,25,19,16);
		myList.stream().filter(n -> n % 2 == 0).forEach(System.out::println);
		
		System.out.println();
		//check number starts with a specific value i.e = " 1 "
		myList.stream()
			  .map(s -> s + "")
			  .filter(s -> s.startsWith("1"))
			  .forEach(System.out::println);
		
		
		//check for duplicate value
		System.out.println();
		List<Integer> myList2 = Arrays.asList(10,20,15,25,19,16,10,13,25,19);
		Set<Integer> set1 = new HashSet<Integer>();
		
		myList2.stream()
			    .filter(n -> set1.add(n))
			    .forEach(System.out::println);
		
		//check for the prime number
		
		System.out.println();
		System.out.println(myList2.stream()
								  .filter(InterviewQuestions::isPrime)
								  .collect(Collectors.toList()));
		
		//convert character into upperCase
		System.out.println();
		List<String> list = Arrays.asList("a", "b", "s", "d");
		list.stream().forEach((c) -> System.out.println(c.toUpperCase()));
		
		
		System.out.println();
		//remove duplicate value from the arrayList using LinkedHAshSet and Stream API
		//1 using linkedHashSet
		List<String> carList = Arrays.asList("Audi", "BMW", "Maruti","Aura","BMW");
		System.out.println(carList);
		Set<String> carSet = new LinkedHashSet<String>(carList);
		System.out.println(carSet);
		
		//using stream API
		System.out.println("using Stream API");
		System.out.println(carList.stream()
								  .distinct()
								  .collect(Collectors.toList()));
		
	}
}
