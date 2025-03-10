package p1;

import java.io.FileReader;
import java.io.IOException;

class Parent{
	void msg()throws Exception{
		System.out.println("Parent Method");
	} 
}
public class P7Overriding extends Parent{
	void msg() throws IOException{
   	    System.out.println("TextExceptionChild");
   	    FileReader f = new FileReader("amlan.txt");
    }
//	void msg() throws ArithmeticException{ checked
//		System.out.println("child method");
//	} 
	public static void main(String[] args) {
      Parent p = new P7Overriding();
      try {
    	  p.msg();
      }
      catch (Exception e) {
		// TODO: handle exception
    	  System.out.println("File not found "+e);
	}
}
}
