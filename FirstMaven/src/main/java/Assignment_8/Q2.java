package Assignment_8;

import java.util.Scanner;

class Calculator {
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
		System.out.println("Quotient: " + (a / b));}
		catch (ArithmeticException e) {
			// TODO: handle exception
			System.err.println("Cannot divide by zero");
		}
	}
}

class WorkerThread1 extends Thread {
	Calculator c;
	int a;
	int b;

	public WorkerThread1(Calculator c, int a, int b) {
		// TODO Auto-generated constructor stub
		this.c = c;
		this.a = a;
		this.b = b;
	}

	public void run() {
		c.add(a, b);
	}
}

class WorkerThread2 extends Thread {
	Calculator c;
	int a;
	int b;

	public WorkerThread2(Calculator c, int a, int b) {
		// TODO Auto-generated constructor stub
		this.c = c;
		this.a = a;
		this.b = b;
	}

	public void run() {
		c.subract(a, b);
	}
}

class WorkerThread3 extends Thread {
	Calculator c;
	int a;
	int b;

	public WorkerThread3(Calculator c, int a, int b) {
		// TODO Auto-generated constructor stub
		this.c = c;
		this.a = a;
		this.b = b;
	}

	public void run() {
		c.multiply(a, b);
	}
}

class WorkerThread4 extends Thread {
	Calculator c;
	int a;
	int b;

	public WorkerThread4(Calculator c, int a, int b) {
		// TODO Auto-generated constructor stub
		this.c = c;
		this.a = a;
		this.b = b;
	}

	public void run() {
		c.divide(a, b);
	}
}

public class Q2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the 1st number: ");
		int a = sc.nextInt();
		System.out.print("Enter the 2nd number: ");
		int b = sc.nextInt();
		Calculator calculator = new Calculator();
		WorkerThread1 thread1 = new WorkerThread1(calculator, a, b);
		WorkerThread2 thread2 = new WorkerThread2(calculator, a, b);
		WorkerThread3 thread3 = new WorkerThread3(calculator, a, b);
		WorkerThread4 thread4 = new WorkerThread4(calculator, a, b);
		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();

	}
}
