package AgeApp;

import java.util.Scanner;



public class Age {
    int age;
	public void input() {
    	Scanner sc = new Scanner(System.in);
    	age = sc.nextInt();
    }
	public void verifyAge() throws Exception{
		if(age<18) {
			UnderAgeException  u = new OverAgeException();
			System.out.println(u.msg());
		}
		else if (age>65) {
			OverAgeException overAgeException = new OverAgeException();
		    System.out.println(overAgeException.msg());
		}
		else {
			System.out.println("You are eligible");
		}		
	}
}
