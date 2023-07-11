package com.ratanitjava.oopsconcepts;

/**
 * @author Manoj Kumar
 *
 */
public class Oops {

	/*
	 * OOP contains OOP principles and Techniques, and the principles are
	 * Inheritance, Polymorphism,Encapsulation, Coupling and cohesion. Techniques are
	 * Abstraction,Method Hiding, coding through interfaces, coding through abstract
	 * classes. 
	 * Class is a logical entity contains logics of the application.It is a blueprint, decides object creation without class no object
	 * creation. For a single class we can create multiple objects but each object occupies a memory. declare the class using "class" keyword
	 * Object is a physical entity representing memory.declare the class using "new" keyword
	 * Object contains state, behavior,identity. state is like color, identity is number, id or hashcode, behavior is methods or logics.
	 * Inheritance the process of acquiring the properties from Super class or parent class to Base Class or child class.
	 * we achieve inheritance using the keyword "extends". It is used to avoid code duplication and reduce the length of the code.
	 * The default super class in java is Object Class. Root class of all Java classes is object class. Every Class contains parent class 
	 * object class does not contains parent class.Object class is present in java.lang package. To prevent the class from inheritance,
	 * declare the class as final. if we declare as final we cannot extend the class.Every class is a child of Object class either
	 * directly or indirectly.
	 * 
	 */

}
class A{
	void m1() {
}
	void m2() {
		
	}
}
class B extends A{
	void m1() {
}
	void m2() {
		
	}
void m3() {
		
	}
void m4() {
	
}
}

class C extends B {
	void m1() {
}
	void m2() {
		
	}
void m3() {
		
	}
void m4() {
	
}
void m5() {
	
}
void m6() {

}
}

class Parent1{
	void properties() {
		System.out.println("money+gold");
	}
}

class Child1 extends Parent1{
	void eat() {
		System.out.println("food");
	}
	public static void main(String[] args) {
		Child1 child = new Child1();
		child.eat();
		child.properties();
	}
	}
	

	