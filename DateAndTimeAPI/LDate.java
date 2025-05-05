package DateAndTimeAPI;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class LDate {
	public static void main(String[] args) {
		// Today's Date
		LocalDate currentDate = LocalDate.now();
		System.out.println(currentDate);

		// Any Date
		System.out.println(LocalDate.of(2018, 01, 01));

		// Any Date using parse
		System.out.println(LocalDate.parse("2018-01-01"));

		// Add specific no. of days to the current date
		LocalDate taskDate = LocalDate.now().plusDays(1);
		System.out.println(taskDate);

		// To Achieve the desired date exactly one month in the past
		LocalDate lastMonth = LocalDate.now().minus(1, ChronoUnit.MONTHS);
		System.out.println(lastMonth);
	}
}

/*OUTPUT
2025-05-05
2018-01-01
2018-01-01
2025-05-06
2025-04-05
*/
