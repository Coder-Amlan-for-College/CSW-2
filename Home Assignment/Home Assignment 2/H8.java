import java.util.HashMap;
import java.util.Scanner;

public class H8{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the  1st String: ");
        String str1 = sc.nextLine().toLowerCase();
        System.out.println("Enter the  2nd String: ");
        String str2 = sc.nextLine().toLowerCase();
        if(areAnagrams(str1,str2)){
            System.out.println(str1 + " and " + str2 + " are anagrams");
        }
        else{
            System.out.println(str1 + " and " + str2 + " are not anagrams");
        }
    }
    public static boolean areAnagrams(String str1, String str2) {
        if(str1.length()!=str2.length())
               return false;    
       HashMap<Character,Integer> charCountMap = new HashMap<>();
       for (char c : str1.toCharArray()) {
        charCountMap.put(c, charCountMap.get(c) + 1);
       }
       for(char c: str2.toCharArray()){
         if(charCountMap.containsKey(c)){
              charCountMap.put(c, charCountMap.get(c)+1);
              if(charCountMap.get(c)==0){
                charCountMap.remove(c);
              }
         }
         else{
            return false;
         }
       }
       return charCountMap.isEmpty();
    }
}