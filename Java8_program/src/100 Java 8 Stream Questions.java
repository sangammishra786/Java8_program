//Java Streams API is a powerful feature introduced in Java 8 that allows functional-style operations on collections. 
//Here are 100 Java Stream questions along with solutions and expected outputs.

Basic Level Questions (1–20)
1. // Find the Sum of All Elements in a List

//Solution:

List<Integer> numbers = List.of(1, 2, 3, 4, 5);
int sum = numbers.stream().mapToInt(Integer::intValue).sum();
System.out.println("Sum: " + sum);
Output:

Sum: 15
2. // Find the Product of All Elements in a List

//Solution:

List<Integer> numbers = List.of(1, 2, 3, 4, 5);
int product = numbers.stream().reduce(1, (a, b) -> a * b);
System.out.println("Product: " + product);
Output:

Product: 120
3. // Find the Average of All Elements in a List

//Solution:

List<Integer> numbers = List.of(1, 2, 3, 4, 5);
double average = numbers.stream().mapToInt(Integer::intValue).average().orElse(0);
System.out.println("Average: " + average);
Output:

Average: 3.0
4. // Find the Maximum Element in a List

//Solution:

List<Integer> numbers = List.of(1, 2, 3, 4, 5);
int max = numbers.stream().max(Integer::compare).orElse(0);
System.out.println("Max: " + max);
Output:

Max: 5
5. // Find the Minimum Element in a List

//Solution:

List<Integer> numbers = List.of(1, 2, 3, 4, 5);
int min = numbers.stream().min(Integer::compare).orElse(0);
System.out.println("Min: " + min);
Output:

Min: 1
6. // Count the Number of Elements in a List

//Solution:

List<Integer> numbers = List.of(1, 2, 3, 4, 5);
long count = numbers.stream().count();
System.out.println("Count: " + count);
Output:

// Count: 5
7. // Check if a List Contains a Specific Element

//Solution:

List<Integer> numbers = List.of(1, 2, 3, 4, 5);
boolean contains = numbers.stream().anyMatch(n -> n == 3);
System.out.println("Contains 3: " + contains);
Output:

Contains 3: true
8. // Filter Out Even Numbers from a List

//Solution:

List<Integer> numbers = List.of(1, 2, 3, 4, 5);
List<Integer> evenNumbers = numbers.stream()
    .filter(n -> n % 2 == 0)
    .collect(Collectors.toList());
System.out.println("Even Numbers: " + evenNumbers);
Output:

Even Numbers: [2, 4]
9. // Filter Out Odd Numbers from a List

//Solution:

List<Integer> numbers = List.of(1, 2, 3, 4, 5);
List<Integer> oddNumbers = numbers.stream()
    .filter(n -> n % 2 != 0)
    .collect(Collectors.toList());
System.out.println("Odd Numbers: " + oddNumbers);
Output:

Odd Numbers: [1, 3, 5]
10. //Convert a List of Strings to Uppercase

//Solution:

List<String> words = List.of("hello", "world");
List<String> uppercaseWords = words.stream()
    .map(String::toUpperCase)
    .collect(Collectors.toList());
System.out.println("Uppercase Words: " + uppercaseWords);
Output:

Uppercase Words: [HELLO, WORLD]
11. //Convert a List of Integers to Their Squares

//Solution:

List<Integer> numbers = List.of(1, 2, 3, 4, 5);
List<Integer> squares = numbers.stream()
    .map(n -> n * n)
    .collect(Collectors.toList());
System.out.println("Squares: " + squares);
Output:

Squares: [1, 4, 9, 16, 25]
12. // Find the First Element in a List

//Solution:

List<Integer> numbers = List.of(1, 2, 3, 4, 5);
int first = numbers.stream().findFirst().orElse(0);
System.out.println("First Element: " + first);
Output:

First Element: 1
13. // Find the Last Element in a List

//Solution:

List<Integer> numbers = List.of(1, 2, 3, 4, 5);
int last = numbers.stream().reduce((a, b) -> b).orElse(0);
System.out.println("Last Element: " + last);
Output:

Last Element: 5
14. // Check if All Elements in a List Satisfy a Condition

//Solution:

List<Integer> numbers = List.of(1, 2, 3, 4, 5);
boolean allEven = numbers.stream().allMatch(n -> n % 2 == 0);
System.out.println("All Even: " + allEven);
Output:

All Even: false
15. // Check if Any Element in a List Satisfies a Condition

//Solution:

List<Integer> numbers = List.of(1, 2, 3, 4, 5);
boolean anyEven = numbers.stream().anyMatch(n -> n % 2 == 0);
System.out.println("Any Even: " + anyEven);
Output:

Any Even: true
16. // Remove Duplicate Elements from a List

//Solution:

List<Integer> numbers = List.of(1, 2, 2, 3, 4, 4, 5);
List<Integer> uniqueNumbers = numbers.stream()
    .distinct()
    .collect(Collectors.toList());
