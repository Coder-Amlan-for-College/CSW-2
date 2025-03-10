package AgeApp;

import customer.ATM;

public class MainApp {
	  public void initiate(){
	       Age ag = new Age();
	       try {
	    	   ag.input();
	    	   ag.verifyAge();
	       }
	       catch (Exception a) {
			// TODO: handle exception
	    	   try {
	    		   ag.input();
	    		   ag.verifyAge();
	    	   }
	    	   catch (Exception b) {
				// TODO: handle exception
	    		   try {
	    			   ag.input();
	    			   ag.verifyAge();
	    		   }
	    		   catch (Exception c) {
					// TODO: handle exception
	    			   System.out.println("Site Blocked");
	        		   System.exit(0);
				}
			}
		}
    }
	  public static void main(String[] args) {
		
	}
}
