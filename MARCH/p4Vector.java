import java.util.Enumeration;
import java.util.Vector;
import java.util.Arrays;

public class p4Vector {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();
        vector.add("Alice");
        vector.add("Bob");
        vector.add("Charlie");
        vector.add("David");
        System.out.println("Initial Vector: " + vector);
        System.out.println();
        vector.add(2,"Eve");
        System.out.println("After inserting vector at index 2: " + vector);
        System.out.println("Element at index 3: "+vector.get(3));
        System.out.println();
        vector.set(1, "Brian");
        System.out.println("After updating index 1 with Brian: " + vector);
        vector.remove(3);
        System.out.println("After removing Charlie: " + vector);
        System.out.println("Contains 'Charlie'? "+vector.contains("Charlie"));
        System.out.println("Vector Size: "+vector.size());
        System.out.println("Is Vector Empty: "+vector.isEmpty());
        System.out.println();
        String[]arr = vector.toArray(new String[0]);
        System.out.println("Vector to Array: "+Arrays.toString(arr));
        System.out.println();
        Enumeration<String> enumeration = vector.elements();
        System.out.println("Iteration through vector using Enumeration");
        while(enumeration.hasMoreElements()){
            System.out.println(enumeration.nextElement());
        }                                                                                                                                    
        
    }
}
