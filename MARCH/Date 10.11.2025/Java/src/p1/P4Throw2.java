package p1;

public class P4Throw2 { 
    public void test(int n1,int n2) {
    	try {
		  System.out.println(n1/n2);
		} 
    	catch (ArithmeticException e) {
			// TODO: handle exception
    		System.out.println("Exception Handled in test");
    		throw e;
    		
		}
    	finally {
			System.out.println("Connection Terminated");
		}
    } 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.out.println("Connected");
       P4Throw2 main = new P4Throw2();
       try {
    	   main.test(30, 0);
       }
       catch (Exception e) {
		// TODO: handle exception
    	  System.out.println("Exceptio handled in main");
    	  e.printStackTrace();
    	  System.out.println("Connection terminated");
	}
       System.out.println("Hello");
	}

}
