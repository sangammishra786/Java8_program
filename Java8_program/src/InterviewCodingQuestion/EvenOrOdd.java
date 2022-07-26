/*
 * package InterviewCodingQuestion;
 * 
 * import java.util.ArrayList; import java.util.Arrays; import
 * java.util.HashSet; import java.util.List; import java.util.Set; import
 * java.util.stream.Collectors;
 * 
 * public class EvenOrOdd { public static void main(String[] args) {
 * 
 * 
 * List<Integer> myList = Arrays.asList(1,2,4,5,6,7,8,9,10); List<Integer>
 * newList = new ArrayList<Integer>();
 * 
 * newList.add(myList.stream() .filter(n -> n % 2 == 0));
 * //.forEach(System.out::println);
 * 
 * for (Integer integer : newList) { System.out.println(integer); }
 * 
 * 
 * 
 * List<Integer> startWithOne = Arrays.asList(10,15,20,48,50);
 * startWithOne.stream() .map(s -> s + "") .filter(s-> s.startsWith("1"))
 * .forEach(System.out::println);
 * 
 * 
 * List<Integer> duplicateValue = Arrays.asList(10,12,37,10,23,37); Set<Integer>
 * set = new HashSet<Integer>();
 * 
 * duplicateValue.stream() .filter(n -> !set.add(n))
 * .forEach(System.out::println);
 * 
 * } }
 */