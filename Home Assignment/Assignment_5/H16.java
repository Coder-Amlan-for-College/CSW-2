package Assignment_5;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class H16 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the file name: ");
		String fileName = sc.nextLine();
		File file = new File(fileName);
		try {
			if (!file.exists()) {
				throw new FileNotFoundException("File not found: " + fileName);
			}
			System.out.println("File metadata:");
			System.out.println("Name: " + file.getName());
			System.out.println("Path: " + file.getPath());
			System.out.println("Absolute path: " + file.getAbsolutePath());
			System.out.println("Parent: " + file.getParent());
			System.out.println("Exists: " + file.exists());
			System.out.println("Is File: " + file.isFile());
			System.out.println("Is Directory: " + file.isDirectory());
			System.out.println("Hidden: " + file.isHidden());
			System.out.println("Length: " + file.length() + " bytes");
			SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
			Date lastModifiedDate = new Date(file.lastModified());
			System.out.println("Last Modified: " + dateFormat.format(lastModifiedDate));
			System.out.println("Readable: " + Files.isReadable(Paths.get(file.getPath())));
			System.out.println("Writable: " + Files.isWritable(Paths.get(file.getPath())));
			System.out.println("Executable: " + Files.isExecutable(Paths.get(file.getPath())));
		} catch (FileNotFoundException e) {
			// TODO: handle exception
			System.err.println(e);
		} catch (Exception e) {
			// TODO: handle exception
			System.err.println("An unexpected error occurred:" + e.getMessage());
		}
		finally {
			sc.close();
		}
	}
}

//OUTPUT:
//	Enter the file name: Source.txt
//	File metadata:
//	Name: Source.txt
//	Path: Source.txt
//	Absolute path: F:\2341014053\Assignment 4\Assgn4\Source.txt
//	Parent: null
//	Exists: true
//	Is File: true
//	Is Directory: false
//	Hidden: false
//	Length: 15 bytes
//	Last Modified: 31/03/2025 10:54:32
//	Readable: true
//	Writable: true
//	Executable: true