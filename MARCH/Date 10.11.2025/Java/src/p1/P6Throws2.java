package p1;
public class P6Throws2 {
   public static void main(String[] args) {
	 try {
	   method1();
	} catch (Exception e) {
		// TODO: handle exception
		System.out.println("Outside "+e);
	}
   }
   static void method1()throws IllegalAccessException{
	   System.out.println("Inside");
	   throw new IllegalAccessException("Error");
   }
}
