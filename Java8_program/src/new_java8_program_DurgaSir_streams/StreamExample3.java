package new_java8_program_DurgaSir_streams;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample3 {

	public static void main(String[] args) {
		
		    List<List<String>> namesNested = Arrays.asList( 
		      Arrays.asList("Jeff", "Bezos"), 
		      Arrays.asList("Bill", "Gates"), 
		      Arrays.asList("Mark", "Zuckerberg"));
		    
		    System.out.println(namesNested);

		    List<String> namesFlatStream = namesNested.stream()
		      .flatMap(Collection::stream)
		      .collect(Collectors.toList());
		    
		    System.out.println(namesFlatStream);
	}
}
