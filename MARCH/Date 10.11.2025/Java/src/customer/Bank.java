package customer;
public class Bank {
   public void initiate(){
       ATM atm = new ATM();
       try {
    	   atm.input();
    	   atm.verify();
       }
       catch (Exception a) {
		// TODO: handle exception
    	   try {
    		   atm.input();
    		   atm.verify();
    	   }
    	   catch (Exception b) {
			// TODO: handle exception
    		   try {
    			   atm.input();
    			   atm.verify();
    		   }
    		   catch (Exception c) {
				// TODO: handle exception
    			   System.out.println("Card Blocked");
        		   System.exit(0);
			}
		}
	}
   }
}
