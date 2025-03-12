package Assignment3;

import java.util.*;
public class H3 {
    public static void input() {
    	Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number as String: ");
        String str = sc.next();
        convertStringToNumber(str);
    }
	public static void convertStringToNumber(String inp) {
    	int x=0;
    	try {
    	   x = Integer.valueOf(inp);
    	   System.out.print("Number: "+x);
    	   System.exit(0);
    	}
    	catch(NumberFormatException e) {
    		System.out.println("String should be a Number only!");
    		input();
    	}
       
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        input();
	}

}
