/*Create a functional interface Calculator with methods for addition, subtraction,
multiplication, and division. Implement these methods using lambda expressions.
Define the Calculator functional interface with methods for arithmetic operations.
Implement the interface methods using lambda expressions for basic arithmetic
operations.*/

package Assignment_7;

import java.util.*;

@FunctionalInterface
interface Calculator {
	double operation(double a, double b);
}

public class Q2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Calculator add = (a, b) -> a + b;
		Calculator subtract = (a, b) -> a - b;
		Calculator prod = (a, b) -> a * b;
		Calculator quotient = (a, b) -> {
			if (b == 0) {
				System.err.println("Denominator cannot be zero");
			}
			return a / b;
		};
		System.out.print("Enter the 1st number: ");
		double a = sc.nextDouble();
		System.out.print("Enter the 2nd number: ");
		double b = sc.nextDouble();
		System.out.println("Sum: " + add.operation(a, b));
		System.out.println("Diff: " + subtract.operation(a, b));
		System.out.println("Product: " + prod.operation(a, b));
		System.out.println("Quotient: " + quotient.operation(a, b));
	}
}

/*OUTPUT
Enter the 1st number: 12
Enter the 2nd number: 3
Sum: 15.0
Diff: 9.0
Product: 36.0
Quotient: 4.0
 */