package Assignment_5;

import java.util.Scanner;

public class H8 {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the String: ");
    String str = sc.nextLine();
    while (true) {
        System.out.println("\nChoose an operation: ");
        System.out.println("1. Convert to lowercase");
        System.out.println("2. Convert to uppercase");
        System.out.println("3. Search for a character");
        System.out.println("4. Find index of a character");
        System.out.println("5. Concatenate another String");
        System.out.println("6. Exit");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Lowercase: "+str.toLowerCase());
                break;
            case 2:
                System.out.println("Uppercase: "+str.toUpperCase());
                break;
            case 3:
                 System.out.print("Enter the character to search: ");
                 char ch = sc.next().charAt(0);
                 int index = str.indexOf(ch);
                 if(index != -1){
                    System.out.println("Character '"+ch+"' found at index: "+index+" (First Occurence)");
                 }
                 else{
                    System.out.println("Character not found");
                 }
                 break;
            case 4:
                System.out.println("Enter the index[0-"+ (str.length()-1) +"] inclusive");
                try {
                    int idx = sc.nextInt();
                    System.out.println("Character at index "+idx+" is "+str.charAt(idx));
                    break;
                } catch (ArrayIndexOutOfBoundsException e) {
                    // TODO: handle exception
                    System.err.println("Index should be between [0-"+ (str.length()-1) +"] inclusive");
                }
            case 5:
                 System.out.println("Enter the string: ");
                 String newStr = sc.nextLine();
                 str =  str+newStr;
                 System.out.println("Current string after concating: "+str);
                 break;
            case 6:
                System.out.println("Exiting...");
                System.exit(0);
                break;
            default:
                System.out.println("Invalid choice");
        }

    }
   }
}


// OUTPUT:
// Enter the String: 
// Hello World

// Choose an operation:         
// 1. Convert to lowercase      
// 2. Convert to uppercase      
// 3. Search for a character    
// 4. Find index of a character 
// 5. Concatenate another String
// 6. Exit
// Enter your choice: 2
// Uppercase: HELLO WORLD

// Choose an operation:
// 1. Convert to lowercase
// 2. Convert to uppercase
// 3. Search for a character
// 4. Find index of a character
// 5. Concatenate another String
// 6. Exit
// Enter your choice: 6
// Exiting...