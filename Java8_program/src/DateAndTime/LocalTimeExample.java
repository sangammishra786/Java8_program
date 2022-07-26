package DateAndTime;

import java.time.LocalTime;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class LocalTimeExample {
	
	public static void main(String[] args) {
		
		LocalTime localTime = LocalTime.now();
		System.out.println("localTime is : " + localTime);
		
		/*
		 * Explore .of() method with different parameters
		 */
		LocalTime localTime1 = LocalTime.of(12, 50);
		System.out.println("localTime1 is : " + localTime1);
		
		LocalTime localTime2 = LocalTime.of(12, 25, 30);
		System.out.println("localTime2 is : " + localTime2);
		
		LocalTime localTime3 = LocalTime.of(10,50,35,2569856);
		System.out.println("localTime3 is : " + localTime3);
		
		/*
		 * Getting the time using localTime
		 */
		
		System.out.println("getHour : " + localTime.getHour());
		System.out.println("getMinute : " + localTime.getMinute());
		System.out.println("getSecond : " + localTime.getSecond());
		System.out.println("CLOCK_HOUR_OF_DAY : " 
					+ localTime.get(ChronoField.CLOCK_HOUR_OF_DAY));
		System.out.println("toSecondOfDay : " 
				+ localTime.toSecondOfDay());
		
		/*
		 * Modify the value of localTtime using some handy method
		 */
		
		System.out.println("minus :  " + localTime.minus(2, ChronoUnit.HOURS));
		System.out.println("minusHours :  " + localTime.minusHours(2));
		System.out.println("MIDNIGHT :  " + localTime.with(localTime.MIDNIGHT));
		System.out.println("HOUR_OF_DAY :  " 
					+ localTime.with(ChronoField.HOUR_OF_DAY, 22));
		System.out.println("plusMinutes :  " + localTime.plusMinutes(20));
		System.out.println("withHour :  " + localTime.withHour(2));
		
		
		
	}
}
