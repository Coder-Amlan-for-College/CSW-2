package pack.FirstMaven;

class SharedResource {
	synchronized void waitMethod() {
		System.out.println(Thread.currentThread().getName() + " is going to wait");
		try {
			wait();
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName() + " is resumed!");
	}

	synchronized void notifyOneThread() {
		System.out.println("Notifying one thread...");
		notify();
	}

	synchronized void notifyAllThreads() {
		System.out.println("Notifying all threads...");
		notifyAll();
	}

}

public class Q7_thread {
	public static void main(String[] args) throws InterruptedException {
		SharedResource shared = new SharedResource();
		Thread t1 = new Thread(shared::waitMethod, "Thread-1");
		Thread t2 = new Thread(shared::waitMethod, "Thread-2");
		t1.start();
		t2.start();
		Thread.sleep(1000);
		// shared.notifyOneThread();
		shared.notifyAllThreads();
	}
}

/*OUTPUT
Thread-1 is going to wait
Thread-2 is going to wait
Notifying all threads...
Thread-1 is resumed!
Thread-2 is resumed!
 */
