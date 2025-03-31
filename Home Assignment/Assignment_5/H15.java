package Assignment_5;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class H15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            // Prompt for current file name
            System.out.print("Enter the current file name: ");
            String currentFileName = sc.nextLine().trim();
            File oldFile = new File(currentFileName);

            // Check if the old file exists
            if (!oldFile.exists()) {
                throw new FileNotFoundException("Error: The file: " + currentFileName + " does not exist.");
            }

            // Prompt for the new file name
            System.out.print("Enter the new file name: ");
            String newFileName = sc.nextLine().trim();
            File newFile = new File(newFileName);

            // Check if the new file already exists
            if (newFile.exists()) {
                throw new IOException("Error: A file with the name " + newFileName + " already exists.");
            }

            // Attempt to rename the file
            if (oldFile.renameTo(newFile)) {
                System.out.println("File renamed from " + currentFileName + " to " + newFileName + ".");
            } else {
                throw new IOException("Error: Unable to rename the file.");
            }

        } catch (FileNotFoundException e) {
            // Handle file not found exception
            System.err.println(e.getMessage());
        } catch (IOException e) {
            // Handle IO exceptions
            System.err.println(e.getMessage());
        } catch (Exception e) {
            // Handle any unexpected exceptions
            System.err.println("An unexpected error occurred: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}

//OUTPUT:
//	Enter the current file name: Source.txt
//	Enter the new file name: Rename.txt
//	File renamed from Source.txt to Rename.txt.
