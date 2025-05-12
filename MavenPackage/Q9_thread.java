package pack.FirstMaven;

public class Q9_thread {
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		WorkerThread1 t1 = new WorkerThread1(calculator);
		WorkerThread2 t2 = new WorkerThread2(calculator);
		t1.start();
		t2.start();
	}
}

class Calculator {
	void multiplicationTable(int n) {
		synchronized (this) {
			for (int i = 1; i <= 10; i++) {
				System.out.println(Thread.currentThread().getName() + " : " + n * i);
				try {
					Thread.sleep(400);
				} catch (Exception e) {
					// TODO: handle exception
					System.out.println(e);
				}
			}
		}
	}
}

class WorkerThread1 extends Thread {
	Calculator t;

	WorkerThread1(Calculator t) {
		this.t = t;
		this.setName("Worker Thread 1");
	}

	public void run() {
		t.multiplicationTable(3);
	}
}

class WorkerThread2 extends Thread {
	Calculator t;

	WorkerThread2(Calculator t) {
		this.t = t;
		this.setName("Worker Thread 2");
	}

	public void run() {
		t.multiplicationTable(40);
	}
}


/*OUTPUT
Worker Thread 1 : 3
Worker Thread 1 : 6
Worker Thread 1 : 9
Worker Thread 1 : 12
Worker Thread 1 : 15
Worker Thread 1 : 18
Worker Thread 1 : 21
Worker Thread 1 : 24
Worker Thread 1 : 27
Worker Thread 1 : 30
Worker Thread 2 : 40
Worker Thread 2 : 80
Worker Thread 2 : 120
Worker Thread 2 : 160
Worker Thread 2 : 200
Worker Thread 2 : 240
Worker Thread 2 : 280
Worker Thread 2 : 320
Worker Thread 2 : 360
Worker Thread 2 : 400
 */
