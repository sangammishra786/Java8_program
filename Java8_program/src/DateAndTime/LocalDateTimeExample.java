package DateAndTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoField;

public class LocalDateTimeExample {
	
	
	public static void main(String[] args) {
		 LocalDateTime localDateTime = LocalDateTime.now();
		
		System.out.println("localDateTime : " + localDateTime);
		
		System.out.println("localDateTime of method : " 
						+ localDateTime.of(2021, 02, 12, 2, 30, 25, 123456));
		
		LocalDateTime localDateTime2 = 
					LocalDateTime.of(LocalDate.now(), LocalTime.now());
		System.out.println("localDateTime2 : " + localDateTime2);
		
		/*
		 * Getting the time and date from localDateTime Instance
		 */
		
		System.out.println("hour : " + localDateTime.getHour());
		System.out.println("Minutes : " + localDateTime.getMinute());
		System.out.println("Day : " + localDateTime.getDayOfMonth());
		
		System.out.println("withHour : " + localDateTime.withHour(3));
		
		System.out.println("Day of month : " + localDateTime.get(ChronoField.DAY_OF_MONTH));
	}
}
