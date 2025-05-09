package Project1.MavenPackage;

class ThreadJoin extends Thread {
	public void run() {
		for (int j = 0; j < 2; j++) {
			try {
				Thread.sleep(300);
				System.out.println("The current thread name is: " + Thread.currentThread().getName());
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("The exception has been caught");
			}
			System.out.println(j);
		}
	}
}

public class Q3_thread {
	public static void main(String[] args) {
		ThreadJoin th1 = new ThreadJoin();
		ThreadJoin th2 = new ThreadJoin();
		ThreadJoin th3 = new ThreadJoin();
		th1.start();
		try {
			System.out.println("The current thread name is: " + Thread.currentThread().getName());
			th1.join();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("The exception has been caught " + e);
		}
		th2.start();
		try {
			System.out.println("The current thread name is: " + Thread.currentThread().getName());
			th2.join();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("The exception has been caught " + e);
		}
		th3.start();
	}
}

/*OUTPUT
 The current thread name is: main
The current thread name is: Thread-0
0
The current thread name is: Thread-0
1
The current thread name is: main
The current thread name is: Thread-1
0
The current thread name is: Thread-1
1
The current thread name is: Thread-2
0
The current thread name is: Thread-2
1

 */