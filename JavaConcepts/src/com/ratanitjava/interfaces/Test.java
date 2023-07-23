package com.ratanitjava.interfaces;

public class Test implements InterfaceEg {

	@Override
	public void m1() {
//		a = a+10; //The final field InterfaceEg.a cannot be assigned
		System.out.println(a);
		
	}

	@Override
	public void m2() {
		System.out.println("m2 method");
		
	}

	public static void main(String[] args) {
		Test test = new Test();
		test.m1();
		test.m2();
		
		InterfaceEg interfaceEg = new Test();
		interfaceEg.m1();
		interfaceEg.m2();
		interfaceEg.wish();
		
		InterfaceEg eg = new Test();
		eg.wish();
		
		InterfaceEg eg1 = new Message();
		eg1.wish();
		
		Interface3 interface3 = new InterfaceImpl();
		interface3.m1();
		interface3.m2();
		interface3.m3();
		interface3.m4();
		
	}

	@Override
	public void wish() {
		System.out.println("Hi Friends");
		
	}
}
