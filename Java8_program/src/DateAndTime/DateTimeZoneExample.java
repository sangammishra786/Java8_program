package DateAndTime;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class DateTimeZoneExample {
	
	public static void main(String[] args) {
		
		ZonedDateTime zoneDateTime =  ZonedDateTime.now();
		System.out.println("zoneDateTime : " + zoneDateTime);
		System.out.println("ZoneOffSet time : " + zoneDateTime.getOffset());
		
		System.out.println("ZoneId : " + zoneDateTime.getZone());
		
		/*
		 * ZoneId.getAvailableZoneIds() .stream() .forEach(zone->
		 * System.out.println("getAvailableZoneIds : " + zone)) ;
		 */
		
		System.out.println("No of Zone : " + ZoneId.getAvailableZoneIds().size());
		System.out.println("Dili GMT : " + ZonedDateTime.now(ZoneId.of("Asia/Calcutta")));
		
		
		/*
		 * Convert from localDAteTime, instant to ZondDateTime
		 */
		

		LocalDateTime localDateTime3 = LocalDateTime.now();
		System.out.println("localDateTime3 : " + localDateTime3);
		ZonedDateTime zoneDateTime2 = localDateTime3.atZone(ZoneId.of("Asia/Calcutta"));
		
		System.out.println(" zoneDateTime3 : " + zoneDateTime2);
		
		ZonedDateTime zoneDateTime3 = Instant.now().atZone(ZoneId.of("Asia/Dili"));
		System.out.println(" zoneDateTime3 : " + zoneDateTime3);
		
		
	}
}
