import java.util.*;

class Address{
    private int plotNo;
    private  String at;
    private String post;
    public Address(int plotNo, String at, String post) {
        this.plotNo = plotNo;
        this.at = at;
        this.post = post;
    }
    public String toString(){
        return "Address[Plot No: "+plotNo+" Address: "+at+" Post: "+post+"]";
    }

}
public class H7 {
    public static void main(String[] args) {
        HashMap<String,Address> treeMap = new HashMap<>();
        treeMap.put("Amlan", new Address(1, "abc", "xyz"));
        treeMap.put("Anshuman", new Address(2, "def", "xox"));
        treeMap.put("Aman", new Address(3, "ghi", "yup"));
        Iterator it = treeMap.entrySet().iterator();
        while (it.hasNext()) {
              @SuppressWarnings("unchecked")
              Map.Entry<String,Address> new_it = (Map.Entry<String,Address>) it.next();
              System.out.println(new_it.getKey()+" "+new_it.getValue().toString());
        
         }
    }
}
