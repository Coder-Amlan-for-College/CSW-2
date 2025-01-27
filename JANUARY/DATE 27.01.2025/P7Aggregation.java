public class P7Aggregation {
   int id;
   String name;
   Address address;
   public P7Aggregation(int id,String name,Address address){
    this.id = id;
    this.name = name;
    this.address = address;
   }    
   void display(){
    System.out.println(id+" "+name);
    System.out.println(address.city+" "+address.state+" "+address.country);
   }
   public static void main(String[] args) {
    Address address = new Address("ab","cd","ef");
    P7Aggregation a = new P7Aggregation(11,"Roro",address);
    a.display();
   }
}

class Address{
    String  city,state,country;
    Address(String city,String state,String country){
        this.city = city;
        this.state =  state;
        this.country = country;
    }
}
