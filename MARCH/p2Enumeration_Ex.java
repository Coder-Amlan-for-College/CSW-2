import java.util.*;
class Address2{
    private String street;
    private String city;
    private String state;
    private String zipCode;
    public Address2(String street,String city,String state,String zipCode){
          this.street = street;
          this.city = city;
          this.state = state;
          this.zipCode = zipCode;
    }
    public String toString(){
       return "Street: "+street+", "+"City: "+city+", "+"State: "+state+",  ZipCode: "+zipCode;
    }
}
public class p2Enumeration_Ex {
     public static void main(String[] args) {
            Hashtable<String,Address2> addressBook = new Hashtable<>();
            addressBook.put("Alice",new Address2("123 Main st", "New York", "NY", "1001"));
            addressBook.put("Ben",new Address2("456 Oak st", "Los Angeles", "LA", "9001"));
            addressBook.put("Charles",new Address2("789 Maple st", "Chicago ", "IL", "60601"));
            Enumeration<String> keys = addressBook.keys();
            System.out.println("Address Book using Enumeration: ");
            while (keys.hasMoreElements()) {
                String name = keys.nextElement();
                System.out.println("Name: "+name+"\n"+"Address: "+addressBook.get(name)+"\n");
            }
     }
}
