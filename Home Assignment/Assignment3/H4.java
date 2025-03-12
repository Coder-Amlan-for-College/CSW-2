package Assignment3;

import java.util.Scanner;

public class H4 {
   public static void main(String[]args) {
	   Scanner sc = new Scanner(System.in);
	   int num = sc.nextInt();
	   try {
		   double sqRoot = calculate(num);
		   System.out.println("The Square root of: "+num+" is "+sqRoot);
	   }
	   catch(ArithmeticException e) {
		   System.out.println(e.getMessage());
	   }
   }
   public static double calculate(int num) throws ArithmeticException{
	   if(num<0) {
		   throw new ArithmeticException("Negative number not allowed");
	   }
	   double sq = Math.sqrt(num);
	   if(sq!=(int)sq) {
		   throw new ArithmeticException("Not a perfect square value");
	   }
	   return sq;
   } 
}
