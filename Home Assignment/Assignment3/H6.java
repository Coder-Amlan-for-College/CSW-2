package Assignment3;
import java.util.*;
public class H6 {
 
	public static void bubbleSort(int[]arr){
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-1-i;j++) {
				if(arr[j]>arr[j+1]) {
				  int temp = arr[j];
				  arr[j] = arr[j+1];
				  arr[j+1] = temp;
				}
			}
		}
	}
	public static boolean search(int[]arr,int key) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==key) {
				return true;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc = new Scanner(System.in);
	   int[]arr = {3,8,2,4,1,6};
	   System.out.println("Array: "+Arrays.toString(arr));
       bubbleSort(arr);
       System.out.println("Sorted Array: "+Arrays.toString(arr));
       System.out.print("Enter the element to be searched: ");
       int el = sc.nextInt();
       if(search(arr,el))
    	   System.out.println("Element Found");
       else
    	   System.out.println("Element not found");
       while(true) {
       try {
    	   System.out.print("Enter the index: ");
    	   int index = sc.nextInt();
    	   System.out.println("Element at index "+index+" is "+arr[index]);
    	   break;
       }
       catch(ArrayIndexOutOfBoundsException e) {
    	   System.out.println("Index should not be greater than "+ (arr.length-1));
    	   
       }
      }
	}

}
