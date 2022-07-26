package DateAndTime;

import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;
import java.time.temporal.ValueRange;

public class DifferentGetMethod {
	
	public static void main(String[] args) {
		
		LocalDate localDate = LocalDate.now();
		System.out.println("localDate : " + localDate);
		
		/*
		 * Get value from the localDate
		 */
		System.out.println("DayOfMonth : "+ localDate.getDayOfMonth());
		System.out.println("DayOfYear : "+ localDate.getDayOfYear());
		System.out.println("Month value : " + localDate.getMonthValue());
		System.out.println("Year value : " + localDate.getYear());
		System.out.println("ALIGNED_DAY_OF_WEEK_IN_MONTH : " + localDate.get(ChronoField.ALIGNED_DAY_OF_WEEK_IN_MONTH));
		System.out.println("DAY_OF_WEEK : " + localDate.get(ChronoField.DAY_OF_WEEK));
		System.out.println("DAY_OF_WEEK using range: " + localDate.range(ChronoField.DAY_OF_MONTH));
		
		/*
		 * Modify the LocalDate
		 */
		
		System.out.println("plusDays : " + localDate.plusDays(3));
		System.out.println("plusYears : " + localDate.plusYears(2));
		System.out.println("minusDays : " + localDate.minusDays(2));
		System.out.println("minusYears : " + localDate.minusYears(2));
		System.out.println("getEra : " + localDate.getEra());
		System.out.println("withDayOfMonth : " + localDate.withDayOfMonth(2));
		System.out.println("withDayOfYear : " + localDate.withDayOfYear(5));
		System.out.println("firstDayOfMonth : " + localDate.with(TemporalAdjusters.firstDayOfMonth()));
		System.out.println("firstDayOfNextYear : " + localDate.with(TemporalAdjusters.firstDayOfNextYear()));
		System.out.println("isSupported : " + localDate.isSupported(ChronoField.HOUR_OF_DAY));
		
		/*
		 * Additional Method of localDate
		 */
		LocalDate localDate1 = LocalDate.now().plusDays(1);
		System.out.println("Is Leap Year : " + localDate.ofYearDay(2021, 1).isLeapYear());
		System.out.println("Is equal method : " + localDate.isEqual(localDate1));
		System.out.println("isBefore method : " + localDate.isBefore(localDate1));
		System.out.println("isAfter method : " + localDate1.isAfter(localDate));
		/*
		 * Unsupported Method
		 */
		System.out.println("isSupported method : " + localDate.isSupported(ChronoUnit.YEARS));
		System.out.println("isSupported method : " + localDate.isSupported(ChronoField.DAY_OF_MONTH));
	}
}
