package p1;
public class p3Throw1 {

	public static void check(int a) {
		if(a<10) {
			throw new ArithmeticException("Some problem");
		}
		else {
			System.out.println("Everything is working");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        check(5);
        System.out.println("End");
        
	}

}
