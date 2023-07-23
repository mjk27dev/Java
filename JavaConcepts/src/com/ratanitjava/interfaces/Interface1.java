package com.ratanitjava.interfaces;

public interface Interface1 {

	void m1();
	void m2();
	int a = 10;
	default void m6() {
		System.out.println("default method implementation");
	}
	static void m7() {
		System.out.println("static method implementation");
	}
	
	public static void main(String[] args) {
		System.out.println("main method");
	}
}

