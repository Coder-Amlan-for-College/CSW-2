package assignment3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Q9 {
   public static int readIntegerFromUser() {
	   Scanner sc = new Scanner(System.in);
	   int num = 0;
	   boolean validInput = false;
	   while(!validInput) {
		   try {
			System.out.print("Enter an integer: ");
			num = sc.nextInt();
			validInput = true;
		} catch (InputMismatchException e) {
			// TODO: handle exception
			System.out.println("Invalid input. Please enter the"+" proper input");
			sc.next();
		}
	   }
	   return num;
   }
   public static void main(String[] args) {
	int userInput = readIntegerFromUser();
	System.out.println("You Entered: "+userInput);
}
}
