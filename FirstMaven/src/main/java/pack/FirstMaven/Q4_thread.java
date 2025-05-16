package pack.FirstMaven;

public class Q4_thread extends Thread {
	public void run() {
		System.out.println("Inside the run method");
	}

	public static void main(String[] args) {
		Thread.currentThread().setPriority(7);
		System.out.println("Priority of the main thread is: " + Thread.currentThread().getPriority());
		Q4_thread th1 = new Q4_thread();
		System.out.println("Priority of the thread th1 is: " + th1.getPriority());
	}
}

/*OUTPUT
Priority of the main thread is: 7
Priority of the thread th1 is: 7
*/
