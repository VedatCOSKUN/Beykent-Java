import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class LocalDateTest 
{
   public static void main(String[] args) 
   {

      // Current date
      LocalDate todayInIstanbul = LocalDate.now();
      System.out.println("LocalDate.now()                       = " + todayInIstanbul);
      System.out.println("LocalDate.now().getYear()             = " + todayInIstanbul.getYear());
      System.out.println("LocalDate.now().getMonth()            = " + todayInIstanbul.getMonth());
      System.out.println("LocalDate.now().getMonth().getValue() = " + todayInIstanbul.getMonth().getValue());
      System.out.println("LocalDate.now().getDayOfMonth()       = " + todayInIstanbul.getDayOfMonth());
      System.out.println("LocalDate.now().getDayOfWeek(         = " + todayInIstanbul.getDayOfWeek());
      System.out.println("LocalDate.now().getDayOfYear()        = " + todayInIstanbul.getDayOfYear());
      System.out.println();

      // LocalDate's plus methods 
      System.out.println("LocalDate.now().plusDays(5)           = " + todayInIstanbul.plusDays(5));
      System.out.println("LocalDate.now().plusDays(5).getYear() = " + todayInIstanbul.plusDays(5).getYear());
      System.out.println("LocalDate.now().plusMonths(15)        = " + todayInIstanbul.plusMonths(15));
      System.out.println("LocalDate.now().plusWeeks(45)         = " + todayInIstanbul.plusWeeks(45));
      System.out.println("LocalDate.now().plusYears(5)          = " + todayInIstanbul.plusYears(5));
      System.out.println();
      
      // LocalDate's minus methods 
      System.out.println("LocalDate.now().minusDays(5)          = " + todayInIstanbul.minusDays(5));
      System.out.println("LocalDate.now().minusMonths(15)       = " + todayInIstanbul.minusMonths(15));
      System.out.println("LocalDate.now().minusWeeks(45)        = " + todayInIstanbul.minusWeeks(45));
      System.out.println("LocalDate.now().minusYears(5)         = " + todayInIstanbul.minusYears(5));
      System.out.println();
      
      //Specific date
      LocalDate someDayInIstanbul = LocalDate.of(2019, Month.JANUARY, 1);
      System.out.println("LocalDate.of(2019,Month.JANUARY,1)              = " + someDayInIstanbul);
      System.out.println("LocalDate.of(2019,Month.JANUARY,1).minusDays(1) = " + someDayInIstanbul.minusDays(1));
      System.out.println();
      System.out.println("LocalDate.parse(\"01-02-2019\", DateTimeFormatter.ofPattern(\"dd-MM-yyyy\") = " + LocalDate.parse("01-02-2019", DateTimeFormatter.ofPattern("dd-MM-yyyy")));
      System.out.println("LocalDate.parse(\"2019-02-01\", DateTimeFormatter.ofPattern(\"yyyy-MM-dd\") = " + LocalDate.parse("2019-02-01", DateTimeFormatter.ofPattern("yyyy-MM-dd")));
      System.out.println();

      DateTimeFormatter dateFormat1 = DateTimeFormatter.ofPattern("dd-MM-YYYY");
      System.out.println("LocalDate.now().format(dateFormat1) = " + LocalDate.now().format(dateFormat1));
      System.out.println("todayInIstanbul.now().format(DateTimeFormatter.ofPattern(\"dd-MM-YYYY\")) = " + LocalDate.now().format(DateTimeFormatter.ofPattern("dd-MM-YYYY")));
      System.out.println("todayInIstanbul.now().format(DateTimeFormatter.ofPattern(\"YYYY-MM-dd\")) = " + LocalDate.now().format(DateTimeFormatter.ofPattern("YYYY-MM-dd")));
      System.out.println();

      
      // isEqual() & isAfter() & isBefore()
      System.out.println("todayInIstanbul equals to someDayInIstanbul IS " + (todayInIstanbul.isEqual(someDayInIstanbul)) );
      System.out.println("todayInIstanbul equals to todayInIstanbul   IS " + (todayInIstanbul.isEqual(todayInIstanbul)) );
      System.out.println("todayInIstanbul isAfter todayInIstanbul     IS " + (todayInIstanbul.isAfter(someDayInIstanbul)) );
      System.out.println("todayInIstanbul isBefore todayInIstanbul    IS " + (todayInIstanbul.isBefore(someDayInIstanbul)) );
      System.out.println();

      // Number of days in a month & in a year
      System.out.println("Number of days in month of todayInIstanbul  = " + todayInIstanbul.lengthOfMonth() );
      System.out.println("Number of days in year of someDayInIstanbul = " + someDayInIstanbul.lengthOfYear() );
      System.out.println();
            
      // leap year?
      System.out.println("year of todayInIstanbul is leap year IS  " + todayInIstanbul.isLeapYear() );
      System.out.println();
      
   }
}