package Strings;

import java.util.*;

public class Q2 {
   public static void main(String[]args) {
	   String str = "apple,,banana,,grape,,";
	   String[] posLimit = str.split(",",3);
	   String[] zeroLimit = str.split(",",0);
	   String[] negLimit = str.split(",",-1);
	   for(String s : posLimit) {
		   System.out.println(s.isEmpty() ? "(empty)" :  s);
		   System.out.println("Positive limit (3): "+Arrays.toString(posLimit));
	   }
	   for(String s : zeroLimit) {
		   System.out.println(s.isEmpty() ? "(empty)" :  s);
		   System.out.println("Zero limit (0): "+Arrays.toString(zeroLimit));
	   }
	   for(String s : posLimit) {
		   System.out.println(s.isEmpty() ? "(empty)" :  s);
		   System.out.println("Negative limit (-1): "+Arrays.toString(negLimit));
	   }
   }   
}
