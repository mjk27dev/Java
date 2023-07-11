package com.ratanitjava.abstractclasses;

/**
 * @author Manoj Kumar
 *
 */
public abstract class AbstractClassesEx {

	/*Abstract Class may contains abstract method or may not contains abstract
	 * methods, For abstract class object creation is not possible. Abstract Class
	 * contains both abstract and not abstract methods, We can implement abstract
	 * methods in the abstract class in the child class.
	 * Abstract methods can have any return type and any number of arguments.
	 * Abstract methods can be overloaded.
	 * Inside Abstract class main method is possible.
	 * Inside Abstract class constructor execution is possible. Where constructors are executed and objects are not created.
	 * Inside Abstract class we can have variables, methods,constructors,instance and static blocks are possible.
	 * To execute Abstract class constructor it is mandatory we have to use child class.
	 * The process of highlighting set of services and hiding implementations that process is called abstraction.
	 * Abstract Methods which we override in class, when we are using final abstract and static abstract we cannot override which is an
	 * illegal combination of modifiers, also same applies when we use private access modifier for abstract class.
	 * while overriding it is possible to maintain the same permission with increasing order and not in decreasing order.
	 */
	
	public AbstractClassesEx() {
		
		System.out.println("abstract Class constructor");
		}
	{
		System.out.println("Abstrct class instance method");
	}
	
	static void m8() {
		System.out.println("Abstrct class static method");
	}
	
	abstract void m1();
	abstract void m2();
	abstract void m3();
	void m4() {
		System.out.println("m4 method");
	}
	abstract void m5();
	abstract void m6();
	abstract int i1(char h, int a);
	abstract float f1(boolean b);
	abstract String login(String uname, String pwd);
	
	abstract void m1(int a);
	abstract void m1(int a, int b);
	abstract void m1(char ch);
//	public abstract void m9();
}