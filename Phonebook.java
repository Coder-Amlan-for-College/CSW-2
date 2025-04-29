import java.util.*;
class Details<T,V>{
    private T name;
    private V phnNo;
    Details(T name,V phnNo){
        this.name = name;
        this.phnNo = phnNo;
    }
    public T getName(){
        return name;
    }
    public boolean equals(Object ob){
        if(this==ob) return true;
        if(ob==null||getClass()!=ob.getClass()) return false;
        Details details = (Details) ob;
        return String.valueOf(name).equalsIgnoreCase(String.valueOf(details.name));
    }

    @Override
    public String toString() {
        return "Details{" +
                "name=" + name +
                ", phnNo=" + phnNo +
                '}';
    }
}
public class Phonebook{
    public static void searchPhonebook(TreeMap<Integer,Details> phonebook, Details name){
        boolean valueFound = false;
        for(Map.Entry<Integer,Details> e : phonebook.entrySet()){
            if(e.getValue().equals(name)){
                System.out.println(e.getValue());
                valueFound = true;
            }
        }
        if(!valueFound){
            System.out.println("No such name exists");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeMap<Integer,Details> phonebook = new TreeMap<>();
        phonebook.put(1,new Details<String,Long>("Amlan",123456L));
        phonebook.put(2,new Details<String,Long>("Amlan",123457L));
        phonebook.put(3,new Details<String,Long>("Ansh",696969L));
        phonebook.put(4,new Details<String,Long>("Hemanth",999L));
        phonebook.put(5,new Details<String,Long>("Abhipsa",27082005L));
        phonebook.put(6,new Details<String,Long>("Debasmita",25052004L));
        System.out.println("Enter the name to search: ");
        Object name = sc.nextLine();
        Details<Object,Long> search = new Details<>(name,0L);
        searchPhonebook(phonebook,search);
    }
}