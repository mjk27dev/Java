package com.ratanitjava.interfaces;

public interface InterfaceEg {

	/* Interface is best place to declare the functionalities of the project,
	 * interface methods are public abstract by default and it does not contains any
	 * body. If the interface contains abstract methods implement the abstract methods in a class using implements keyword.
	 * Interface is the best place where we you can declare only declaration of the application.
	 * inside the interface main method is not allowed till Java 7. From Java 8 main method is allowed in interfaces.
	 * One class can extends only one class, one interface can extends multiple interfaces.
	 * One class implements multiple interfaces.
	 * One interface extends multiple interfaces, if multiple interface having the common method write only one time.
	 * Declaring an interface inside an interface,abstract class and Class is called Nested Interfaces.
	 * By default in an interface methods are public abstract and variables are public static final.
	 * Till Java 1.7 interfaces can have only abstract methods, From Java 1.8 it allows abstract, static and default methods.
	 */
	
	void m1(); // by default interface methods are public abstract
	void m2();
	void wish();
	int a = 10;
}
