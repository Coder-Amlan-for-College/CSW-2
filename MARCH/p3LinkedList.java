import java.util.*;

public class p3LinkedList {
  public static void main(String[] args) {
    LinkedList<String> list = new LinkedList<>();
    list.add("Alice");
    list.add("Bob");
    list.add("Charlie");
    list.add("David");
    System.out.println("Initial LinkedList "+ list);
    System.out.println("----------------------");
    list.addFirst("Zara");
    list.addLast("Edward");
    System.out.println("After addFirst and addLast: "+list);
    System.out.println("--------------------------------");
    System.out.println("First Element: "+list.getFirst());
    System.out.println("Last Element: "+list.getLast());
    System.out.println("--------------------------------");
    list.remove("Charlie");
    System.out.println("After removing Charlie: "+list);
    System.out.println("--------------------------------");
    list.removeFirst();
    list.removeLast();
    System.out.println("After removeFirst and removeLast: "+list);
    System.out.println("Contains Alice: "+list.contains("Alice"));
    System.out.println("Size of Linked List: "+list.size());
    System.out.println("List is empty: "+list.isEmpty());
    System.out.println("--------------------------------");
    Object[]arr = list.toArray();
    System.out.println("Array Representation: "+Arrays.toString(arr));
    Iterator<String> iterator = list.iterator();
    System.out.println("Iterating through LinkedList: ");
    while(iterator.hasNext()){
        System.out.println(iterator.next());
    }
  }    
}
