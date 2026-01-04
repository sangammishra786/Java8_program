import java.util.*;
import java.util.stream.Collectors;

/**
 * Java 8 Stream Questions Set 1 (Q1–Q10)
 */
public class Java8StreamSet1 {

    // Q1: Find all even numbers from a list
    public static void findEvenNumbers() {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6);
        System.out.println(list.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList()));
    }

    // Q2: Find all odd numbers from a list
    public static void findOddNumbers() {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6);
        System.out.println(list.stream()
                .filter(n -> n % 2 != 0)
                .collect(Collectors.toList()));
    }

    // Q3: Find maximum element in a list
    public static void findMaxElement() {
        List<Integer> list = Arrays.asList(10, 30, 20);
        System.out.println(list.stream().max(Integer::compareTo).get());
    }

    // Q4: Find minimum element in a list
    public static void findMinElement() {
        List<Integer> list = Arrays.asList(10, 30, 20);
        System.out.println(list.stream().min(Integer::compareTo).get());
    }

    // Q5: Find sum of all elements
    public static void sumOfElements() {
        List<Integer> list = Arrays.asList(1,2,3,4);
        System.out.println(list.stream().mapToInt(Integer::intValue).sum());
    }

    // Q6: Find average of numbers
    public static void averageOfElements() {
        List<Integer> list = Arrays.asList(1,2,3,4);
        System.out.println(list.stream().mapToInt(Integer::intValue).average().getAsDouble());
    }

    // Q7: Remove duplicate elements
    public static void removeDuplicates() {
        List<Integer> list = Arrays.asList(1,2,2,3,3,4);
        System.out.println(list.stream().distinct().collect(Collectors.toList()));
    }

    // Q8: Sort elements in ascending order
    public static void sortAscending() {
        List<Integer> list = Arrays.asList(5,3,1,4);
        System.out.println(list.stream().sorted().collect(Collectors.toList()));
    }

    // Q9: Sort elements in descending order
    public static void sortDescending() {
        List<Integer> list = Arrays.asList(5,3,1,4);
        System.out.println(list.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList()));
    }

    // Q10: Count number of elements
    public static void countElements() {
        List<Integer> list = Arrays.asList(1,2,3,4);
        System.out.println(list.stream().count());
    }
}
