import java.util.*;
import java.util.stream.Collectors;

/**
 * Java 8 Stream Questions Set 8 (Q71–Q80)
 */
public class Java8StreamSet8 {

    // Q71: Find longest word in sentence
    public static void longestWord() {
        String sentence = "Java stream api interview questions";
        System.out.println(Arrays.stream(sentence.split(" "))
                .max(Comparator.comparingInt(String::length))
                .get());
    }

    // Q72: Count words in sentence
    public static void wordCount() {
        String sentence = "java java spring";
        System.out.println(Arrays.stream(sentence.split(" "))
                .collect(Collectors.groupingBy(w -> w, Collectors.counting())));
    }

    // Q73: Reverse each word
    public static void reverseWords() {
        String sentence = "java stream";
        System.out.println(Arrays.stream(sentence.split(" "))
                .map(w -> new StringBuilder(w).reverse().toString())
                .collect(Collectors.joining(" ")));
    }

    // Q74: Sort words alphabetically
    public static void sortWords() {
        String sentence = "banana apple cherry";
        System.out.println(Arrays.stream(sentence.split(" "))
                .sorted()
                .collect(Collectors.joining(" ")));
    }

    // Q75: Find duplicate words
    public static void duplicateWords() {
        String sentence = "java spring java";
        Set<String> seen = new HashSet<>();
        System.out.println(Arrays.stream(sentence.split(" "))
                .filter(w -> !seen.add(w))
                .collect(Collectors.toSet()));
    }

    // Q76: Convert list to comma-separated string
    public static void listToCSV() {
        List<String> list = Arrays.asList("a","b","c");
        System.out.println(String.join(",", list));
    }

    // Q77: Check all numbers positive
    public static void allPositive() {
        List<Integer> list = Arrays.asList(1,2,3);
        System.out.println(list.stream().allMatch(n -> n > 0));
    }

    // Q78: Find sum of digits
    public static void sumOfDigits() {
        int num = 123;
        System.out.println(String.valueOf(num).chars()
                .map(c -> c - '0')
                .sum());
    }

    // Q79: Convert char stream to string
    public static void charStreamToString() {
        List<Character> chars = Arrays.asList('j','a','v','a');
        System.out.println(chars.stream()
                .map(String::valueOf)
                .collect(Collectors.joining()));
    }

    // Q80: Find max even number
    public static void maxEven() {
        List<Integer> list = Arrays.asList(1,2,4,6,9);
        System.out.println(list.stream()
                .filter(n -> n % 2 == 0)
                .max(Integer::compareTo).get());
    }
}
