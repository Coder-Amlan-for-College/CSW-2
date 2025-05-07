/*Write a Java program that demonstrates how to format a LocalDateTime object using
the DateTimeFormatter class. Create a LocalDateTime instance representing a
specific date and time. Then, use a custom format pattern "yyyy-MM-dd HH:mm:ss" to
convert this date-time into a formatted string. Finally, print the formatted result.*/

package Assignment_7;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Q8 {
	public static void main(String[] args) {
		LocalDateTime dateTime = LocalDateTime.of(2025, 5, 7, 14, 30, 45);
		DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		String formatted1 = dateTime.format(formatter1);
		System.out.println("Formatted: " + formatted1);
		DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("EEEE, yyyy-MM-dd hh:mm:ss a");
		String formatted2 = dateTime.format(formatter2);
		System.out.println("Along with day in 12hr format: " + formatted2);
	}
}

/*OUTPUT
Formatted: 2025-05-07 14:30:45
Along with day in 12hr format: Wednesday, 2025-05-07 02:30:45 pm*/