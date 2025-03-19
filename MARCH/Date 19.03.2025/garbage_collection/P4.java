package garbage_collection;

public class P4 {
	public void msg(String s) {
		System.out.println(s);
	}
   public static void main(String[] args) {
	P4 ob = new P4();
	ob.msg("Normal object");
	new P4().msg("Anonymous Object");
  }
}
