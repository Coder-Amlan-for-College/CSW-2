package DateAndTimeAPI;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class WeekQues {
	public static void main(String[] args) {
		// verify date for a particular day
		DayOfWeek whichDay = LocalDate.parse("2018-03-10").getDayOfWeek();
		System.out.println(whichDay);

		// date of the month
		int dayOfMonth = LocalDate.parse("2018-03-10").getDayOfMonth();
		System.out.println(dayOfMonth);

		// Leap year check
		boolean isItsLeapYear = LocalDate.now().isLeapYear();
		System.out.println(isItsLeapYear);

		// To determine the sequence of events between two dates
		boolean beforeOrNot = LocalDate.parse("2018-06-13").isBefore(LocalDate.parse("2018-06-10"));
		System.out.println(beforeOrNot);
		boolean afterOrNot = LocalDate.parse("2018-06-10").isAfter(LocalDate.parse("2018-06-09"));
		System.out.println(afterOrNot);

	}
}

/*OUTPUT:
SATURDAY
10
false
false
true
 */