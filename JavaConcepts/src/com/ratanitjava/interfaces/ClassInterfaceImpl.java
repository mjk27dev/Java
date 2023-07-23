package com.ratanitjava.interfaces;

public class ClassInterfaceImpl extends B implements B.It2{

	@Override
	public void m2() {
		System.out.println("m2 Method");
		
	}
	public static void main(String[] main) {
		ClassInterfaceImpl interface3 = new ClassInterfaceImpl();
		interface3.m2();
		interface3.m3();
	}
}
