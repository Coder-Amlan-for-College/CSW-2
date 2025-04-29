package Assignment_5;
import java.util.Scanner;
public class H7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sentence: ");
        String sentence = sc.nextLine().trim();
        System.out.println("Enter the word to search: ");
        String searchWord = sc.next().trim();
        System.out.println("Enter the replacement word: ");
        sc.nextLine();
        String replaceWord = sc.next().trim();
        String modified = "";
        int index = sentence.toLowerCase().indexOf(searchWord.toLowerCase());
        if(index != -1){
            String s1 = sentence.substring(0,index);
            String s2 = sentence.substring(index+searchWord.length());
            modified = s1.concat(replaceWord).concat(s2);
        }
        else {
            System.out.println("Word not found. No modification Exiting!");
            System.exit(0);
        }
        System.out.println("Original: "+sentence);
        System.out.println("Modified: "+modified);
    }
}
