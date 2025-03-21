package Assignment_4;

import java.util.ArrayList;

public class H6 {

	public static void main(String[] args) {
  	long startTime = System.currentTimeMillis();
  	ArrayList<Object> objects = new ArrayList<Object>();
  	try {
		while(true) {
			objects.add(new Object());
			if(System.currentTimeMillis() - startTime > 5000) {
				printMemoryUsage(startTime);
				startTime = System.currentTimeMillis();
			}
		}
	} catch (OutOfMemoryError e) {
		// TODO: handle exception
		System.out.println("Out of memory");
		printMemoryUsage(startTime);
	}
}
	 private static void printMemoryUsage(long startTime) {
		 long totalMemory = Runtime.getRuntime().totalMemory();
		 long freeMemory = Runtime.getRuntime().freeMemory();
		 long usedMemory = totalMemory-freeMemory;
		 System.out.println("Timestamp: "+(System.currentTimeMillis()-startTime)+" ms");
		 System.out.println("Total Memory: "+totalMemory+" bytes");
		 System.out.println("Free Memory: "+freeMemory+" bytes");
		 System.out.println("Used Memory: "+usedMemory+" bytes");
	 }
}
