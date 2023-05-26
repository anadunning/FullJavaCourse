import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Program {

	public static void main(String[] args) {
		
		LocalDate d04 = LocalDate.parse("2023-05-25");
		LocalDateTime d05 = LocalDateTime.parse("2023-05-25T01:30:35");
		Instant d06 = Instant.parse("2023-05-25T01:30:55Z");
		
		LocalDate lastWeekLocalDate = d04.minusDays(7);
		LocalDate nextWeekLocalDate = d04.plusDays(7);
		
		LocalDateTime lastWeekLocalDateTime = d05.minusDays(7);
		LocalDateTime nextWeekLocalDateTime = d05.plusDays(7);
		
		Instant lastWeekInstant = d06.minus(7, ChronoUnit.DAYS);
		Instant nextWeekInstant = d06.plus(7, ChronoUnit.DAYS);
		
		System.out.println("lastWeekLocalDate = " + lastWeekLocalDate);
		System.out.println("nextWeekLocalDate = " + nextWeekLocalDate);
		
		System.out.println("lastWeekLocalDateTime = " + lastWeekLocalDateTime);
		System.out.println("nextWeekLocalDateTime = " + nextWeekLocalDateTime);
		
		System.out.println("lastWeekInstant = " + lastWeekInstant);
		System.out.println("nextWeekInstant = " + nextWeekInstant);
		
		// Calculating the duration between two date-hour, using the Duration class
		Duration t1 = Duration.between(lastWeekLocalDateTime, d05);
		System.out.println("t1 days = " + t1.toDays());
		
		System.out.println("\n ------------------- Now with LocalDate ------------------------");
		// Duration t2 = Duration.between(lastWeekLocalDate, d04); // This one doesn't work.
		// When trying to calculate between LocalDate and d04, the program launches an exception saying that seconds is an unsupported unit.
		// Wee need to convert to LocalDate
		Duration t2 = Duration.between(lastWeekLocalDate.atTime(0, 0), d04.atTime(0, 0));
		System.out.println("t2 days = " + t2.toDays());
		// Also it can be done with atStartOfDay
		Duration t3 = Duration.between(lastWeekLocalDate.atStartOfDay(), d04.atTime(0, 0));
		System.out.println("t3 days = " + t3.toDays());
		
		Duration t4 = Duration.between(lastWeekInstant, d06);
		System.out.println("t4 days = " + t4.toDays());
		
		Duration t5 = Duration.between(d06, lastWeekInstant);
		System.out.println("t5 days = " + t5.toDays());
	}
}
