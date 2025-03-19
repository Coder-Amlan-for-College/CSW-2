package Assignment_4;

public class H3 {
	private String name;

	public H3(String name) {
		this.name = name;
	}

	public static void main(String[] args) {
		H3 ob = new H3("Object 1");
		ob = null;
		System.gc();
	}

	protected void finalize() {
		System.out.println("Garbage collected: " + name);
	}
}
