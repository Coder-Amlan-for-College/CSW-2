package functionalProgramming;

import java.util.*;
import java.util.function.Function;
public class Q1 {
  public static void main(String[] args) {
	List<Integer> numbers = List.of(1,2,3,4,5);
	//Example of a higher order function: map
	List<Integer> squareNumbers = map(numbers, x -> x*x);
	System.out.println("Squared numbers: "+squareNumbers);
	//Example of a higher pure function: sum
	int sum = sum(numbers);
	System.out.println("Sum of numbers: "+sum);
}
  public static <T,R> List<R> map(List<T> list, Function<T, R>mapper) {
	List<R> result = new ArrayList<>();
	for (T item : list) {
		result.add(mapper.apply(item));
	}
	return result;
}
 public static int sum(List<Integer> numbers) {
	int result = 0;
	for(int number:numbers) {
		result+=number;
	}
	return result;
}
}

/*OUTPUT
Squared numbers: [1, 4, 9, 16, 25]
Sum of numbers: 15
*/
