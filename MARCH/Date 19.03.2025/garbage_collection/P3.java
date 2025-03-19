package garbage_collection;

public class P3 {
  String myObject;
  public P3(String myObject) {
	  this.myObject = myObject;
  }
  public static void main(String[] args) {
	new P3("testObject_anonymous");
	System.gc();
	
  }
  protected void finalize() throws Throwable {
	System.out.println("Garbage collection is successful for "+this.myObject);
 }
}
