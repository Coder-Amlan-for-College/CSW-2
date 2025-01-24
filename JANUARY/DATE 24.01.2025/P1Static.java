public class P1Static{
    static{
        System.out.println("Static");
    }
    static int square(int s){
        return s*s;
    }
    public static void main(String[] args) {
        int re = square(5);
        System.out.println(re);
    }
}