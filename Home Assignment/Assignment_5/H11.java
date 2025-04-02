package Assignment_5;

import java.util.*;
import java.io.*;
import java.text.SimpleDateFormat;

public class Q11 {
	private static String getCurrentDate() {
		Date date = new Date();
		return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(date);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your diary entry:");
		String entry = sc.nextLine();
		File file = new File("C:\\Users\\E 555\\Desktop\\diary2.txt");
		try {
			if(file.exists()) {
				System.out.println("The file 'diary2.txt' already exists will not be overwritten. Do you want to append to it ?(Y/N)");
				String response = sc.nextLine().trim().toUpperCase();
				if(response.equals("Y") || response.equals("YES")) {
					FileWriter writer = new FileWriter(file,true);
					writer.write(getCurrentDate()+"\n"+entry+"\n");
					writer.close();
					System.out.println("Diary entry added successfully");
					
				}
				else {
					System.out.println("Failed to create file "+file);
					return;
				}
				
			}
		}
		catch(IOException e1) {
			System.out.println("An error occured while writing to the file "+ e1.getMessage());
		}
		finally {
			sc.close();
			
		}

	}

}
//output
//Enter your diary entry:
//Hello diary
//The file 'diary2.txt' already exists will not be overwritten. Do you want to append to it ?(Y/N)
//Y
//Diary entry added successfully

