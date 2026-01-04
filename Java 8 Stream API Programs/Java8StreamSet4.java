import java.util.*;
import java.util.stream.Collectors;

/**
 * Java 8 Stream Questions Set 4 (Q31–Q40)
 */
public class Java8StreamSet4 {

    // Q31: Filter null values
    public static void filterNulls() {
        List<String> list = Arrays.asList("a", null, "b");
        System.out.println(list.stream().filter(Objects::nonNull).collect(Collectors.toList()));
    }

    // Q32: Group numbers by even/odd
    public static void groupEvenOdd() {
        List<Integer> list = Arrays.asList(1,2,3,4);
        System.out.println(list.stream()
                .collect(Collectors.groupingBy(n -> n % 2 == 0)));
    }

    // Q33: Partition numbers
    public static void partitionExample() {
        List<Integer> list = Arrays.asList(1,2,3,4);
        System.out.println(list.stream()
                .collect(Collectors.partitioningBy(n -> n > 2)));
    }

    // Q34: Convert stream to array
    public static void streamToArray() {
        List<Integer> list = Arrays.asList(1,2,3);
        Integer[] arr = list.stream().toArray(Integer[]::new);
        System.out.println(Arrays.toString(arr));
    }

    // Q35: Find max using reduce
    public static void maxUsingReduce() {
        List<Integer> list = Arrays.asList(1,5,3);
        System.out.println(list.stream().reduce(Integer::max).get());
    }

    // Q36: Concatenate streams
    public static void concatStreams() {
        Stream<Integer> s1 = Stream.of(1,2);
        Stream<Integer> s2 = Stream.of(3,4);
        Stream.concat(s1, s2).forEach(System.out::println);
    }

    // Q37: Find common elements
    public static void commonElements() {
        List<Integer> a = Arrays.asList(1,2,3);
        List<Integer> b = Arrays.asList(2,3,4);
        System.out.println(a.stream().filter(b::contains).collect(Collectors.toList()));
    }

    // Q38: Remove blank strings
    public static void removeBlankStrings() {
        List<String> list = Arrays.asList("a", "", "b");
        System.out.println(list.stream().filter(s -> !s.isEmpty()).collect(Collectors.toList()));
    }

    // Q39: Find total elements after filter
    public static void countAfterFilter() {
        List<Integer> list = Arrays.asList(1,2,3,4);
        System.out.println(list.stream().filter(n -> n > 2).count());
    }

    // Q40: Parallel stream example
    public static void parallelStreamExample() {
        List<Integer> list = Arrays.asList(1,2,3,4);
        list.parallelStream().forEach(System.out::println);
    }
}
