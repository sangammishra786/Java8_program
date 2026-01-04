import java.util.*;
import java.util.stream.Collectors;

/**
 * Java 8 Stream Questions Set 10 (Q91–Q100)
 */
public class Java8StreamSet10 {

    // Q91: Find intersection of two lists
    public static void intersection() {
        List<Integer> a = Arrays.asList(1,2,3,4);
        List<Integer> b = Arrays.asList(3,4,5);
        System.out.println(a.stream().filter(b::contains).collect(Collectors.toList()));
    }

    // Q92: Find union of two lists
    public static void union() {
        List<Integer> a = Arrays.asList(1,2);
        List<Integer> b = Arrays.asList(2,3);
        System.out.println(Stream.concat(a.stream(), b.stream())
                .distinct()
                .collect(Collectors.toList()));
    }

    // Q93: Find difference of lists
    public static void difference() {
        List<Integer> a = Arrays.asList(1,2,3);
        List<Integer> b = Arrays.asList(2);
        System.out.println(a.stream().filter(n -> !b.contains(n)).collect(Collectors.toList()));
    }

    // Q94: Convert list to TreeSet
    public static void toTreeSet() {
        List<Integer> list = Arrays.asList(3,1,2);
        System.out.println(list.stream().collect(Collectors.toCollection(TreeSet::new)));
    }

    // Q95: Find highest frequency element
    public static void highestFrequency() {
        List<Integer> list = Arrays.asList(1,2,2,3,3,3);
        System.out.println(list.stream()
                .collect(Collectors.groupingBy(n -> n, Collectors.counting()))
                .entrySet().stream()
                .max(Map.Entry.comparingByValue()).get());
    }

    // Q96: Check string contains only digits
    public static void onlyDigits() {
        String str = "12345";
        System.out.println(str.chars().allMatch(Character::isDigit));
    }

    // Q97: Find sum of odd numbers
    public static void sumOdd() {
        List<Integer> list = Arrays.asList(1,2,3,4,5);
        System.out.println(list.stream().filter(n -> n % 2 != 0).mapToInt(Integer::intValue).sum());
    }

    // Q98: Convert list to unmodifiable list
    public static void unmodifiableList() {
        List<Integer> list = Arrays.asList(1,2,3);
        System.out.println(list.stream().collect(Collectors.toUnmodifiableList()));
    }

    // Q99: Peek example
    public static void peekExample() {
        List<Integer> list = Arrays.asList(1,2,3);
        list.stream()
                .peek(System.out::println)
                .map(n -> n * 2)
                .forEach(System.out::println);
    }

    // Q100: Parallel stream intersection
    public static void parallelIntersection() {
        List<Integer> a = Arrays.asList(1,2,3,4);
        List<Integer> b = Arrays.asList(3,4,5);
        System.out.println(a.parallelStream()
                .filter(b::contains)
                .collect(Collectors.toList()));
    }
}