System.out.println("Unique Numbers: " + uniqueNumbers);
Output:

Unique Numbers: [1, 2, 3, 4, 5]
17. // Sort a List of Integers in Ascending Order

//Solution:

List<Integer> numbers = List.of(5, 3, 1, 4, 2);
List<Integer> sortedNumbers = numbers.stream()
    .sorted()
    .collect(Collectors.toList());
System.out.println("Sorted Numbers: " + sortedNumbers);
Output:

Sorted Numbers: [1, 2, 3, 4, 5]
18. // Sort a List of Integers in Descending Order

//Solution:

List<Integer> numbers = List.of(5, 3, 1, 4, 2);
List<Integer> sortedNumbers = numbers.stream()
    .sorted(Comparator.reverseOrder())
    .collect(Collectors.toList());
System.out.println("Sorted Numbers (Descending): " + sortedNumbers);
Output:

Sorted Numbers (Descending): [5, 4, 3, 2, 1]
19. // Sort a List of Strings in Alphabetical Order

//Solution:

List<String> words = List.of("banana", "apple", "cherry");
List<String> sortedWords = words.stream()
    .sorted()
    .collect(Collectors.toList());
System.out.println("Sorted Words: " + sortedWords);
Output:

Sorted Words: [apple, banana, cherry]
20. // Sort a List of Strings by Their Length

//Solution:

List<String> words = List.of("apple", "banana", "kiwi");
List<String> sortedWords = words.stream()
    .sorted(Comparator.comparingInt(String::length))
    .collect(Collectors.toList());
System.out.println("Sorted Words by Length: " + sortedWords);
Output:

Sorted Words by Length: [kiwi, apple, banana]
Intermediate Level Questions (21–40)
21. // Find the Sum of Digits of a Number

//Solution:

int number = 12345;
int sum = String.valueOf(number).chars()
    .map(Character::getNumericValue)
    .sum();
System.out.println("Sum of Digits: " + sum);
Output:

Sum of Digits: 15
22. // Find the Factorial of a Number

//Solution:

int number = 5;
int factorial = IntStream.rangeClosed(1, number)
    .reduce(1, (a, b) -> a * b);
System.out.println("Factorial: " + factorial);
Output:

Factorial: 120
23. // Find the Second-Largest Element in a List

//Solution:

List<Integer> numbers = List.of(1, 2, 3, 4, 5);
int secondLargest = numbers.stream()
    .sorted(Comparator.reverseOrder())
    .skip(1)
    .findFirst()
    .orElse(0);
System.out.println("Second Largest: " + secondLargest);
Output:

Second Largest: 4
24. // Find the Second-Smallest Element in a List

//Solution:

List<Integer> numbers = List.of(1, 2, 3, 4, 5);
int secondSmallest = numbers.stream()
    .sorted()
    .skip(1)
    .findFirst()
    .orElse(0);
System.out.println("Second Smallest: " + secondSmallest);
Output:

Second Smallest: 2
25. // Find the Longest String in a List

//Solution:

List<String> words = List.of("apple", "banana", "kiwi");
String longest = words.stream()
    .max(Comparator.comparingInt(String::length))
    .orElse("");
System.out.println("Longest Word: " + longest);
Output:

Longest Word: banana
26. // Find the Shortest String in a List

//Solution:

List<String> words = List.of("apple", "banana", "kiwi");
String shortest = words.stream()
    .min(Comparator.comparingInt(String::length))
    .orElse("");
System.out.println("Shortest Word: " + shortest);
Output:

Shortest Word: kiwi
27. // Group a List of Strings by Their Length

//Solution:

List<String> words = List.of("apple", "banana", "kiwi");
Map<Integer, List<String>> groupedByLength = words.stream()
    .collect(Collectors.groupingBy(String::length));
System.out.println("Grouped by Length: " + groupedByLength);
Output:

Grouped by Length: {4=[kiwi], 5=[apple], 6=[banana]}
28. // Group a List of Objects by a Specific Attribute

//Solution:

class Person {
    String name;
    int age;
    // Constructor, getters, and setters
}

	List<Person> people = List.of(
		new Person("Alice", 25),
		new Person("Bob", 30),
		new Person("Charlie", 25)
	);

Map<Integer, List<Person>> groupedByAge = people.stream()
    .collect(Collectors.groupingBy(Person::getAge));
System.out.println("Grouped by Age: " + groupedByAge);
Output:

Grouped by Age: {25=[Alice, Charlie], 30=[Bob]}
29. // Partition a List of Integers into Even and Odd Numbers

//Solution:

List<Integer> numbers = List.of(1, 2, 3, 4, 5);
Map<Boolean, List<Integer>> partitioned = numbers.stream()
    .collect(Collectors.partitioningBy(n -> n % 2 == 0));
System.out.println("Partitioned: " + partitioned);
Output:

