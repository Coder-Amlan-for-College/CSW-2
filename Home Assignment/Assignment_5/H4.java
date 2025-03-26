package Assignment_5;

import java.util.Scanner;

public class H4 {
	public static void main(String[] args) {
		StringBuilder text = new StringBuilder();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String: ");
		text.append(sc.next());
		while (true) {
			System.out.println("\nText Editor Menu: ");
			System.out.println("1. Add a substring at a specified position.");
			System.out.println("2. Remove a range of characters from the string.");
			System.out.println("3. Modify a character at a specified index");
			System.out.println("4. Concatenate another string at the end.");
			System.out.println("5. Exit");
			System.out.print("Enter your choice: ");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.print("Enter the position: ");
				int index = sc.nextInt();
				System.out.print("Enter the substring: ");
				String subString = sc.next();
				text.insert(index - 1, subString);
				displayCurrentText(text);
				break;
			case 2:
				System.out.print("Enter the start position: ");
				int startIndex = sc.nextInt();
				System.out.print("Enter the end position: ");
				int endIndex = sc.nextInt();
				text.delete(startIndex - 1, endIndex);
				displayCurrentText(text);
				break;
			case 3:
				System.out.print("Enter the index: ");
				int idx = sc.nextInt();
				System.out.print("Enter the character: ");
				char ch = sc.next().charAt(0);
				text.setCharAt(idx - 1, ch);
				displayCurrentText(text);
				break;
			case 4:
				System.out.print("Enter the String: ");
				String str = sc.next();
				text.append(str);
				displayCurrentText(text);
				break;
			case 5:
				System.out.println("Exiting..");
				displayCurrentText(text);
				System.exit(0);
			default:
				System.out.println("Invalid choice! Enter between 1 to 5");
			}
		}
	}

	private static void displayCurrentText(StringBuilder text) {
		System.out.println("Current String: " + text);
	}
}
