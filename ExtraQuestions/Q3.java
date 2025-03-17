package ExtraQuestions;

public class Q3 {
   public static<T> void printArr(T[]arr) {
	   for(T element: arr) {
		   System.out.print(element+" ");
	   }
   }
   public static void main(String[] args) {
   Object[]arr = {"Amlan",1,2,3,5.0,'a'};
   System.out.println("Array: ");
   printArr(arr);
 }
}