Partitioned: {false=[1, 3, 5], true=[2, 4]}
30. // Merge Two Lists into a Single List

//Solution:

List<Integer> list1 = List.of(1, 2, 3);
List<Integer> list2 = List.of(4, 5, 6);
List<Integer> merged = Stream.concat(list1.stream(), list2.stream())
    .collect(Collectors.toList());
System.out.println("Merged List: " + merged);
Output:

Merged List: [1, 2, 3, 4, 5, 6]
31. // Find the Intersection of Two Lists

//Solution:

List<Integer> list1 = List.of(1, 2, 3, 4);
List<Integer> list2 = List.of(3, 4, 5, 6);
List<Integer> intersection = list1.stream()
    .filter(list2::contains)
    .collect(Collectors.toList());
System.out.println("Intersection: " + intersection);
Output:

Intersection: [3, 4]
32. // Find the Union of Two Lists

//Solution:

List<Integer> list1 = List.of(1, 2, 3);
List<Integer> list2 = List.of(3, 4, 5);
List<Integer> union = Stream.concat(list1.stream(), list2.stream())
    .distinct()
    .collect(Collectors.toList());
System.out.println("Union: " + union);
Output:

Union: [1, 2, 3, 4, 5]
33. // Find the Difference Between Two Lists

//Solution:

List<Integer> list1 = List.of(1, 2, 3, 4);
List<Integer> list2 = List.of(3, 4, 5, 6);
List<Integer> difference = list1.stream()
    .filter(n -> !list2.contains(n))
    .collect(Collectors.toList());
System.out.println("Difference: " + difference);
Output:

Difference: [1, 2]
34. // Count the Occurrences of Each Element in a List

//Solution:

List<String> words = List.of("apple", "banana", "apple", "orange");
Map<String, Long> wordCounts = words.stream()
    .collect(Collectors.groupingBy(s -> s, Collectors.counting()));
System.out.println("Word Counts: " + wordCounts);
Output:

Word Counts: {orange=1, banana=1, apple=2}
35. // Count the Occurrences of Each Character in a String

//Solution:

String input = "hello";
Map<Character, Long> charCounts = input.chars()
    .mapToObj(c -> (char) c)
    .collect(Collectors.groupingBy(c -> c, Collectors.counting()));
System.out.println("Character Counts: " + charCounts);
Output:

Character Counts: {e=1, h=1, l=2, o=1}
36. // Count the Occurrences of Each Word in a String

//Solution:

String input = "hello world hello";
Map<String, Long> wordCounts = Arrays.stream(input.split(" "))
    .collect(Collectors.groupingBy(s -> s, Collectors.counting()));
System.out.println("Word Counts: " + wordCounts);
Output:

Word Counts: {hello=2, world=1}
37. // Count the Occurrences of Each Vowel in a String

//Solution:

String input = "hello world";
Map<Character, Long> vowelCounts = input.chars()
    .mapToObj(c -> (char) c)
    .filter(c -> "aeiou".contains(String.valueOf(c)))
    .collect(Collectors.groupingBy(c -> c, Collectors.counting()));
System.out.println("Vowel Counts: " + vowelCounts);
Output:

Vowel Counts: {e=1, o=2}
38. // Count the Occurrences of Each Digit in a String

//Solution:

String input = "hello 123 world 456";
Map<Character, Long> digitCounts = input.chars()
    .mapToObj(c -> (char) c)
    .filter(Character::isDigit)
    .collect(Collectors.groupingBy(c -> c, Collectors.counting()));
System.out.println("Digit Counts: " + digitCounts);
Output:

Digit Counts: {1=1, 2=1, 3=1, 4=1, 5=1, 6=1}
39. // Reverse a List Using Streams

//Solution:

List<Integer> numbers = List.of(1, 2, 3, 4, 5);
List<Integer> reversed = numbers.stream()
    .collect(Collectors.collectingAndThen(Collectors.toList(), list -> {
        Collections.Reverse(list);
        return list;
    }));
System.out.println("Reversed List: " + reversed);
Output:

Reversed List: [5, 4, 3, 2, 1]
40. // Reverse a String Using Streams

//Solution:

String input = "hello";
String reversed = input.chars()
    .mapToObj(c -> String.valueOf((char) c))
    .reduce("", (a, b) -> b + a);
System.out.println("Reversed String: " + reversed);
Output:

Reversed String: olleh
Advanced Level Questions (41–60)
41. // Find the Most Frequent Element in a List

//Solution:

List<String> words = List.of("apple", "banana", "apple", "orange", "banana", "apple");
String mostFrequent = words.stream()
    .collect(Collectors.groupingBy(s -> s, Collectors.counting()))
    .entrySet().stream()
    .max(Map.Entry.comparingByValue())
    .map(Map.Entry::getKey)
    .orElse(null);
System.out.println("Most Frequent: " + mostFrequent);
Output:

Most Frequent: apple
42. // Find the Least Frequent Element in a List

