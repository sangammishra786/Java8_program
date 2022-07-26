package LamdaExpression;

import java.util.Comparator;

public class ComparatorLamdaExample {
	public static void main(String[] args) {
		
		/*
		 * Implement comparator prior to java 8
		 */
		
		Comparator<Integer> comparator = new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				return o1.compareTo(o2); // 0 -> o1 == o2
										// 1 -> o1 > o2
										// -1 -> o1 < o2
			}
			
		};
		
		System.out.println("Result of the comparator is : " + comparator.compare(3, 4));
		
			
		/*
		 * Implement comparator using java 8
		 */
		Comparator<Integer> lamdaComparator = (a, b)->  a.compareTo(b);
		System.out.println("Result of lamda comparator is : "+ lamdaComparator.compare(3, 2));
		
		Comparator<Integer> lamdaComparator1 = (a, b)-> { return a.compareTo(b);};
		System.out.println("Result of lamda Comparator is " + lamdaComparator1.compare(3, 3));
		
		Comparator<String> lamdaComparator2 = (a, b)->{ return a.compareTo(b);};
		System.out.println("Result of lamda Comparator is " + lamdaComparator2.compare("cat", "ball")); //compare the string lexicographically
	}
}
