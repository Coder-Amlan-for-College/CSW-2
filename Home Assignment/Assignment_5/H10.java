package Assignment_5;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class H10 {
	public static void main(String[] args) {
		File file = new File("diary.txt");
		try {
			if (!file.exists()) {
				throw new FileNotFoundException("File does not exist");
			}
			FileReader fileReader = new FileReader(file);
			int character;
			System.out.println("Diary entries:");
			while ((character = fileReader.read()) != -1) {
				System.out.print((char) character);
			}
		} catch (FileNotFoundException e) {
			// TODO: handle exception
			System.err.println(e);

		} catch (IOException e) {
			// TODO: handle exception
			System.err.println("An error occurred while reading the file: " + e.getMessage());
		}
	}
}
