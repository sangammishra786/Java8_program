import java.util.*;
import java.util.stream.Collectors;

/**
 * Java 8 Stream Questions Set 6 (Q51–Q60)
 */
public class Java8StreamSet6 {

    // Q51: Find minimum using reduce
    public static void minUsingReduce() {
        List<Integer> list = Arrays.asList(5, 2, 9);
        System.out.println(list.stream().reduce(Integer::min).get());
    }

    // Q52: Check list is empty using stream
    public static void checkEmpty() {
        List<Integer> list = Collections.emptyList();
        System.out.println(list.stream().findAny().isPresent());
    }

    // Q53: Convert int list to string list
    public static void intToStringList() {
        List<Integer> list = Arrays.asList(1, 2, 3);
        System.out.println(list.stream().map(String::valueOf).collect(Collectors.toList()));
    }

    // Q54: Find distinct characters in string
    public static void distinctCharacters() {
        String str = "programming";
        System.out.println(str.chars()
                .mapToObj(c -> (char) c)
                .distinct()
                .collect(Collectors.toList()));
    }

    // Q55: Sort strings by length
    public static void sortByLength() {
        List<String> list = Arrays.asList("aaa", "b", "cc");
        System.out.println(list.stream()
                .sorted(Comparator.comparingInt(String::length))
                .collect(Collectors.toList()));
    }

    // Q56: Find total characters in all strings
    public static void totalCharacters() {
        List<String> list = Arrays.asList("a", "bb", "ccc");
        System.out.println(list.stream().mapToInt(String::length).sum());
    }

    // Q57: Flatten list of lists
    public static void flattenList() {
        List<List<Integer>> list = Arrays.asList(
                Arrays.asList(1,2),
                Arrays.asList(3,4)
        );
        System.out.println(list.stream()
                .flatMap(List::stream)
                .collect(Collectors.toList()));
    }

    // Q58: Convert Optional to Stream
    public static void optionalToStream() {
        Optional<String> opt = Optional.of("Java");
        opt.stream().forEach(System.out::println);
    }

    // Q59: Find maximum string length
    public static void maxStringLength() {
        List<String> list = Arrays.asList("a", "abcd", "abc");
        System.out.println(list.stream().mapToInt(String::length).max().getAsInt());
    }

    // Q60: Generate infinite stream
    public static void infiniteStream() {
        Stream.iterate(1, n -> n + 1)
                .limit(5)
                .forEach(System.out::println);
    }
}
