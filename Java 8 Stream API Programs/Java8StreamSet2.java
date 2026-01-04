import java.util.*;
import java.util.stream.Collectors;

/**
 * Java 8 Stream Questions Set 2 (Q11–Q20)
 */
public class Java8StreamSet2 {

    // Q11: Convert list of strings to uppercase
    public static void convertToUppercase() {
        List<String> list = Arrays.asList("java", "spring");
        System.out.println(list.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList()));
    }

    // Q12: Filter strings starting with a letter
    public static void filterByPrefix() {
        List<String> list = Arrays.asList("apple", "banana", "avocado");
        System.out.println(list.stream()
                .filter(s -> s.startsWith("a"))
                .collect(Collectors.toList()));
    }

    // Q13: Find string with maximum length
    public static void maxLengthString() {
        List<String> list = Arrays.asList("java", "springboot", "api");
        System.out.println(list.stream()
                .max(Comparator.comparingInt(String::length))
                .get());
    }

    // Q14: Join strings with delimiter
    public static void joinStrings() {
        List<String> list = Arrays.asList("Java", "Spring", "Kafka");
        System.out.println(String.join(", ", list));
    }

    // Q15: Find first element
    public static void findFirstElement() {
        List<Integer> list = Arrays.asList(10, 20, 30);
        System.out.println(list.stream().findFirst().get());
    }

    // Q16: Check if any element matches condition
    public static void anyMatchExample() {
        List<Integer> list = Arrays.asList(1,3,5,8);
        System.out.println(list.stream().anyMatch(n -> n % 2 == 0));
    }

    // Q17: Check if all elements match condition
    public static void allMatchExample() {
        List<Integer> list = Arrays.asList(2,4,6);
        System.out.println(list.stream().allMatch(n -> n % 2 == 0));
    }

    // Q18: Check if none match condition
    public static void noneMatchExample() {
        List<Integer> list = Arrays.asList(1,3,5);
        System.out.println(list.stream().noneMatch(n -> n % 2 == 0));
    }

    // Q19: Convert list to set
    public static void convertListToSet() {
        List<Integer> list = Arrays.asList(1,2,2,3);
        System.out.println(list.stream().collect(Collectors.toSet()));
    }

    // Q20: Skip first n elements
    public static void skipElements() {
        List<Integer> list = Arrays.asList(1,2,3,4,5);
        System.out.println(list.stream().skip(2).collect(Collectors.toList()));
    }
}
