package Assignment_5;

public class H2 {
     public static void main(String[] args) {
    	 String original = "Hello";
         String modified = original.concat(" World");
         System.out.println("Original String: "+original);
         System.out.println("Memory Address oF original: "+System.identityHashCode(original));
         System.out.println("Modified String: "+modified);
         System.out.println("Memory Address of modified: "+System.identityHashCode(modified));
         original = "Laugh";
         System.out.println("Original String after reassign: "+original);
         System.out.println("Memory after original reassigned: "+System.identityHashCode(original));
         CharSequence charSequence = "Java is magic!";
         System.out.println("Length of charSequence: "+charSequence.length());
         System.out.println("Character at index 4: "+charSequence.charAt(3));
         System.out.println("Subsequence from index 5 to 10: "+charSequence.subSequence(5, 10));
	}
     
}

//OUTPUT:
//Original String: Hello
//Memory Address oF original: 317983781
//Modified String: Hello World
//Memory Address of modified: 1058025095
//Original String after reassign: Laugh
//Memory after original reassigned: 665576141
//Length of charSequence: 14
//Character at index 4: a
//Subsequence from index 5 to 10: is ma
