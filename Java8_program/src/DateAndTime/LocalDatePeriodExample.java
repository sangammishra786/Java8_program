package DateAndTime;

import java.time.LocalDate;
import java.time.Period;

public class LocalDatePeriodExample {
	
	public static void main(String[] args) {
		
		LocalDate localDate1 = LocalDate.of(2021,01,01);
		LocalDate localDate2 = LocalDate.of(2021,12,31);
		
		Period period = localDate1.until(localDate2);
		System.out.println("period getDays : " + period.getDays());
		System.out.println("period getMonths : " + period.getMonths());
		
		Period period1 = Period.ofDays(15);
		System.out.println("period.getDays : " + period1.getDays());
		
		Period period2 = Period.ofYears(15);
		System.out.println("period.getYears : " + period2.getYears());
		System.out.println("period.totalMonth in year : " + period2.toTotalMonths());
		
		/*
		 * between method
		 */
		
		Period period3 = Period.between(localDate1, localDate2);
		System.out.println("Period.between : " + period3.getDays()+ "days, " 
						+ period3.getMonths()+"month, " + period3.getYears()+"years");
	}
}
