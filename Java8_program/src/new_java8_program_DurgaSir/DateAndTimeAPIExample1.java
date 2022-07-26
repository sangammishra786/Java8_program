package new_java8_program_DurgaSir;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class DateAndTimeAPIExample1 {
	public static void main(String[] args) {
		
		ZoneId localZone = ZoneId.systemDefault();
		ZonedDateTime localTime = ZonedDateTime.now(localZone);
		System.out.println(localZone+" -  "+localTime);
		
		ZoneId la = ZoneId.of("America/Los_Angeles");
		ZonedDateTime dt = ZonedDateTime.now(la);
		System.out.println(dt);
	}
}
