import java.util.*;
import java.util.stream.Collectors;

/**
 * Java 8 Stream Questions Set 7 (Q61–Q70)
 */
public class Java8StreamSet7 {

    // Q61: Fibonacci series using streams
    public static void fibonacci() {
        Stream.iterate(new int[]{0,1}, f -> new int[]{f[1], f[0]+f[1]})
                .limit(10)
                .map(f -> f[0])
                .forEach(System.out::println);
    }

    // Q62: Remove duplicate characters from string
    public static void removeDuplicateChars() {
        String str = "banana";
        System.out.println(str.chars()
                .distinct()
                .mapToObj(c -> String.valueOf((char)c))
                .collect(Collectors.joining()));
    }

    // Q63: Sort map by key
    public static void sortMapByKey() {
        Map<Integer, String> map = new HashMap<>();
        map.put(3,"c"); map.put(1,"a"); map.put(2,"b");
        map.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .forEach(System.out::println);
    }

    // Q64: Sort map by value
    public static void sortMapByValue() {
        Map<Integer, String> map = new HashMap<>();
        map.put(1,"c"); map.put(2,"a"); map.put(3,"b");
        map.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .forEach(System.out::println);
    }

    // Q65: Convert map keys to list
    public static void mapKeysToList() {
        Map<Integer,String> map = Map.of(1,"a",2,"b");
        System.out.println(map.keySet().stream().collect(Collectors.toList()));
    }

    // Q66: Convert map values to list
    public static void mapValuesToList() {
        Map<Integer,String> map = Map.of(1,"a",2,"b");
        System.out.println(map.values().stream().collect(Collectors.toList()));
    }

    // Q67: Filter map by value
    public static void filterMap() {
        Map<Integer,Integer> map = Map.of(1,10,2,20,3,30);
        map.entrySet().stream()
                .filter(e -> e.getValue() > 15)
                .forEach(System.out::println);
    }

    // Q68: Merge two lists
    public static void mergeLists() {
        List<Integer> a = Arrays.asList(1,2);
        List<Integer> b = Arrays.asList(3,4);
        System.out.println(Stream.concat(a.stream(), b.stream())
                .collect(Collectors.toList()));
    }

    // Q69: Check palindrome using stream
    public static void palindromeCheck() {
        String str = "madam";
        boolean result = IntStream.range(0, str.length()/2)
                .allMatch(i -> str.charAt(i) == str.charAt(str.length()-1-i));
        System.out.println(result);
    }

    // Q70: Remove special characters
    public static void removeSpecialChars() {
        String str = "ja@va!8";
        System.out.println(str.chars()
                .filter(Character::isLetterOrDigit)
                .mapToObj(c -> String.valueOf((char)c))
                .collect(Collectors.joining()));
    }
}
