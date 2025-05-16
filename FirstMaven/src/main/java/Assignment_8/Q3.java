package Assignment_8;

import java.util.Scanner;

class Calculator1 {
	void add(double a, double b) {
		System.out.println("Sum: " + (a + b));
	}

	void subract(double a, double b) {
		System.out.println("Difference: " + (a - b));
	}

	void multiply(double a, double b) {
		System.out.println("Product: " + (a * b));
	}

	void divide(double a, double b) {
		try {
			System.out.println("Quotient: " + (a / b));
		} catch (ArithmeticException e) {
			// TODO: handle exception
			System.err.println("Cannot divide by zero");
		}
	}
}

public class Q3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first number: ");
		double a = sc.nextDouble();
		System.out.print("Enter the second number: ");
		double b = sc.nextDouble();
		Calculator1 c1 = new Calculator1();
		Thread t1 = new Thread(() -> c1.add(a, b));
		Thread t2 = new Thread(() -> c1.subract(a, b));
		Thread t3 = new Thread(() -> c1.multiply(a, b));
		Thread t4 = new Thread(() -> c1.divide(a, b));
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}
}
