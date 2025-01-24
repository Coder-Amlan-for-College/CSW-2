class Animal2{
    void makeSound(){
        System.out.println("Animal makes sound");
    }
}
class Dog2 extends Animal2{
    void makeSound(){
        System.out.println("Dog barks");
    }
}
public class P5Inheritance {
    public static void main(String[] args) {
        Animal2 obj = new Animal2();
        obj.makeSound();
        obj = new Dog2();
        obj.makeSound();
        Dog2 objDog = new Dog2();
        objDog.makeSound(); 
    }
}
