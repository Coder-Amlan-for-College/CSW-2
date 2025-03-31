package Assignment_5;
import java.util.*;
public class H7 {
	public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
		 System.out.print("Enter the sentence: ");
		 String sentence = sc.nextLine();
		 System.out.print("Enter the word to search: ");
		 String searchWord = sc.next().trim();
		 System.out.print("Enter the word to replace with: ");
		 String replaceWord = sc.next().trim();
		 if(sentence.toLowerCase().contains(searchWord.toLowerCase())){
		     System.out.println("Original sentence: "+sentence);
			 sentence = sentence.replaceAll("(?i)"+searchWord, replaceWord);
			 System.out.println("Modified sentence: "+sentence);}
		 else{
			System.out.println("The word '"+searchWord+ "' does not exist in the sentence.");
		 }
      sc.close();		     
	}
}

// OUTPUT
// Enter the sentence: Hello everyone
// Enter the word to search: Everyone
// Enter the word to replace with: World
// Original sentence: Hello everyone
// Modified sentence: Hello World   