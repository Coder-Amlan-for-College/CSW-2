package functionalProgramming;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Q3 {
	@FunctionalInterface
	interface announcement {
		public String announce();
	}

	public static void main(String[] args) {
		List<String> names = new LinkedList<>();
		names.add("Sam");
		names.add("Alexander");
		names.add("Robert");
		names.add("Emily");
		System.out.println("Before sorting: " + names);
		Collections.sort(names, (String s1, String s2) -> s1.length() - s2.length());
		System.out.println("After sorting by length: " + names);
		announcement a1 = () -> {
			return "We have an announcement to be made. ";
		};
		System.out.println(a1.announce());
	}
}

/*OUTPUT:
Before sorting: [Sam, Alexander, Robert, Emily]
After sorting by length: [Sam, Emily, Robert, Alexander]
We have an announcement to be made. 
*/
