package com.ratanitjava.abstractclasses;


public class AbstractClassImpl extends OverrideAbstClass  {
	
	public AbstractClassImpl() {
		super();
		System.out.println("Normal class constructor");
	}


	public static void main(String[] args) {
//      AbstractClassesEx is an abstract class cannot create an object, cannot be instantiated
//		AbstractClassesEx abstractClassesEx = new AbstractClassesEx();
		
		AbstractClassImpl abstractClassImpl = new AbstractClassImpl();
		abstractClassImpl.m1();
		abstractClassImpl.m2();
		abstractClassImpl.m3();
		abstractClassImpl.m4();
		abstractClassImpl.m5();
		abstractClassImpl.m6();
		abstractClassImpl.login("Manoj", "Targaryen@27");
		abstractClassImpl.m1(10);
		abstractClassImpl.m1('c');
		abstractClassImpl.m1(10,20);
		abstractClassImpl.m8();

	}

	@Override
	void m6() {
		System.out.println("m6 Method");
		
	}

	@Override
	int i1(char h, int a) {
		
		return 0;
	}

	@Override
	float f1(boolean b) {
		
		return 0;
	}

	@Override
	String login(String uname, String pwd) {
		if(uname != null && pwd != null) {
			System.out.println("Login Success");
		}
		return uname;
	}

	@Override
	void m1(int a) {
		System.out.println("override with int argument");
		
	}

	@Override
	void m1(int a, int b) {
		System.out.println("override with multiple int argument");
		
	}

	@Override
	void m1(char ch) {
		System.out.println("override with different datatype");
		
	}


//	@Override
//	void m9() {
//		// TODO Auto-generated method stub
//		
//	}//attempting to assign weaker access privileges; was public 

	
}
