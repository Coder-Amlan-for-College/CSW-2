abstract class Animal1{
     void eat(){
        System.out.println("This Animal eats.");
     }
     abstract void sound();
}
class Dog1 extends Animal1{
    void sound(){
        System.out.println("Dog barks");
    }
}
interface Flyable{
    void fly();
}
class Bird implements Flyable{
    public void fly(){
        System.out.println("Bird Flies");
    }
}
class Airplane implements Flyable{
    public void fly(){
        System.out.println("Airplane Flies");
    }
}

public class P4Abstraction {
    public static void main(String[] args) {
        Dog1 d = new Dog1();
        d.eat();
        d.sound();
        Airplane a = new Airplane();
        a.fly();

    }
}
