package Assignment_4;

public class H1 {
  private String myObject;
  public H1(String myObject) {
	  this.myObject = myObject;
  }
  void show() {
	  H1 objH1 = new H1("Inner Object");
	  objH1.display();
  }
  void display() {
	  H1 obj = new H1("Inner Display Object");
  }
  protected void finalize() throws Throwable{
	System.out.println("Garbage collected: "+myObject);
}
  public static void main(String[] args) {
	H1 ob = new H1("Main Object");
	ob.show();
	System.gc();
}
}
