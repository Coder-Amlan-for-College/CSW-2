/*Write a program that sorts a list of strings based on their lengths in descending order.
Define a custom comparator using a lambda expression that compares strings based on
their lengths. Use the custom comparator to sort the list of strings in descending order
of length.*/

package Assignment_7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Q3 {
	public static void main(String[] args) {
		List<String> strings = new ArrayList<>();
		strings.add("Sam");
		strings.add("Alexander");
		strings.add("Robert");
		strings.add("Emily");
		System.out.println("Before sorting: \n" + strings);
		Collections.sort(strings, (String s1, String s2) -> s2.length() - s1.length());
		System.out.println("After sorting(Descending Order) on the basis of their length: \n" + strings);
	}
}

/*OUTPUT
Before sorting: 
[Sam, Alexander, Robert, Emily]
After sorting(Descending Order) on the basis of their length: 
[Alexander, Robert, Emily, Sam]
 */