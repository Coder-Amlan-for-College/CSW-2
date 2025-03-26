package Assignment_5;

import java.util.Scanner;

public class H3 {
   public static void main(String[] args) {
	StringBuffer text = new StringBuffer();
	Scanner sc = new Scanner(System.in);
	while (true) {
		System.out.println("\nText Editor Menu: ");
		System.out.println("1. Append text");
		System.out.println("2. Insert text");
		System.out.println("3. Delete text");
		System.out.println("4. Reverse text");
		System.out.println("5. Replace text");
		System.out.println("6. Display current text");
		System.out.println("7. Exit");
		System.out.print("Enter your choice: ");
		int choice = sc.nextInt();
		
		switch (choice) {
		case 1:
			System.out.print("Enter text to append: ");
			String appendText = sc.next();
			text.append(appendText);
			displayTextInfo(text);
			break;
		case 2:
			System.out.print("Enter text to insert: ");
			String insertText = sc.next();
			System.out.print("Enter index to insert: ");
			int insertIndex = sc.nextInt();
			text.insert(insertIndex, insertText);
			displayTextInfo(text);
			break;
		case 3:
			System.out.print("Enter start index to delete: ");
			int startIndex = sc.nextInt();
			System.out.print("Enter end index to delete: ");
			int endIndex = sc.nextInt();
			text.delete(startIndex, endIndex);
			displayTextInfo(text);
			break;
		case 4:
			text.reverse();
			displayTextInfo(text);
			break;
		case 5:
			System.out.print("Enter start index to replace: ");
			int replaceStartIndex = sc.nextInt();
			System.out.print("Enter end index to replace: ");
			int replaceEndIndex = sc.nextInt();
			System.out.print("Enter replacement text: ");
			String replacementText = sc.next();
			text.replace(replaceStartIndex, replaceEndIndex, replacementText);
			displayTextInfo(text);
			break;
		case 6:
			System.out.print("Current text: "+text);
			break;
		case 7:
			System.out.println("Exiting...");
			sc.close();
			System.exit(0);
			break;
		default:
			System.out.println("Invalid choice! Please enter a number between 1 and 7.");
		}
	}
}
   private static void displayTextInfo(StringBuffer text) {
      System.out.println("Current text: "+text);
      System.out.println("Current text capacity: "+text.capacity());
      System.out.println("Current text length: "+text.length());
 }
}

//OUTPUT:
//
//Text Editor Menu: 
//1. Append text
//2. Insert text
//3. Delete text
//4. Reverse text
//5. Replace text
//6. Display current text
//7. Exit
//Enter your choice: 1
//Enter text to append: helloWorld
//Current text: helloWorld
//Current text capacity: 16
//Current text length: 10
//
//Text Editor Menu: 
//1. Append text
//2. Insert text
//3. Delete text
//4. Reverse text
//5. Replace text
//6. Display current text
//7. Exit
//Enter your choice: 2
//Enter text to insert: Everyone
//Enter index to insert: 5
//Current text: helloEveryoneWorld
//Current text capacity: 34
//Current text length: 18
//
//Text Editor Menu: 
//1. Append text
//2. Insert text
//3. Delete text
//4. Reverse text
//5. Replace text
//6. Display current text
//7. Exit
//Enter your choice: 3
//Enter start index to delete: 5
//Enter end index to delete: 12
//Current text: helloeWorld
//Current text capacity: 34
//Current text length: 11
//
//Text Editor Menu: 
//1. Append text
//2. Insert text
//3. Delete text
//4. Reverse text
//5. Replace text
//6. Display current text
//7. Exit
//Enter your choice: 4
//Current text: dlroWeolleh
//Current text capacity: 34
//Current text length: 11
//
//Text Editor Menu: 
//1. Append text
//2. Insert text
//3. Delete text
//4. Reverse text
//5. Replace text
//6. Display current text
//7. Exit
//Enter your choice: 5
//Enter start index to replace: 5
//Enter end index to replace: 10
//Enter replacement text: Hello
//Current text: dlroWHelloh
//Current text capacity: 34
//Current text length: 11
//
//Text Editor Menu: 
//1. Append text
//2. Insert text
//3. Delete text
//4. Reverse text
//5. Replace text
//6. Display current text
//7. Exit
//Enter your choice: 6
//Current text: dlroWHelloh
//Text Editor Menu: 
//1. Append text
//2. Insert text
//3. Delete text
//4. Reverse text
//5. Replace text
//6. Display current text
//7. Exit
//Enter your choice: 7
//Exiting...


