package p1;

import java.util.*;
public class q1ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         System.out.println("Connection");
         Scanner sc = new Scanner(System.in);
         try {
        	 System.out.println("Enter a numerator");
        	 int num = sc.nextInt();
        	 System.out.println("Enter a denominator");
        	 int den = sc.nextInt();
        	 int quotient = num/den;
        	 
        	 System.out.println("Enter the size o array");
        	 int size = sc.nextInt();
        	 int[]arr = new int[size];
        	 System.out.println("Enter the element to be stored");
        	 int el = sc.nextInt();
        	 System.out.println("Enter the position/index the element is to be stored");
        	 int pos = sc.nextInt();
        	 arr[pos] = el;
        	 System.out.println("Element entered: "+arr[pos]);
         }
         catch (ArithmeticException e) {
			// TODO: handle exception
        	 System.out.println("Enter a non-zero denominator");
		}
         catch (NegativeArraySizeException e) {
			// TODO: handle exception
        	 System.out.println("Enter a positive array size");
		}
         catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
        	 System.out.println("Enter the index value within the range");
		}
         catch (Exception e) {
			// TODO: handle exception
        	 System.out.println("Some problem occured");
		}
         finally {
			System.out.println("Final Block");
		}
         System.out.println("Connection Terminated");
         
	}

}
