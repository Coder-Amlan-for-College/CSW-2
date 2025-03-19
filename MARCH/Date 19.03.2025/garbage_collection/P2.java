package garbage_collection;

public class P2 {
	 private String myObject;
	 
	 public P2(String myObject) {
		 this.myObject = myObject;
	 }
	 protected void finalize() throws Throwable{
			System.out.println("Garbage Collection is successful for "+this.myObject);
	}
	 public static void main(String[] args) {
		P2 testObject1 = new P2("testObject1");
		P2 testObject2 = new P2("testObject2");
		testObject1 = null;
		System.gc();
	}
}
	 
