package com.ratanitjava.oopsconcepts;

/**
 * @author Manoj Kumar
 *
 */
public class MethodOverriding extends Dragon {
	
	/* 1. Both Overridden and overriding method's Signatures must be same 
	 * 2. Parent Class method is declared as final cannot be override.
	 * 3. While overriding method return types must be same at primitive level(int,char,float,double,etc).
	 * 4. we can change the return type at object level by using covariant return type.
	 * 5. private methods are not possible to override, because private methods are specific to the classes.
	 * 6. while overriding you can maintain the same level of permissions or increase the permission and not in decreasing order.
	 */
	
	// Rule 1
	void dragon() {
		System.out.println("Balerion");//Overriding Method
	}

	//Rule 2
	final void houses() {
		System.out.println("Targaryen");
	}
	public static void main(String[] args) {
		MethodOverriding methodOverriding = new MethodOverriding();
		methodOverriding.dragon();
		methodOverriding.houses();
		
		
	}

}

// Rule 4
class Animal{
}
class Dog extends Animal{
	
}
class NewParent{
	Object eat() {
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
	
	//Rule 1
	void dragon() {
		System.out.println("Caraxes");//Overridden Method 
		
	}
	
	// Rule3 
//	int dragon1() {
//		System.out.println("Caraxes");//cannot change the return types for Overridden Method 
//		return 70;
//	}
//	
	void houses() {
		System.out.println("Starks");// cannot override when Parent class method is final
	}
	
}

