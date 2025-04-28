package Assignment_5;
import java.util.Scanner;
public class H7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sentence: ");
        String sentence = sc.nextLine().trim();
        sentence = sentence.concat(" ");
        System.out.println("Enter the word to search: ");
        String searchWord = sc.next().trim();
        System.out.println("Enter the replacement word: ");
        sc.nextLine();
        String replaceWord = sc.next().trim();
        String word="";int startIndex = 0; String modified = "";
        for(int i=0;i<sentence.length();i++){
            char ch = sentence.charAt(i);
            if(Character.isWhitespace(ch)){
                int lastIndex = i;
                word = word.trim();
                if(word.equalsIgnoreCase(searchWord)){
                    String sub1 = sentence.substring(0,startIndex);
                    String sub2 = sentence.substring(lastIndex);
                     modified = sub1.concat(replaceWord).concat(sub2);
                    break;
                }
                word = "";
                startIndex = i+1;
            }
            word = word+ch;
        }
        System.out.println("Original: "+sentence);
        if(modified.isEmpty()){
            System.out.println("Search word doesnot exist no modification!");
        }
        else {
            System.out.println("Modified: " + modified.trim());
        }
    }
}
