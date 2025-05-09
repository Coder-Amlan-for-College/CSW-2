package Project1.MavenPackage;

public class Q2_thread extends Thread {
	public void run() {
		for (int i = 1; i < 5; i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO: handle exception
				System.out.println(e);
			}
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		Q2_thread t1 = new Q2_thread();
		Q2_thread t2 = new Q2_thread();
		t1.start();
		t2.start();
	}
}

/* OUTPUT
1
1
2
2
3
3
4
4
*/