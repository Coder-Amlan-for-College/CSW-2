package Assignment_4;

public class H4_AnonymousObject {
	private String name;

	public H4_AnonymousObject(String name) {
		this.name = name;
	}

	protected void finalize() throws Throwable {
		System.out.println("Garbage Collected: " + name);
	}

	public static void main(String[] args) {
		new H4_AnonymousObject("Anonymous Object");
		System.gc();
	}
}
