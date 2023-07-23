package com.ratanitjava.interfaces;



//always use extends before implements
public class AbstractImpl extends A implements A.It1{

	@Override
	void m1() {
	System.out.println("Abstract method");
		
	}

	@Override
	public void m2() {
		System.out.println("Interface method");
		
	}
	public static void main(String[] main) {
		AbstractImpl interface2 = new AbstractImpl();
		interface2.m1();
		interface2.m2();
	}
}
