package com.ratanitjava.oopsconcepts;

/**
 * @author Manoj Kumar
 *
 */
public class MethodOverriding extends Dragon {
	
	/* Both Overridden and overriding method's Signatures must be same 
	 * Parent Class method is declared as final cannot be override.
	 * While overriding method return types must be same at primitive level(int,char,float,double,etc),we can change the return type at class level by using covariant return type.
	 * 
	 */
	
	void dragon() {
		System.out.println("Balerion");//Overriding Method
	}

	final void houses() {
		System.out.println("Targaryen");
	}
	public static void main(String[] args) {
		MethodOverriding methodOverriding = new MethodOverriding();
		methodOverriding.dragon();
		methodOverriding.houses();
		
		
	}

}
class Animal{
}
class Dog extends Animal{
	
}
class NewParent{
	Animal eat() {
		System.out.println("Anything");
		return new Animal();
	}//overridden Method
}

class Child extends Parent{
	Dog eat() {
		System.out.println("Anything");
		return new Dog();
	}//overriding Method
}

class Dragon{
	
	void dragon() {
		System.out.println("Caraxes");//Overridden Method 
		
	}
	
//	int dragon1() {
//		System.out.println("Caraxes");//cannot change the return types for Overridden Method 
//		return 70;
//	}
//	
	void houses() {
		System.out.println("Starks");// cannot override when Parent class method is final
	}
	
}

