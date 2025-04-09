package ExtraQuestions;

import java.util.Scanner;
import java.util.TreeSet;

public class Q4UniqueCharacters {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string: ");
		String str = sc.next();
		TreeSet<Character> characters = new TreeSet<>();
		for (int i = 0; i < str.length(); i++) {
			characters.add(str.charAt(i));
		}
		for (char ch : characters) {
			System.out.print(ch + "-->");
		}
		System.out.println("null");
		sc.close();
	}
}
