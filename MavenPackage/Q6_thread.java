package pack.FirstMaven;

public class Q6_thread {
	public static void main(String[] args) {
		final String firstResource = "First Resource";
		final String secondResource = "Second Resource";
		Thread thread1 = new Thread("First Thread") {
			public void run() {
				synchronized (firstResource) {
					System.out.println(this.getName() + " : First Resource is Locked");
				}
				try {
					Thread.sleep(100);
				} catch (Exception e) {
					// TODO: handle exception
					synchronized (secondResource) {
						System.out.println("Second resource is Locked");
					}
				}
			}
		};
		Thread thread2 = new Thread("Second Thread") {
			public void run() {
				synchronized (secondResource) {
					System.out.println(this.getName() + " : Second resource is Locked");
				}
				try {
					Thread.sleep(100);
				} catch (Exception e) {
					// TODO: handle exception
					synchronized (firstResource) {
						System.out.println("First resource is Locked");
					}
				}
			}
		};
		thread1.start();
		thread2.start();
	}
}


/*OUTPUT
First Thread : First Resource is Locked
Second Thread : Second resource is Locked
*/

//Here also the output will be in random sequence 