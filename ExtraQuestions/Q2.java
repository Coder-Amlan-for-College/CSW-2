package ExtraQuestions;
import java.util.Arrays;
import java.util.Scanner;

public class Q2 {
    public static<T> void swapTwoIndices(T[]arr, int ind1, int ind2){
    	T temp = arr[ind1];
    	arr[ind1] = arr[ind2];
    	arr[ind2] = temp;
    }
	 
	public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
	  System.out.print("Enter the size of the array: ");
	  Object[]arr = new Object[sc.nextInt()];
	  System.out.println("Enter "+arr.length+" values: ");
	  for(int i=0; i<arr.length;i++) {
		  arr[i] = sc.next();
	  }
	  System.out.print("Enter 1st index: ");
	  int ind1 = sc.nextInt();
	  System.out.println("Enter 2nd index: ");
	  int ind2 = sc.nextInt();
	  System.out.println("Before Swap, Array: "+Arrays.toString(arr));
	  swapTwoIndices(arr, ind1, ind2);
	  System.out.println("After Swap, Array: "+Arrays.toString(arr));
  }
}
