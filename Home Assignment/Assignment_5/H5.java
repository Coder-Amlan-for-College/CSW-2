package Assignment_5;

import java.util.Scanner;

public class H5 {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the 1st String: ");
    String str1 = sc.next();
    System.out.print("Enter the 2nd String: ");
    String str2 = sc.next();
    //converting to upper case
    String str1Upper = str1.toUpperCase();
    String str2Upper = str2.toUpperCase();
    //Converting to Lower case
    String str1Lower = str1.toLowerCase();
    String str2Lower = str2.toLowerCase();
    
    System.out.println("String Converted to lower case \n"+str1Lower+"\n"+str2Lower);
    System.out.println("String Converted to upper case \n"+str1Upper+"\n"+str2Upper);

    if(str1Lower.equals(str2Lower)){
      System.out.println("The given two Strings are equal(case-insensitive comparison)");
    }
    else{
      System.out.println("The given two Strings are not equal(case-insensitive comparison)");
    }
    sc.close();
  }
}

// OUTPUT:
// Enter the 1st String: Hello
// Enter the 2nd String: HeLlO
// String Converted to lower case 
// hello
// hello
// String Converted to upper case
// HELLO
// HELLO