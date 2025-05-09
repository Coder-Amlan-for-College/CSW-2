package Project1.MavenPackage;

public class a implements Runnable{
  public void run() {
	  System.out.println("My thread is running");
  }
  public static void main(String[] args) {
	a myRunnableObj = new a();
    Thread newThread = new Thread(myRunnableObj);
    newThread.start();
    thread_simple t = new thread_simple();
    t.start();
}
}
class thread_simple extends Thread{
	public void run() {
		System.out.println("My newThread is running");
	}
}

/*OUTPUT
My thread is running
My newThread is running
*/