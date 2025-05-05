package Assignment_7;

import java.util.function.Function;

public class Q5 {
	public static Function<Integer, Integer> getSquareFunction() {
		return (Integer x) -> x * x;
	}

	public static void main(String[] args) {
		Function<Integer, Integer> squareFunction = getSquareFunction();
		int[] numbers = { 2, 3, 4, 5, 6 };
		System.out.println("Squares of the numbers: ");
		for (int num : numbers) {
			System.out.println("Square of " + num + " is " + squareFunction.apply(num));
		}
	}
}

/*OUTPUT
Squares of the numbers: 
Square of 2 is 4
Square of 3 is 9
Square of 4 is 16
Square of 5 is 25
Square of 6 is 36
 */