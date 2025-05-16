package Assignment_8;

import java.util.Scanner;

class Sum {
	public void findSum() {
		int s = 0;
		for (int i = 1; i <= 100; i++) {
			s = s + i;
		}
		System.out.println("Sum of 1st 100 natural numbers is: " + s+"\n");
	}
}

class Table {
	public void printTable(int n) {
		for (int i = 1; i <= 10; i++) {
			System.out.println(n + " * " + i + " = " + (n * i));
		}
		System.out.println();
	}
}

class MyThread1 extends Thread {
	Sum s;

	public MyThread1(Sum s) {
		this.s = s;
	}

	public void run() {
		s.findSum();
	}
}

class MyThread2 extends Thread {
	Table t;
	int n;

	public MyThread2(Table t, int n) {
		this.t = t;
		this.n = n;
	}

	public void run() {
		t.printTable(n);
	}
}

public class Q1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int n = sc.nextInt();
		Sum sum = new Sum();
		Table table = new Table();
		MyThread1 thread1 = new MyThread1(sum);
		MyThread2 thread2 = new MyThread2(table, n);
		thread1.start();
		thread2.start();
	}
}
