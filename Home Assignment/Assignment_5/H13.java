package Assignment_5;

import java.io.File;
import java.util.Scanner;

public class H13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the name of the file to delete: ");
		String fileName = sc.nextLine();
		File fileToDelete = new File(fileName);
		if (fileToDelete.exists()) {
			if (fileToDelete.delete()) {
				System.out.println("File deleted successfully: " + fileName);
			} else {
				System.out.println("Unable to delete the file: " + fileName);
			}
		} else {
			System.out.println("File does not exist: " + fileName);
		}
		sc.close();
	}
}

//OUTPUT:
//	Enter the name of the file to delete: src/Assignment_5/diary.txt
//	File deleted successfully: src/Assignment_5/diary.txt
