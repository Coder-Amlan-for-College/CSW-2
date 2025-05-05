package functionalProgramming;

public class Q5 {
	public static void main(String[] args) {
		Runnable run1 = new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("Thread1 running");
			}
		};
		Thread t1 = new Thread(run1);
		t1.start();
		Runnable run2 = () -> {
			System.out.println("Thread2 running");
		};
		Thread t2 = new Thread(run2);
		t2.start();
		Runnable run3 = () -> {
			System.out.print("The id of the third thread is: ");
			System.out.println(Thread.currentThread().getId());
		};
		Thread t3 = new Thread(run3);
		t3.start();
		Runnable run4 = () -> {
			System.out.print("The class of the 4th thread is: ");
			System.out.println(Thread.currentThread().getClass());
		};
		Thread t4 = new Thread(run4);
		t4.start();
	}
}

/*OUTPUT
Thread1 running
Thread2 running
The id of the third thread is: 16
The class of the 4th thread is: class java.lang.Thread
*/

