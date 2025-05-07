/*Write a Java program that demonstrates the use of a lambda expression with the
Function functional interface to calculate the factorial of a number. Define a method
that returns a lambda expression that takes an integer as input and computes its factorial using an iterative approach. In the main method, use this lambda expression
to calculate and display the factorial of a given number.
*/
package Assignment_7;

import java.util.function.Function;

public class Q6 {
	public static Function<Integer, Long> getFactorialFunction() {
		return (Integer n) -> {
			long result = 1;
			for (int i = 2; i <= n; i++) {
				result *= i;
			}
			return result;
		};
	}

	public static void main(String[] args) {
		Function<Integer, Long> factorialFunction = getFactorialFunction();
		int[] numbers = { 0, 1, 5, 7, 10 };
		for (int num : numbers) {
			System.out.println("Factorial of " + num + " is " + factorialFunction.apply(num));
		}
	}
}

/*OUTPUT
Factorial of 0 is 1
Factorial of 1 is 1
Factorial of 5 is 120
Factorial of 7 is 5040
Factorial of 10 is 3628800 */
