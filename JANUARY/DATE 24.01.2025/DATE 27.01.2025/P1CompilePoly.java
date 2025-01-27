class Calcul{
    static int multiply(int a,int b){
        return a*b;
    }
    static double multiply(double a,double b){
        return a*b;
    }
    static int multiply(int a,int b,int c){
        return a*b*c;
    }

}
public class P1CompilePoly{
    public static void main(String[] args) {
        System.out.println(Calcul.multiply(2, 4));
        System.out.println(Calcul.multiply(10, 6.3));
        System.out.println(Calcul.multiply(5, 6,2));
    }
}