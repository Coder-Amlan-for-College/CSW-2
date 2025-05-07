/*Using the Java Date and Time API, write a Java program to perform the following
tasks:
a) Retrieve and display the current date and time.
b) Calculate the date that is 2 weeks from today.
c) Format and display the current date in the "MM/dd/yyyy" format.*/

package Assignment_7;

import java.text.SimpleDateFormat;
import java.time.*;
import java.util.Date;

public class Q7 {
   public static void main(String[] args) {
	LocalDateTime ldt = LocalDateTime.now();
	System.out.println("Current date and time: "+ldt);
	LocalDate dateAfterTwoWeeks = LocalDate.now().plusWeeks(2);
	System.out.println("Date after two weeks: "+dateAfterTwoWeeks);
	SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
	System.out.println("Formatted current date: "+sdf.format(new Date()));
	}
}

/*OUTPUT
Current date and time: 2025-05-07T09:58:54.591609300
Date after two weeks: 2025-05-21
Formatted current date: 05/07/2025 */