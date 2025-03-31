package Assignment_5;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.io.FileWriter;

public class H14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the source file path: ");
		String srcFilePath = sc.nextLine();
		System.out.println("Enter the destination file path: ");
		String desFilePath = sc.nextLine();
		File srcFile = new File(srcFilePath);
		File desFile = new File(desFilePath);
		if (!srcFile.exists() || !srcFile.isFile()) {
			System.out.println("Source file does not exist or is not valid");
			sc.close();
			return;
		}
		if (desFile.exists()) {
			System.out.println("Destination file aleady exist. Overwrite? (yes/no)");
			String overwrite = sc.nextLine();
			if (!overwrite.equalsIgnoreCase("yes")) {
				System.out.println("File copy cancelled");
				sc.close();
				return;
			}
		}
		try (FileReader in = new FileReader(srcFile); FileWriter out = new FileWriter(desFile)) {
			int c;
			while ((c = in.read()) != -1) {
				out.write(c);
			}
			System.out.println("File content copied successfully");
		} catch (IOException e) {
			// TODO: handle exception
			System.err.println("Error occured while copying file content: " + e.getMessage());
		}
		sc.close();
	}
}

//Output:
//	Enter the source file path: Source.txt
//	Enter the destination file path: 
//	Destination.txt
//	Destination file aleady exist. Overwrite? (yes/no)
//	yes
//	File content copied successfully

