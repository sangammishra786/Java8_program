package InterviewCodingQuestion;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FindPrimeNumber {

	public static boolean isPrime(int number) {
		//return IntStream.rangeClosed(2, number/2).noneMatch(i -> number%i == 0);
		return !IntStream.rangeClosed(2, number/2).anyMatch(i -> number%i == 0);
	}
	
	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(2,3,4,5,6,11,13,16,19,23,27,91,97,103);
		
		System.out.println(numbers.stream()
								   .filter(FindPrimeNumber::isPrime)
								   .collect(Collectors.toList()));

	}

}
