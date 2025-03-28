package Assignment_5;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class H9 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your diary entry: ");
		String entry = scanner.nextLine();
		File file = new File("diary.txt");
		try {
			if (file.exists()) {
				throw new IOException("Error: The file 'diary.txt' already exists. Exiting to prevent overwriting");

			} else {
				if (file.createNewFile()) {
					System.out.println("File 'diary.txt' created successfully");
					try (FileWriter writer = new FileWriter(file, true)) {
						writer.write(getCurrentDateTime() + "\n" + entry + "\n");
						System.out.println("Diary entry added successfully");
					}
				} else {
					System.out.println("Failed to create file " + file);
					return;
				}
			}
		} catch (IOException e) {
			System.err.println("An error occurred while writing to the file: " + e.getMessage());
		} finally {
			scanner.close();
		}
	}

	private static String getCurrentDateTime() {
		return LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
	}
}

/*
 * <Running the prog 1st time> 
 * Enter your diary entry: 
 * Hii 
 * File 'diary.txt' created successfully 
 * Diary entry added successfully
 * 
 * -----------------------------------
 * 
 * <Running the prog 2nd time> 
 * Enter your diary entry: 
 * Hii Again 
 * An error occurred while writing to the file: Error: The file 'diary.txt' already
 * exists. Exiting to prevent overwriting
 * 
 * 
 */
