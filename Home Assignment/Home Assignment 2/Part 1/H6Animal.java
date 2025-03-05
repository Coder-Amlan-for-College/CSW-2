import java.util.Objects;

public class H6Animal {
    private String name;
    private String color;
    private String type;
    public H6Animal(String name, String color, String type) {
        this.name = name;
        this.color = color;
        this.type = type;
    }
    public String getName() {
        return name;
    }
    public String getColor() {
        return color;
    }
    public String getType() {
        return type;
    }
    public boolean equals(Object ob){
        if (this == ob) return true;
        if(ob==null || getClass() != ob.getClass()) return false;

        H6Animal animal = (H6Animal) ob;
        return Objects.equals(name, animal.name) && Objects.equals(color, animal.color) && Objects.equals(type, animal.type);
    }
    public int hashCode(){
        int hash = 7;
        hash = 31*hash+Objects.hashCode(name);
        hash = 31*hash+Objects.hashCode(color);
        hash = 31*hash+Objects.hashCode(type);
        return hash;
    }
    public String toString(){
        return name+" "+color+" "+type;
    }
    public static void main(String[] args) {
        H6Animal dog1 = new H6Animal("Bingo", "Brown", "Pet");
        H6Animal dog2 = new H6Animal("Bingo", "Brown", "Pet");
        System.out.println("Details: "+dog1);
        System.out.println("Hash Code: "+dog1.hashCode());
        System.out.println("Details: "+dog2);
        System.out.println("Hash Code: "+dog2.hashCode());
        if(dog1.hashCode()==dog2.hashCode()){
            System.out.println("Objetcs with the  same hash code may or may not be equal ");
            System.out.println("Checking if dog1 and dog2 are equal: "+dog1.equals(dog2));
        }
        else{
            System.out.println("Objects with different hash code are not equal");
        }    
    }
    

}
