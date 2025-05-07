/*Write a Java program to calculate the simple interest on a current account using the
Java Date and Time API. The program should prompt the user to enter the start date
and the initial amount. Assume the rate of interest is 8% per annum. Calculate the
number of days between the start date and the current date, then compute the interest
using the simple interest formula. Finally, display the total amount after adding the
interest to the initial amount.
*/
package Assignment_7;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Q9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the start date:(yyyy-MM-dd) ");
		LocalDate startDate = LocalDate.parse(sc.next());
		LocalDate currDate = LocalDate.now();
		System.out.println("Enter the initial amount: ");
		double amt = sc.nextDouble();
		int rate = 8;
		long days = ChronoUnit.DAYS.between(startDate, currDate);
		double interest = (amt * rate * (days / 365.0)) / 100.0;
		System.out.println("Interest: " + interest + "\nTotal Amount: " + (amt + interest));
	}
}

/*OUTPUT
Enter the start date:(yyyy-MM-dd) 
2024-05-07
Enter the initial amount: 
2000
Interest: 160.0
Total Amount: 2160.0
*/