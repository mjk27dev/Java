package com.ratanitjava.methods;

import java.util.Scanner;

public class MethodsEx {

	/*
	 * Inside the class it is not possible to write logics directly. so, inside class
	 * declare the method write the logic. Methods is used to write the logics of
	 * the application. There are two types of methods, instance and static methods.
	 * adding static modifier to the instance method, the instance method becomes
	 * static. Instance methods overriding is possible and static methods overriding
	 * is not possible. Instance methods are accessible by using object and static
	 * methods are accessible by using ClassName. Method follows mixed case coding
	 * name convention, name starts with lower case and every inner word starts with
	 * Upper case. eg: CharAt(). Every methods contains three parts Method
	 * declaration, Method implementation, Method Calling.
	 * 
	 * 1. For Java Methods return type is mandatory
	 * 2. every method contains a method name and corresponding arguments list and returns the values and if doesn't need return values change the method as void.
	 * 3. Inside the class more than one method with same signature is not allowed.
	 * 4. Java doesn't support inner Methods.
	 */

	void wish() {
		System.out.println("Good Morning");
	}

	void add(int a, int b) {
		System.out.println(a + b);
	}

	static void courseInfo(String name) {
		if (name.equals("Core Java")) {
			System.out.println("Core Java Course");
		} else if (name.contains("Advanced Java")) {
			System.out.println("Advanced Java Course");
		} else {
			System.out.println("Course is not available.....");
		}
	}

	static void disp(int a, char ch, float f, boolean b) {
		System.out.println(a + " " + ch + " " + f + " " + b);
	}

	void loginStatus(String username, String password) {
		if (username == "ratan" && password == "ratan123") {
			System.out.println("Login success");
		} else {
			System.out.println("Login Fail.... try with valid details");
		}
	}

	static void voteCheck(String name, int age, String area) {
		if (age > 18 && area == "Chennai") {
			System.out.println("eligible");
		} else {
			System.out.println("Not eligible");
		}

	}

	static void addn(int num1, int num2) {
		System.out.println(num1+num2);
	}
	
	int a = 10;
	int b = 30;// instance variables
	void addition(int i, int j) // local variables 
	{
		System.out.println(i+j);
		System.out.println(a+b);
	}
	
	/*
	 * If the application contains both local and instance variables with same
	 * names, in this case to represent instance variables use object name, But in
	 * place of object it is possible to use this keyword. this keyword represent
	 * current class object. inside the static area this keyword is not allowed.
	 */
	
	public static void main(String[] args) {
		MethodsEx methodsEx = new MethodsEx();
		System.out.println(methodsEx.a+methodsEx.b);
//		System.out.println(this.a);// You cannot use this keyword inside the static methods.
		methodsEx.add(10, 20);// instance methods with args
		methodsEx.wish();// instance methods : instance methods are called by using object name
		MethodsEx.courseInfo("Advanced Java");// static methods are called by using class name
		MethodsEx.disp(10, 'x', 10.5f, false);
		MethodsEx.addn(15, 25);// directly passing the constant values
		int x = 100;
		int y = 200;
		MethodsEx.addn(x, y);// passing the variables
		
		//take the input from end user pass the values
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the first number");
		int num1 = scanner.nextInt();
		System.out.println("Enter the second number");
		int num2 = scanner.nextInt();
		MethodsEx.addn(num1, num2);
		methodsEx.addition(200, 300);

	}

}
