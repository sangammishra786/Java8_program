import java.util.*;
import java.util.stream.Collectors;

/**
 * Java 8 Stream Questions Set 9 (Q81–Q90)
 */
public class Java8StreamSet9 {

    // Q81: Convert stream to array
    public static void streamToArray() {
        Stream<Integer> stream = Stream.of(1,2,3);
        System.out.println(Arrays.toString(stream.toArray()));
    }

    // Q82: Find minimum even number
    public static void minEven() {
        List<Integer> list = Arrays.asList(1,2,4,6);
        System.out.println(list.stream()
                .filter(n -> n % 2 == 0)
                .min(Integer::compareTo).get());
    }

    // Q83: Count distinct elements
    public static void countDistinct() {
        List<Integer> list = Arrays.asList(1,2,2,3);
        System.out.println(list.stream().distinct().count());
    }

    // Q84: Sort strings ignoring case
    public static void sortIgnoreCase() {
        List<String> list = Arrays.asList("java","Spring","API");
        System.out.println(list.stream()
                .sorted(String.CASE_INSENSITIVE_ORDER)
                .collect(Collectors.toList()));
    }

    // Q85: Convert list to LinkedList
    public static void toLinkedList() {
        List<Integer> list = Arrays.asList(1,2,3);
        System.out.println(list.stream()
                .collect(Collectors.toCollection(LinkedList::new)));
    }

    // Q86: Find average using Collectors
    public static void averageUsingCollectors() {
        List<Integer> list = Arrays.asList(1,2,3);
        System.out.println(list.stream()
                .collect(Collectors.averagingInt(Integer::intValue)));
    }

    // Q87: Map elements with index
    public static void mapWithIndex() {
        List<String> list = Arrays.asList("a","b","c");
        IntStream.range(0, list.size())
                .forEach(i -> System.out.println(i + ":" + list.get(i)));
    }

    // Q88: Convert string to IntStream
    public static void stringToIntStream() {
        String str = "123";
        str.chars().forEach(System.out::println);
    }

    // Q89: Check list contains element
    public static void containsElement() {
        List<Integer> list = Arrays.asList(1,2,3);
        System.out.println(list.stream().anyMatch(n -> n == 2));
    }

    // Q90: Find last element
    public static void findLastElement() {
        List<Integer> list = Arrays.asList(1,2,3);
        System.out.println(list.stream().reduce((a,b) -> b).get());
    }
}
