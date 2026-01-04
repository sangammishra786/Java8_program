import java.util.*;
import java.util.stream.Collectors;

/**
 * Java 8 Stream Questions Set 3 (Q21–Q30)
 */
public class Java8StreamSet3 {

    // Q21: Limit elements
    public static void limitElements() {
        List<Integer> list = Arrays.asList(1,2,3,4,5);
        System.out.println(list.stream().limit(3).collect(Collectors.toList()));
    }

    // Q22: Square each number
    public static void squareNumbers() {
        List<Integer> list = Arrays.asList(1,2,3);
        System.out.println(list.stream().map(n -> n * n).collect(Collectors.toList()));
    }

    // Q23: Find duplicate elements
    public static void findDuplicates() {
        List<Integer> list = Arrays.asList(1,2,2,3,3,4);
        Set<Integer> seen = new HashSet<>();
        System.out.println(list.stream()
                .filter(n -> !seen.add(n))
                .collect(Collectors.toSet()));
    }

    // Q24: Find second highest number
    public static void secondHighest() {
        List<Integer> list = Arrays.asList(10, 20, 30, 40);
        System.out.println(list.stream()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst().get());
    }

    // Q25: Count frequency of characters
    public static void charFrequency() {
        String str = "banana";
        System.out.println(str.chars()
                .mapToObj(c -> (char)c)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting())));
    }

    // Q26: Find non-repeated character
    public static void firstNonRepeatedChar() {
        String str = "swiss";
        System.out.println(str.chars()
                .mapToObj(c -> (char)c)
                .collect(Collectors.groupingBy(c -> c, LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream()
                .filter(e -> e.getValue() == 1)
                .findFirst().get().getKey());
    }

    // Q27: Reverse a list
    public static void reverseList() {
        List<Integer> list = Arrays.asList(1,2,3);
        Collections.reverse(list);
        System.out.println(list);
    }

    // Q28: Sum of squares
    public static void sumOfSquares() {
        List<Integer> list = Arrays.asList(1,2,3);
        System.out.println(list.stream().map(n -> n*n).mapToInt(Integer::intValue).sum());
    }

    // Q29: Find longest string
    public static void longestString() {
        List<String> list = Arrays.asList("a", "abcd", "abc");
        System.out.println(list.stream().max(Comparator.comparingInt(String::length)).get());
    }

    // Q30: Convert array to stream
    public static void arrayToStream() {
        int[] arr = {1,2,3};
        Arrays.stream(arr).forEach(System.out::println);
    }
}
