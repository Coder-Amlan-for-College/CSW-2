class Animal{
     public void displayInfo(){
        System.out.println("I am an Animal");
     }
}
class Dog extends Animal{
    public void displayInfo(){
        System.out.println("I am a Dog");
    }
}
public class P2RunPoly {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.displayInfo();
    }
}
