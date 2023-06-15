package com.ratanitjava.collections;

import java.util.Stack;

/**
 * @author Manoj Kumar
 *
 */
public class StackEg {

	/* Vector is a List interface implementation class. It is a legacy class and it
	 * is introduced in Java 1.0. It is synchronized and thread safe. It follow Last in First Out (LIFO) order.
	 * Performance decreased of thread safety.
	 */
	
//	Methods of Stack
//	public class java.util.Stack<E> extends java.util.Vector<E> {
//		  public java.util.Stack();
//		  public E push(E);
//		  public synchronized E pop();
//		  public synchronized E peek();
//		  public boolean empty();
//		  public synchronized int search(java.lang.Object);
//		}
	public static void main(String[] args) {
		
		Stack<String> stack = new Stack<String>();
		stack.add("Ayumi");// add method also supported in stack beacuse stack is also the part of the collection
		stack.push("Michelle");
		stack.push("Jill");
		
		System.out.println(stack);
		System.out.println(stack.search("Jill"));
		stack.pop();
		System.out.println(stack.peek());
		System.out.println(stack.empty());
		stack.clear();
		System.out.println(stack.empty());
		
		
	}

}
