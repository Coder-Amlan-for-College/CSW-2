/*You are required to create a Java program that uses a functional interface to process
strings. Define a functional interface named StringProcessor with a method that takes
a string as input and returns an integer. Within the main method of a class, use a
lambda expression to implement this method such that it returns the length of the given
string. */

package Assignment_7;

@FunctionalInterface
interface StringProcessor {
	int process(String input);
}

public class Q1 {
	public static void main(String[] args) {
		StringProcessor lengthProcessor = (String s) -> s.length();
		String testString = "Hello, Functional Interface!";
		int length = lengthProcessor.process(testString);
		System.out.println("The length of the string is: " + length);
	}
}

//OUTPUT
//The length of the string is: 28
