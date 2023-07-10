package com.ratanitjava.abstractclasses;

// No complete implementation of all methods in the child class make class as abstract
public abstract class OverrideAbstClass extends AbstractClassesEx
{
	@Override
	void m1() {
		System.out.println("m1 method");
		
	}

	@Override
	void m2() {
		System.out.println("m2 method");
		
	}

	@Override
	void m3() {
		System.out.println("m3 method");
		
	}

	@Override
	void m5() {
		
		System.out.println("m5 method");
	}


}
