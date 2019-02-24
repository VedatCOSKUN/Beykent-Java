import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

// Zones: https://docs.oracle.com/javase/8/docs/api/java/time/ZoneId.html

/*
 * PATTERNS to memorize:
 * 		yyyy 2019 2018 2017 ...
 *              MMMM JANUARY FEBRUARY MARCH ...
 *              MMM  Jan Feb Mar ...
 * 		MM   01 02 03 ... 12
 *  	        dd   01 02 03 ... 31
 * 		hh   01 02 03 ... 23
 * 		mm   01 02 03 ... 59
 * 
 */
public class ZonedDateTest 
{
   public static void main(String[] args) 
   {
       DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm");
       LocalDateTime istanbulDeparture = LocalDateTime.of(2019, Month.FEBRUARY, 22, 23, 30);
       System.out.println("Depart from Istanbul Local Time     = " + format.format(istanbulDeparture));
       ZonedDateTime tokyoDeparture = istanbulDeparture.atZone(ZoneId.of("Asia/Tokyo"));
       System.out.println("Tokyo Time at the time of departure = " + format.format(tokyoDeparture));
       ZonedDateTime tokyoArrival = istanbulDeparture.atZone(ZoneId.of("Asia/Tokyo")).plusHours(7);
       System.out.println("Tokyo Time after 7 hours of flight  = " + format.format(tokyoArrival));

   }
}