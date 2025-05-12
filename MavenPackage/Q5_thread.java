package pack.FirstMaven;

public class Q5_thread implements Runnable {
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}

	public static void main(String[] args) {
		Q5_thread runnable = new Q5_thread();
		ThreadGroup myThreadGroup = new ThreadGroup("Threads");
		Thread t1 = new Thread(myThreadGroup, runnable, "My First Thread");
		t1.start();
		Thread t2 = new Thread(myThreadGroup, runnable, "My Second Thread");
		t2.start();
		Thread t3 = new Thread(myThreadGroup, runnable, "My Third Thread");
		t3.start();
		System.out.println("Group: " + myThreadGroup.getName());
		myThreadGroup.list();
	}
}

/*OUTPUT
My First Thread
My Third Thread
My Second Thread
Group: Threads
java.lang.ThreadGroup[name=Threads,maxpri=10]
 */

//Outputs are generated randomly, no fixed sequence because of scheduler