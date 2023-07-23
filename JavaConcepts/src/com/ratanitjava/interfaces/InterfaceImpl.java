package com.ratanitjava.interfaces;

public class InterfaceImpl implements Interface1, Interface2, Interface3 {

	@Override
	public void m1() {
		System.out.println("m1 Method");
		
	}

	@Override
	public void m4() {
		System.out.println("m4 Method");
		
	}

	@Override
	public void m2() {
		System.out.println("m2 Method");
//		System.out.println(a); //The field a is ambiguous
	}

	@Override
	public void m3() {
		System.out.println("m3 Method");
		
	}
	
	public static void main(String[] args) {
		Interface1 interface1 = new InterfaceImpl();
		interface1.m6();
		Interface1.m7();
	}
	
}
