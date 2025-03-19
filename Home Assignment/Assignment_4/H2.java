package Assignment_4;

public class H2 {
  private String name;
  public H2(String name) {
	  this.name = name;
  }
  protected void finalize() {
	System.out.println("Garbage Collected: "+name);
 }
  public static void main(String[] args) {
	  H2 obj1 = new H2("Object 1");
	  H2 obj2 = new H2("Object 2");
	  obj1 = obj2;
	  obj2 = null;
	 System.gc();
}
}
