package Strings;

import java.util.GregorianCalendar;
public class Q5 {
   public static void main(String[] args) {
	System.gc();
	StringBuffer myStrBuff = new StringBuffer();
	StringBuilder myStrBuild = new StringBuilder();
	runStringBuilder(myStrBuild);
	System.gc();
	runStringBuffer(myStrBuff);
	}
   private static void runStringBuilder(StringBuilder myStr) {
    long begin = new GregorianCalendar().getTimeInMillis();
    long initiateMemory = Runtime.getRuntime().freeMemory();
    for(int j=0;j<5000000;j++) {
    	myStr.append(":"+j);
    }
    long finish = new GregorianCalendar().getTimeInMillis();
    long stopMemory = Runtime.getRuntime().freeMemory();
    System.out.println("Time taken for String Builder append Insert: "+(finish-begin));
    System.out.println("Memory used String Builder Append Insert:"+(initiateMemory-stopMemory));
   }
   private static void runStringBuffer(StringBuffer myStr) {
	    long begin = new GregorianCalendar().getTimeInMillis();
	    long initiateMemory = Runtime.getRuntime().freeMemory();
	    for(int j=0;j<5000000;j++) {
	    	myStr.append(":"+j);
	    }
	    long finish = new GregorianCalendar().getTimeInMillis();
	    long stopMemory = Runtime.getRuntime().freeMemory();
	    System.out.println("Time taken for String Buffer append Insert: "+(finish-begin));
	    System.out.println("Memory used String Buffer Append Insert:"+(initiateMemory-stopMemory));
	   }
}
