final class Animal{
    final int leg = 4;
    final void sound(){
        System.out.println("Animal make sound");
    }
}
public class P2Final {
    public static void main(String[] args) {
        Animal a = new Animal();
        System.out.println("Animal legs: "+a.leg);
        // a.leg=5; cannot change the value of variables having declared final
    }
}
