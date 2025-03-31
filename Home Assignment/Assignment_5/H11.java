package Assignment_5;

import java.io.File;
import java.util.Scanner;

public class H11 {
    public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter your diary entry: ");
	 String entry = sc.nextLine();
	 File file = new File("diary1.txt");
	 try {
		 if(file.exists()) {
			 System.out.println("The file 'diary.txt' already exists. Existing content"+"will not be overwritten. Do you want to append to it? (Y/N)");
			 String response = sc.nextLine().trim().toUpperCase();
			 if(response.equals("Y") || response.equals("Yes")){

			 }
			 
		 }
	 }
	 catch(Exception e)
	 {}
	}
}
