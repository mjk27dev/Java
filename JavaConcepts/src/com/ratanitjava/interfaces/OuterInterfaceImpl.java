package com.ratanitjava.interfaces;

public class OuterInterfaceImpl implements OuterInterface, OuterInterface.InnerInterface {

	@Override
	public void m2() {
		System.out.println("Inner Interface");
		
	}

	@Override
	public void m1() {
		System.out.println("Outer Interface");
		
	}

	public static void main(String[] main) {
		OuterInterfaceImpl interface1 = new OuterInterfaceImpl();
		interface1.m1();
		interface1.m2();
	}
}
