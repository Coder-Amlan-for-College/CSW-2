package Assignment_5;

import java.util.Scanner;

public class H6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String: ");
		String str = sc.next().toLowerCase();
		char[] ch = str.toCharArray();
		System.out.print("Enter the character to search: ");
		char charToSearch = sc.next().charAt(0);
		charToSearch = Character.toLowerCase(charToSearch);
		int firstIndex = -1, lastIndex = -1, flag = -1;
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] == charToSearch) {
				if (flag == -1) {
					firstIndex = i;
					flag = 0;
				} else {
					lastIndex = i;
				}
			}
		}
		if (flag == -1)
			System.out.println("Character Not Found");
		else if (lastIndex == -1) {
			System.out.println("Character found only at position: " + (firstIndex + 1));
		} else {
			System.out.println("First Occurence of Character " + charToSearch + " is at position: " + (firstIndex + 1));
			System.out.println("Last Occurence of Character " + charToSearch + " is at position: " + (lastIndex + 1));
		}
		sc.close();
	}
}