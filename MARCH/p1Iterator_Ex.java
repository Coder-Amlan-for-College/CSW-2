import java.util.*;
class Address1{
     private String street;
     private String city;
     private String state;
     private String zipCode;
     public Address1(String street,String city,String state,String zipCode){
           this.street = street;
           this.city = city;
           this.state = state;
           this.zipCode = zipCode;
     }
     public String toString(){
        return "Street: "+street+", "+"City: "+city+", "+"State: "+state+",  ZipCode: "+zipCode;
     }
}
public class p1Iterator_Ex{
      public static void main(String[] args) {
            Map<String,Address1> addressBook = new HashMap<>();
            addressBook.put("Alice",new Address1("123 Main st", "New York", "NY", "1001"));
            addressBook.put("Ben",new Address1("456 Oak st", "Los Angeles", "LA", "9001"));
            addressBook.put("Charles",new Address1("789 Maple st", "Chicago ", "IL", "60601"));
            Iterator<Map.Entry<String,Address1>> iterator = addressBook.entrySet().iterator();
            System.out.println("Address Book: ");
            while(iterator.hasNext()){
                  Map.Entry<String,Address1> entry = iterator.next();
                  System.out.println("Name: "+entry.getKey()+"\n"+entry.getValue());
            }

      }
}
