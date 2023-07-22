package com.ratanitjava.oopsconcepts;

public class SuperInstanceAndStatic {

	{
		System.out.println("Parent instance block");
	}
	static {
		System.out.println("parent class static block");
	}
}

// static block executed once even if multiple objects are created
class Children9 extends SuperInstanceAndStatic{
	{
		System.out.println("Child class instance block");
	}
	static {
		System.out.println("child class static block");
	}
	public static void main(String[] args) {
		new Children9();
		new Children9();
	}
}