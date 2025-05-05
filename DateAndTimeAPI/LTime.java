package DateAndTimeAPI;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class LTime {
	public static void main(String[] args) {
		LocalTime whatIsTheTime = LocalTime.now();
		System.out.println(whatIsTheTime);
		LocalTime parsingTime = LocalTime.parse("03:20");
		System.out.println(parsingTime);
		LocalTime usingOf = LocalTime.of(3, 20);
		System.out.println(usingOf);

		// add specific time to current time
		LocalTime fastForward = LocalTime.parse("03:20").plus(5, ChronoUnit.HOURS);
		System.out.println(fastForward);
		int whichHour = LocalTime.parse("03:20").getHour();
		System.out.println(whichHour);

		// compare time
		boolean comparingTime = LocalTime.parse("03:20").isBefore(LocalTime.parse("02:30"));
		System.out.println(comparingTime);
		LocalTime maximumTime = LocalTime.MAX;
		System.out.println(maximumTime);
	}
}

/*OUTPUT
10:33:20.046887200
03:20
03:20
08:20
3
false
23:59:59.999999999
 */