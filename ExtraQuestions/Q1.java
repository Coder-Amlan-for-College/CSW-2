package ExtraQuestions;

import java.util.Scanner;

class Box<T>{
	T value;
	public Box(T value) {
		// TODO Auto-generated constructor stub
	 this.value = value;
	}
	void set(T value) {
		this.value = value;
	}
	public T get() {
		return value;
	}
}

public class Q1 {
     public static void main(String[] args) {
    	 Scanner sc = new Scanner(System.in);
         System.out.print("Enter the value: ");
    	 Box<Object> ob = new Box<>(sc.next());
    	 System.out.println("You entered: "+ob.get());
	} 
		// TODO Auto-generated method stub
         
	
}
