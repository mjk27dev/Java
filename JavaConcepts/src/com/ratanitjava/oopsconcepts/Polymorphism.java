package com.ratanitjava.oopsconcepts;

public class Polymorphism extends Parent{

	/* One functionality with different behaviour is called Polymorphism and ability
	 * to appears in more than one form. It means Many Forms.
	 * 2 types of Polymorphism
	 * 1) Compile Time Polymorphism - Method Overloading - Class contains more than one method with same name different number and different type of arguments.
	 * 2) RunTime Polymorphism - Method Overriding - 
	 */	
	
	public void sum(int a){
		System.out.println(a+a);
	}

	public void sum(int a,int b){
		System.out.println(a+b);
	}

	public void sum(double d1,double d2){
		System.out.println(d1+d2);
	}
	
	public void m1(int a, long l) {
		System.out.println("int long Method");
	}
	
	public void m1(float f) {
		System.out.println("float arg method");
	}
	 public void m2(int a,int b) {
		 System.out.println("child int, int arg method");
	 }
	public static void main(String[] args) {
		
		Polymorphism polymorphism = new Polymorphism();
		
		//Method Overloading
		
		polymorphism.sum(10);//20
		polymorphism.sum(200.00, 300.00);//500.0
		polymorphism.sum(10, 30);//40
		polymorphism.m1(10, 20l);
		polymorphism.m1(100,200);
		polymorphism.m1('a', 'b');// unicode value will stored
		polymorphism.m1((byte)10, (short)20);
		polymorphism.m1(10.5f);
		polymorphism.m1(10);//integer automatically promoted to float
		polymorphism.m1('a');
//      polymorphism.m1(10.5);// The method m1(float) in the type Polymorphism is not applicable for the arguments (double), incompatible types: possible loss of conversion from double to float
		
		//overload the methods in child and parent relationship
		polymorphism.m2(10);
		polymorphism.m2(10, 20);
		
		/* Type Promotion is always from left to right. Possible to overload the methods in parent and child relationship.
		 * byte(1 bytes) -> short(2 bytes)->int(4 bytes)->long(8 bytes)->float(4 bytes)-> double(8 bytes) 
		 * char(2 bytes)->int(4 bytes)
		 */
	
// In java numeric values by default is int type, to represent long value use L constant, to represent byte,short use typeCasting
// In java the decimal values are by default double type, to represent float value use f constant.
		
		/* Types of Overloading 
		 * 1) method Overloading 
		 * 2) constructor Overloading 
		 * 3) operator overloading //java doesn't support operator overloading, but implicitly JVM supports + operator .
		 */

	}

}

class Parent{
	public void m2(int a) {
		System.out.println("parent int arg method");
	}
}