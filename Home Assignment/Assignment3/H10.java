package assignment3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
//import java.util.Scanner;

public class H10 {
  public static void main(String[] args) throws Exception {
	if(args.length != 1) {
		System.out.println("Please provide a valid file path");
		return;
	}
	String filePath = args[0];
//	Scanner sc = new Scanner(System.in);
//	System.out.print("Enter the file path: ");
//	String filePath = sc.nextLine();
	File file = new File(filePath);
	if(!(file.exists())) {
		throw new CustomFileNotFoundException1("File Not Found Nia "+filePath);
	}
	try {
		FileReader reader = new FileReader(filePath);
		System.out.println("Contents");
		int charValue;
		while((charValue = reader.read()) != -1) {
			System.out.print((char) charValue);
		}
		reader.close();
	}
	catch (IOException e) {
		// TODO: handle exception
	  throw new CustomFileReadPermissionException("Error reading the file: "+e.getMessage());
	}
}
}
class CustomFileNotFoundException1 extends FileNotFoundException{
	public CustomFileNotFoundException1(String message) {
		super(message);
	}
}
class CustomFileReadPermissionException extends IOException{
	public CustomFileReadPermissionException(String message) {
		super(message);
	}
}
