/*Write a Java program using the Java Date and Time API to calculate the number of
days between two dates. The program should prompt the user to enter a start date and
an end date (in YYYY-MM-DD format), and then display the total number of days
between the two dates using the ChronoUnit.DAYS method.
*/

package Assignment_7;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Q10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the start date in the format(yyyy-MM-dd): ");
		LocalDate startDate = LocalDate.parse(sc.next());
		sc.nextLine();
		System.out.println("Enter the end date in the format(yyyy-MM-dd): ");
		LocalDate endDate = LocalDate.parse(sc.next());
		long diff = ChronoUnit.DAYS.between(startDate, endDate);
		System.out.println("Days between " + startDate + " and " + endDate + " is: " + diff);
	}
}

/*OUTPUT
Enter the start date in the format(yyyy-MM-dd): 
2025-05-07
Enter the end date in the format(yyyy-MM-dd): 
2025-05-09
Days between 2025-05-07 and 2025-05-09 is: 2
*/
 