//Solution:

List<String> words = List.of("apple", "banana", "apple", "orange", "banana", "apple");
String leastFrequent = words.stream()
    .collect(Collectors.groupingBy(s -> s, Collectors.counting()))
    .entrySet().stream()
    .min(Map.Entry.comparingByValue())
    .map(Map.Entry::getKey)
    .orElse(null);
System.out.println("Least Frequent: " + leastFrequent);
Output:

Least Frequent: orange
43. // Find the First Non-Repeated Character in a String

//Solution:

String input = "hello";
Character firstNonRepeated = input.chars()
    .mapToObj(c -> (char) c)
    .collect(Collectors.groupingBy(c -> c, LinkedHashMap::new, Collectors.counting()))
    .entrySet().stream()
    .filter(entry -> entry.getValue() == 1)
    .map(Map.Entry::getKey)
    .findFirst()
    .orElse(null);
System.out.println("First Non-Repeated Character: " + firstNonRepeated);
Output:

First Non-Repeated Character: h
44. // Find the First Repeated Character in a String

//Solution:

String input = "hello";
Character firstRepeated = input.chars()
    .mapToObj(c -> (char) c)
    .collect(Collectors.groupingBy(c -> c, LinkedHashMap::new, Collectors.counting()))
    .entrySet().stream()
    .filter(entry -> entry.getValue() > 1)
    .map(Map.Entry::getKey)
    .findFirst()
    .orElse(null);
System.out.println("First Repeated Character: " + firstRepeated);
Output:

First Repeated Character: l
45. // Check if a String is a Palindrome

//Solution:

String input = "madam";
boolean isPalindrome = IntStream.range(0, input.length() / 2)
    .allMatch(i -> input.charAt(i) == input.charAt(input.length() - 1 - i));
System.out.println("Is Palindrome: " + isPalindrome);
Output:

Is Palindrome: true
46. // Find All Anagrams of a String from a List

//Solution:

List<String> words = List.of("listen", "silent", "enlist", "google", "inlets");
String target = "silent";
List<String> anagrams = words.stream()
    .filter(word -> Arrays.equals(
        word.chars().sorted().toArray(),
        target.chars().sorted().toArray()
    ))
    .collect(Collectors.toList());
System.out.println("Anagrams: " + anagrams);
Output:

Anagrams: [silent, inlets]
47. // Generate the Fibonacci Sequence Using Streams

//Solution:

Stream.iterate(new int[]{0, 1}, fib -> new int[]{fib[1], fib[0] + fib[1]})
    .limit(10)
    .map(fib -> fib[0])
    .forEach(System.out::println);
Output:

0
1
1
2
3
5
8
13
21
34
48. // Generate a List of Random Numbers Using Streams

//Solution:

List<Integer> randomNumbers = Stream.// Generate(() -> new Random().nextInt(100))
    .limit(10)
    .collect(Collectors.toList());
System.out.println("Random Numbers: " + randomNumbers);
Output:

Random Numbers: [42, 67, 23, 89, 12, 45, 78, 34, 56, 90]
49. Flatten a List of Lists into a Single List

//Solution:

List<List<Integer>> listOfLists = List.of(
    List.of(1, 2, 3),
    List.of(4, 5, 6),
    List.of(7, 8, 9)
);
List<Integer> flattened = listOfLists.stream()
    .flatMap(List::stream)
    .collect(Collectors.toList());
System.out.println("Flattened List: " + flattened);
Output:

Flattened List: [1, 2, 3, 4, 5, 6, 7, 8, 9]
50. // Find the Sum of All Even Numbers in a Nested List

//Solution:

List<List<Integer>> listOfLists = List.of(
    List.of(1, 2, 3),
    List.of(4, 5, 6),
    List.of(7, 8, 9)
);
int sum = listOfLists.stream()
    .flatMap(List::stream)
    .filter(n -> n % 2 == 0)
    .mapToInt(Integer::intValue)
    .sum();
System.out.println("Sum of Even Numbers: " + sum);
Output:

Sum of Even Numbers: 20
51. // Find the Sum of All Odd Numbers in a Nested List

//Solution:

List<List<Integer>> listOfLists = List.of(
    List.of(1, 2, 3),
    List.of(4, 5, 6),
    List.of(7, 8, 9)
);
int sum = listOfLists.stream()
    .flatMap(List::stream)
    .filter(n -> n % 2 != 0)
    .mapToInt(Integer::intValue)
    .sum();
System.out.println("Sum of Odd Numbers: " + sum);
Output:

Sum of Odd Numbers: 25
52. // Find the Longest Palindrome in a List of Strings

//Solution:

