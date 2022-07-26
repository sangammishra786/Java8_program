package DateAndTime;

import java.time.Duration;
import java.time.Instant;

public class InstantExample {
	
	public static void main(String[] args) {
		
		Instant instant = Instant.now();
		System.out.println(instant);
		
		//Jab 01, 1970 -> Each -> 86400 seconds
		System.out.println(" instant.getEpochSecond(); : " + instant.getEpochSecond());
		
		System.out.println(Instant.ofEpochSecond(0));
		
		Instant instant1 = Instant.now();
		
		Duration duration = Duration.between(instant, instant1);
		System.out.println("Duration : " + duration.getNano());
	}
}
