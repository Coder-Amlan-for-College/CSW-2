package DateAndTimeAPI;

import java.time.LocalDateTime;
import java.time.Month;

public class LDTime {
	public static void main(String[] args) {
		System.out.println(LocalDateTime.now());
		System.out.println(LocalDateTime.of(2018, Month.MARCH, 10, 03, 30));
		System.out.println(LocalDateTime.parse("2018-01-20T06:24:00"));

		// Add using plus(), Subtract using minus()
		LocalDateTime addHours = LocalDateTime.now().plusHours(3);
		System.out.println(addHours);
		LocalDateTime subHours = LocalDateTime.now().minusHours(3);
		System.out.println(subHours);

		// getMonth
		System.out.println(LocalDateTime.now().getMonth());
	}
}

/*OUTPUT
2025-05-05T10:19:10.381218400
2018-03-10T03:30
2018-01-20T06:24
2025-05-05T13:19:10.413196400
2025-05-05T07:19:10.413196400
MAY
*/