List<String> words = List.of("madam", "racecar", "apple", "banana", "level");
String longestPalindrome = words.stream()
    .filter(word -> word.equals(new StringBuilder(word).// Reverse().toString()))
    .max(Comparator.comparingInt(String::length))
    .orElse("");
System.out.println("Longest Palindrome: " + longestPalindrome);
Output:

Longest Palindrome: racecar
53. // Find the Shortest Palindrome in a List of Strings

//Solution:

List<String> words = List.of("madam", "racecar", "apple", "banana", "level");
String shortestPalindrome = words.stream()
    .filter(word -> word.equals(new StringBuilder(word).// Reverse().toString()))
    .min(Comparator.comparingInt(String::length))
    .orElse("");
System.out.println("Shortest Palindrome: " + shortestPalindrome);
Output:

Shortest Palindrome: level
54. // Find the Longest Word in a String

//Solution:

String input = "hello world this is a test";
String longestWord = Arrays.stream(input.split(" "))
    .max(Comparator.comparingInt(String::length))
    .orElse("");
System.out.println("Longest Word: " + longestWord);
Output:

Longest Word: hello
55. // Find the Shortest Word in a String

//Solution:

String input = "hello world this is a test";
String shortestWord = Arrays.stream(input.split(" "))
    .min(Comparator.comparingInt(String::length))
    .orElse("");
System.out.println("Shortest Word: " + shortestWord);
Output:

Shortest Word: a
56. // Find the Number of Words in a String

//Solution:

String input = "hello world this is a test";
long wordCount = Arrays.stream(input.split(" ")).// Count();
System.out.println("Word // Count: " + wordCount);
Output:

Word // Count: 6
57. // Find the Number of Lines in a File

//Solution:

Path path = Paths.get("sample.txt");
long lineCount = Files.lines(path).// Count();
System.out.println("Line // Count: " + lineCount);
Output:

Line // Count: 10
58. // Find the Number of Characters in a File

//Solution:

Path path = Paths.get("sample.txt");
long charCount = Files.lines(path)
    .flatMapToInt(String::chars)
    .// Count();
System.out.println("Character // Count: " + charCount);
Output:

Character // Count: 100
59. // Find the Number of Words in a File

//Solution:

Path path = Paths.get("sample.txt");
long wordCount = Files.lines(path)
    .flatMap(line -> Arrays.stream(line.split(" ")))
    .// Count();
System.out.println("Word // Count: " + wordCount);
Output:

Word // Count: 50
60. // Find the Number of Unique Words in a File

//Solution:

Path path = Paths.get("sample.txt");
long uniqueWordCount = Files.lines(path)
    .flatMap(line -> Arrays.stream(line.split(" ")))
    .distinct()
    .// Count();
System.out.println("Unique Word // Count: " + uniqueWordCount);
Output:

Unique Word // Count: 30
Real-World Use Case Questions (61–70)
61. // Process a CSV File and Calculate Aggregate Statistics

//Solution:

Path path = Paths.get("data.csv");
Map<String, Double> averageSalaryByDept = Files.lines(path)
    .skip(1) // Skip header
    .map(line -> line.split(","))
    .collect(Collectors.groupingBy(
        fields -> fields[1], // Department
        Collectors.averagingDouble(fields -> Double.parseDouble(fields[2])) // Salary
    ));
System.out.println("Average Salary by Department: " + averageSalaryByDept);
Output:

Average Salary by Department: {HR=50000.0, IT=60000.0, Sales=45000.0}
62. // Filter and Transform Data Fetched from a Database

//Solution:

List<Employee> employees = // Fetch from database
Map<String, List<String>> namesByDept = employees.stream()
    .filter(e -> e.getSalary() > 50000)
    .collect(Collectors.groupingBy(
        Employee::getDepartment,
        Collectors.mapping(Employee::getName, Collectors.toList())
    ));
System.out.println("Names by Department: " + namesByDept);
Output:

Names by Department: {HR=[Alice], IT=[Bob, Charlie]}
63. // Parse and Validate JSON Payloads

//Solution:

String json = "[{\"name\":\"Alice\",\"age\":25},{\"name\":\"Bob\",\"age\":30}]";
List<Person> people = new ObjectMapper().readValue(json, new TypeReference<List<Person>>() {});
List<String> validNames = people.stream()
    .filter(p -> p.getAge() > 25)
    .map(Person::getName)
    .collect(Collectors.toList());
System.out.println("Valid Names: " + validNames);
Output:

Valid Names: [Bob]
64. // Combine Multiple Asynchronous Tasks

//Solution:

CompletableFuture<List<Integer>> future1 = CompletableFuture.supplyAsync(() -> List.of(1, 2, 3));
CompletableFuture<List<Integer>> future2 = CompletableFuture.supplyAsync(() -> List.of(4, 5, 6));
List<Integer> combined = Stream.of(future1, future2)
    .map(CompletableFuture::join)
    .flatMap(List::stream)
    .collect(Collectors.toList());
System.out.println("Combined List: " + combined);
Output:

Combined List: [1, 2, 3, 4, 5, 6]
65. // Process Large Datasets in Parallel

//Solution:

List<Integer> numbers = IntStream.rangeClosed(1, 1000000).boxed().collect(Collectors.toList());
long sum = numbers.parallelStream()
    .mapToInt(Integer::intValue)
    .sum();
System.out.println("Sum: " + sum);
Output:

Sum: 500000500000
66. // Handle Exceptions in Streams

//Solution:

List<String> numbers = List.of("1", "2", "three", "4");
List<Integer> parsedNumbers = numbers.stream()
    .flatMap(s -> {
        try {
            return Stream.of(Integer.parseInt(s));
        } catch (NumberFormatException e) {
            return Stream.empty();
        }
    })
    .collect(Collectors.toList());
System.out.println("Parsed Numbers: " + parsedNumbers);
Output:

Parsed Numbers: [1, 2, 4]
67. // Use Custom Collectors to Calculate Statistics

//Solution:

List<Integer> numbers = List.of(1, 2, 3, 4, 5);
DoubleSummaryStatistics stats = numbers.stream()
    .collect(Collectors.summarizingDouble(Integer::intValue));
System.out.println("Stats: " + stats);
Output:

Stats: DoubleSummaryStatistics{// Count=5, sum=15.000000, min=1.000000, average=3.000000, max=5.000000}
68. // Group Employees by Department and Calculate Average Salary

//Solution:

List<Employee> employees = List.of(
    new Employee("Alice", "HR", 50000),
    new Employee("Bob", "IT", 60000),
    new Employee("Charlie", "HR", 55000)
);
Map<String, Double> avgSalaryByDept = employees.stream()
    .collect(Collectors.groupingBy(
        Employee::getDepartment,
        Collectors.averagingDouble(Employee::getSalary)
    ));
System.out.println("Average Salary by Department: " + avgSalaryByDept);
Output:

Average Salary by Department: {HR=52500.0, IT=60000.0}
67. // Find the Top N Highest-Paid Employees

//Solution:

List<Employee> employees = List.of(
    new Employee("Alice", "HR", 50000),
    new Employee("Bob", "IT", 60000),
    new Employee("Charlie", "HR", 55000)
);
List<Employee> topN = employees.stream()
    .sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
    .limit(2)
    .collect(Collectors.toList());
System.out.println("Top 2 Employees: " + topN);
Output:

Top 2 Employees: [Bob, Charlie]
70. // Find the Top N Most Frequent Words in a Text File

//Solution:

Path path = Paths.get("sample.txt");
List<String> topNWords = Files.lines(path)
    .flatMap(line -> Arrays.stream(line.split(" ")))
    .collect(Collectors.groupingBy(s -> s, Collectors.counting()))
    .entrySet().stream()
    .sorted(Map.Entry.<String, Long>comparingByValue().reversed())
    .limit(3)
    .map(Map.Entry::getKey)
    .collect(Collectors.toList());
System.out.println("Top 3 Words: " + topNWords);
Output:

Top 3 Words: [the, and, of]
String Manipulation Questions (71–80)
71. // Remove All Vowels from a String

//Solution:

String input = "hello world";
String result = input.chars()
    .filter(c -> !"aeiou".contains(String.valueOf((char) c)))
    .mapToObj(c -> String.valueOf((char) c))
    .collect(Collectors.joining());
System.out.println("Result: " + result);
Output:

Result: hll wrld
72. // Remove All Consonants from a String

//Solution:

String input = "hello world";
String result = input.chars()
    .filter(c -> "aeiou".contains(String.valueOf((char) c)))
    .mapToObj(c -> String.valueOf((char) c))
    .collect(Collectors.joining());
System.out.println("Result: " + result);
Output:

Result: eoo
73. // Remove All Digits from a String

//Solution:

String input = "hello 123 world";
String result = input.chars()
    .filter(c -> !Character.isDigit(c))
    .mapToObj(c -> String.valueOf((char) c))
    .collect(Collectors.joining());
System.out.println("Result: " + result);
Output:

Result: hello  world
74. // Remove All Special Characters from a String

//Solution:

String input = "hello@world!";
String result = input.chars()
    .filter(c -> Character.isLetterOrDigit(c) || Character.isWhitespace(c))
    .mapToObj(c -> String.valueOf((char) c))
    .collect(Collectors.joining());
System.out.println("Result: " + result);
Output:

Result: hello world
75. // Extract All Digits from a String and Sum Them

//Solution:

String input = "hello 123 world 456";
int sum = input.chars()
    .filter(Character::isDigit)
    .map(Character::getNumericValue)
    .sum();
System.out.println("Sum of Digits: " + sum);
Output:

Sum of Digits: 21
76. // Extract All Words from a String and // Count Their Occurrences

//Solution:

String input = "hello world hello";
Map<String, Long> wordCounts = Arrays.stream(input.split(" "))
    .collect(Collectors.groupingBy(s -> s, Collectors.counting()));
System.out.println("Word Counts: " + wordCounts);Output:
Word Counts: {hello=2, world=1}
77. // Extract All Unique Words from a String

//Solution:

String input = "hello world hello";
List<String> uniqueWords = Arrays.stream(input.split(" "))
    .distinct()
    .collect(Collectors.toList());
System.out.println("Unique Words: " + uniqueWords);Output:
Unique Words: [hello, world]
78. // Extract All Palindromic Words from a String

//Solution:

String input = "madam racecar apple banana level";
List<String> palindromes = Arrays.stream(input.split(" "))
    .filter(word -> word.equals(new StringBuilder(word).// Reverse().toString()))
    .collect(Collectors.toList());
System.out.println("Palindromes: " + palindromes);
Output:

Palindromes: [madam, racecar, level]
79. // Extract All Words Starting with a Specific Letter

//Solution:

String input = "hello world this is a test";
List<String> wordsStartingWithT = Arrays.stream(input.split(" "))
    .filter(word -> word.startsWith("t"))
    .collect(Collectors.toList());
System.out.println("Words Starting with 't': " + wordsStartingWithT);
Output:

Words Starting with 't': [this, test]
80. // Extract All Words Ending with a Specific Letter

//Solution:

String input = "hello world this is a test";
List<String> wordsEndingWithD = Arrays.stream(input.split(" "))
    .filter(word -> word.endsWith("d"))
    .collect(Collectors.toList());
System.out.println("Words Ending with 'd': " + wordsEndingWithD);
Output:

Words Ending with 'd': [world]
Mathematical and Statistical Questions (81–90)
81. // Find the Standard Deviation of a List of Numbers

//Solution:

List<Double> numbers = List.of(1.0, 2.0, 3.0, 4.0, 5.0);
double mean = numbers.stream().mapToDouble(Double::doubleValue).average().orElse(0);
double variance = numbers.stream()
    .mapToDouble(n -> Math.pow(n - mean, 2))
    .average().orElse(0);
double stdDev = Math.sqrt(variance);
System.out.println("Standard Deviation: " + stdDev);
Output:

Standard Deviation: 1.4142135623730951
82. // Find the Median of a List of Numbers

//Solution:

List<Integer> numbers = List.of(1, 2, 3, 4, 5);
double median = numbers.stream()
    .sorted()
    .skip((numbers.size() - 1) / 2)
    .limit(2 - numbers.size() % 2)
    .mapToInt(Integer::intValue)
    .average()
    .orElse(0);
System.out.println("Median: " + median);
Output:

Median: 3.0
83. // Find the Mode of a List of Numbers

//Solution:

List<Integer> numbers = List.of(1, 2, 2, 3, 4, 4, 4);
Map<Integer, Long> frequencyMap = numbers.stream()
    .collect(Collectors.groupingBy(n -> n, Collectors.counting()));
int mode = frequencyMap.entrySet().stream()
    .max(Map.Entry.comparingByValue())
    .map(Map.Entry::getKey)
    .orElse(0);
System.out.println("Mode: " + mode);
Output:

Mode: 4
84. // Find the Sum of Squares of All Elements in a List

//Solution:

List<Integer> numbers = List.of(1, 2, 3, 4, 5);
int sumOfSquares = numbers.stream()
    .mapToInt(n -> n * n)
    .sum();
System.out.println("Sum of Squares: " + sumOfSquares);
Output:

Sum of Squares: 55
85. // Find the Sum of Cubes of All Elements in a List

//Solution:

List<Integer> numbers = List.of(1, 2, 3, 4, 5);
int sumOfCubes = numbers.stream()
    .mapToInt(n -> n * n * n)
    .sum();
System.out.println("Sum of Cubes: " + sumOfCubes);
Output:

Sum of Cubes: 225
86. // Find the Sum of All Prime Numbers in a List

//Solution:

List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
int sumOfPrimes = numbers.stream()
    .filter(n -> n > 1 && IntStream.rangeClosed(2, (int) Math.sqrt(n)).noneMatch(i -> n % i == 0))
    .mapToInt(Integer::intValue)
    .sum();
System.out.println("Sum of Primes: " + sumOfPrimes);
Output:

Sum of Primes: 17
87. // Find the Sum of All Fibonacci Numbers in a List

//Solution:

List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
int sumOfFibonacci = numbers.stream()
    .filter(n -> {
        int a = 0, b = 1;
        while (b < n) {
            int temp = b;
            b = a + b;
            a = temp;
        }
        return b == n;
    })
    .mapToInt(Integer::intValue)
    .sum();
System.out.println("Sum of Fibonacci Numbers: " + sumOfFibonacci);
Output:

Sum of Fibonacci Numbers: 20
88. // Find the Sum of All Even-Indexed Elements in a List

//Solution:

List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
int sumOfEvenIndexed = IntStream.range(0, numbers.size())
    .filter(i -> i % 2 == 0)
    .map(numbers::get)
    .sum();
System.out.println("Sum of Even-Indexed Elements: " + sumOfEvenIndexed);
Output:

Sum of Even-Indexed Elements: 25
89. // Find the Sum of All Odd-Indexed Elements in a List

//Solution:

List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
int sumOfOddIndexed = IntStream.range(0, numbers.size())
    .filter(i -> i % 2 != 0)
    .map(numbers::get)
    .sum();
System.out.println("Sum of Odd-Indexed Elements: " + sumOfOddIndexed);
Output:

Sum of Odd-Indexed Elements: 30
90. // Find the Sum of All Elements Greater Than a Specific Value

//Solution:

List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
int threshold = 5;
int sum = numbers.stream()
    .filter(n -> n > threshold)
    .mapToInt(Integer::intValue)
    .sum();
System.out.println("Sum of Elements > " + threshold + ": " + sum);
Output:

Sum of Elements > 5: 40
Parallel Streams Questions (91–100)
91. // Process a Large List of Numbers in Parallel

//Solution:

List<Integer> numbers = IntStream.rangeClosed(1, 1000000).boxed().collect(Collectors.toList());
long sum = numbers.parallelStream()
    .mapToInt(Integer::intValue)
    .sum();
System.out.println("Sum: " + sum);
Output:

Sum: 500000500000
92. // Find the Sum of All Elements in a List Using Parallel Streams

//Solution:

List<Integer> numbers = List.of(1, 2, 3, 4, 5);
int sum = numbers.parallelStream()
    .mapToInt(Integer::intValue)
    .sum();
System.out.println("Sum: " + sum);
Output:

Sum: 15
93. // Find the Maximum Element in a List Using Parallel Streams

//Solution:

List<Integer> numbers = List.of(1, 2, 3, 4, 5);
int max = numbers.parallelStream()
    .max(Integer::compare)
    .orElse(0);
System.out.println("Max: " + max);
Output:

Max: 5
94. // Find the Minimum Element in a List Using Parallel Streams

//Solution:

List<Integer> numbers = List.of(1, 2, 3, 4, 5);
int min = numbers.parallelStream()
    .min(Integer::compare)
    .orElse(0);
System.out.println("Min: " + min);
Output:

Min: 1
95. // Sort a List of Integers in Parallel Using Parallel Streams

//Solution:

List<Integer> numbers = List.of(5, 3, 1, 4, 2);
List<Integer> sortedNumbers = numbers.parallelStream()
    .sorted()
    .collect(Collectors.toList());
System.out.println("Sorted Numbers: " + sortedNumbers);
Output:

Sorted Numbers: [1, 2, 3, 4, 5]96. // Find the Product of All Elements in a List
96. // Filter a List of Strings in Parallel Using Parallel Streams

//Solution:

List<String> words = List.of("apple", "banana", "kiwi", "mango");
List<String> filteredWords = words.parallelStream()
    .filter(word -> word.length() > 4)
    .collect(Collectors.toList());
System.out.println("Filtered Words: " + filteredWords);
Output:

Filtered Words: [apple, banana, mango]
97. // Count the Occurrences of Each Element in a List Using Parallel Streams

//Solution:

List<String> words = List.of("apple", "banana", "apple", "orange");
Map<String, Long> wordCounts = words.parallelStream()
    .collect(Collectors.groupingByConcurrent(s -> s, Collectors.counting()));
System.out.println("Word Counts: " + wordCounts);
Output:

Word Counts: {orange=1, banana=1, apple=2}
98. // Group a List of Objects by a Specific Attribute Using Parallel Streams

//Solution:

class Employee {
    String name;
    String department;
    // Constructor, getters, and setters
}

List<Employee> employees = List.of(
    new Employee("Alice", "HR"),
    new Employee("Bob", "IT"),
    new Employee("Charlie", "HR")
);

Map<String, List<Employee>> groupedByDept = employees.parallelStream()
    .collect(Collectors.groupingByConcurrent(Employee::getDepartment));
System.out.println("Grouped by Department: " + groupedByDept);
Output:

Grouped by Department: {HR=[Alice, Charlie], IT=[Bob]}
99. // Merge Two Lists in Parallel Using Parallel Streams

//Solution:

List<Integer> list1 = List.of(1, 2, 3);
List<Integer> list2 = List.of(4, 5, 6);
List<Integer> merged = Stream.concat(list1.parallelStream(), list2.parallelStream())
    .collect(Collectors.toList());
System.out.println("Merged List: " + merged);Output:
Merged List: [1, 2, 3, 4, 5, 6]
100. // Find the Intersection of Two Lists Using Parallel Streams

//Solution:

List<Integer> list1 = List.of(1, 2, 3, 4);
List<Integer> list2 = List.of(3, 4, 5, 6);
List<Integer> intersection = list1.parallelStream()
    .filter(list2::contains)
    .collect(Collectors.toList());
System.out.println("Intersection: " + intersection);
Output:

Intersection: [3, 4]
