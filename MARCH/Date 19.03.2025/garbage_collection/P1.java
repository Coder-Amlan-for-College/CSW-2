package garbage_collection;

public class P1 {
 private String myObject;
 
 public P1(String myObject) {
	 this.myObject = myObject;
 }
 
 private static void testMethod1() {
	P1 myObjectTest1 = new P1("myObjectTest1");
	testMethod2();
}
 private static void testMethod2() {
		P1 myObjectTest2 = new P1("myObjectTest2");
	}
 protected void finalize() throws Throwable{
	System.out.println("Garbage Collection is successful for "+this.myObject);
}
 public static void main(String[] args) {
	testMethod1();
	System.gc();
}
}
