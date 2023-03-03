package com.in28minutes.firstjavaproject;

public class MultiplicationTable {
	
	void print() {
		print(5, 1, 9);
	}
	
	void print(int n) {
		print(n, 1, 9);
	}
	
	void print(int n, int from, int to) {
		for (int i=from; i<=to; i++) {
			System.out.printf("%d * %d = %d\n", n, i, n*i);
		}
	}

}
