import java.util.*;
import java.util.stream.Collectors;

/**
 * Java 8 Stream Questions Set 5 (Q41–Q50)
 */
public class Java8StreamSet5 {

    // Q41: Find sum using reduce
    public static void sumUsingReduce() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4);
        System.out.println(list.stream().reduce(0, Integer::sum));
    }

    // Q42: Find product of elements
    public static void productOfElements() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4);
        System.out.println(list.stream().reduce(1, (a, b) -> a * b));
    }

    // Q43: Convert list of strings to lowercase
    public static void toLowerCase() {
        List<String> list = Arrays.asList("JAVA", "SPRING");
        System.out.println(list.stream().map(String::toLowerCase).collect(Collectors.toList()));
    }

    // Q44: Remove null and empty strings
    public static void removeNullAndEmpty() {
        List<String> list = Arrays.asList("a", "", null, "b");
        System.out.println(list.stream()
                .filter(s -> s != null && !s.isEmpty())
                .collect(Collectors.toList()));
    }

    // Q45: Find first even number
    public static void firstEvenNumber() {
        List<Integer> list = Arrays.asList(1, 3, 4, 6);
        System.out.println(list.stream().filter(n -> n % 2 == 0).findFirst().get());
    }

    // Q46: Convert list to map
    public static void listToMap() {
        List<String> list = Arrays.asList("a", "bb", "ccc");
        System.out.println(list.stream()
                .collect(Collectors.toMap(s -> s, String::length)));
    }

    // Q47: Group strings by length
    public static void groupByLength() {
        List<String> list = Arrays.asList("a", "bb", "ccc");
        System.out.println(list.stream()
                .collect(Collectors.groupingBy(String::length)));
    }

    // Q48: Count occurrences of words
    public static void wordFrequency() {
        List<String> list = Arrays.asList("java", "spring", "java");
        System.out.println(list.stream()
                .collect(Collectors.groupingBy(w -> w, Collectors.counting())));
    }

    // Q49: Find max value using Comparator
    public static void maxUsingComparator() {
        List<Integer> list = Arrays.asList(10, 50, 30);
        System.out.println(list.stream().max(Comparator.naturalOrder()).get());
    }

    // Q50: Convert stream to list
    public static void streamToList() {
        Stream<Integer> stream = Stream.of(1, 2, 3);
        System.out.println(stream.collect(Collectors.toList()));
    }
}
