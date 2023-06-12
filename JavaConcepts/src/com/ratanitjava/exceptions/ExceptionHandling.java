package com.ratanitjava.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {
	
void m3() {
	try {
		System.out.println(10/0);
	}
	catch(ArithmeticException ae) {
		System.out.println(ae);
		System.out.println(ae.getMessage());
	}
}

void m2() {
	m3();
}

void m1() {
	m2();
}
	public static void main(String[] args) {
		System.out.println("Hello World");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the division value: " +"\n");
		int n = scanner.nextInt();
		try {
			System.out.println(10/n);
			
		} catch (ArithmeticException e) {
			System.out.println(10/2);
			
		}
		System.out.println("Rest of the application");
		/*
		 * Exception in thread "main" java.lang.ArithmeticException: / by zero at
		 * com.ratanitjava.exceptions.ExceptionHandling.main(ExceptionHandling.java:7)
		 */
//		If the exception is not handled
		/*
		 * A program terminated abnormally 
		 * rest of the application is not executed.
		 */
//	To overcome the above problem habdle the exception
//	a. using try-catch
//	b. using throws
//		
//		Syntax:
//			try {
//				exceptional code: it may or may not raise an exception
//			}
//		catch(Exception-name ref-var){
//			logics: these logics are executed when the exception raised in try block
//		}
	
//	Case 2: If the catch block is not matched then the program terminated abnormally.	
		try {
			System.out.println(10/0);
			
		} catch (NullPointerException ne) {
			System.out.println(10/2);
			
		}
		
//		Case 3: If there is no exception in try block, catch blocks are not checked
		
		try {
			System.out.println("Ayumi");
			
		} catch (ArithmeticException e) {
			System.out.println(10/2);
			
		}
		System.out.println("Rest of the application");
	
//		Case 4: Independent try blocks are not allowed
//		try {
//			System.out.println("Ayumi");//error
//			
//		}
//		Syntax error, insert "Finally" to complete TryStatement
//		
//		System.out.println("Rest of the application");
	
//	Case 5: in between try catch block the statements are not allowed
	
//	try {
//		
//		
//	}
//	System.out.println("Ayumi");//error
//	
//	catch() {
//		
//	}
		
//	Case 6: 
//	If the exception raised in try block it will check the catch blocks
//	if the exception raised in catch block it always abnormal termination.
		try {
			System.out.println(10/0);
			
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("Ayumi".charAt(20));
			
		}
		System.out.println("Rest of the application");
		
//		Case 7: once the exception is raised in try-catch block the remaining codes of the try block not executed
		
		try {
			System.out.println("Ayumi");
			System.out.println("Eren");
			System.out.println(10/0);
		}
		catch(ArithmeticException ae) {
			System.out.println("Exception info  " +ae);
		}
		System.out.println("Rest of application");
	
//		Category 1 - Try with multiple catch blocks. It is active approach
		
		Scanner scanner1 = new Scanner(System.in);
		System.out.println("Enter the division value: " +"\n");
		
		try {
			int n1 = scanner1.nextInt();
			System.out.println(10/n1);
			System.out.println("Ayumi".charAt(10));
			
		}
		catch(InputMismatchException ie) {
			System.out.println("Enter the valid data only integers");
		}
		
		catch (ArithmeticException e) {
			System.out.println("Blades of Time");
			
		}
		
		catch(StringIndexOutOfBoundsException se) {
			System.out.println("String Exception");
		}
		
		System.out.println("Rest of the application");
	
//	Category 2 Instead of multiple catch block Use Exception class in the catch block which is root class for all exceptions.
//	One catch block handling all exceptions.It is Lazy approach
		
		Scanner scanner2 = new Scanner(System.in);
		System.out.println("Enter the division value: " +"\n");
		
		try {
			int n1 = scanner2.nextInt();
			System.out.println(10/n1);
			System.out.println("Ayumi".charAt(10));
			
		}
		catch(Exception e1) {
			System.out.println("Exception info: " +e1);
		}
		
		System.out.println("Rest of the application");
//	
//	Category 3
//	When we write all catch blocks we can write from child to parent. If the exception identified in parent class the child class is not executed.
		
		Scanner scanner4 = new Scanner(System.in);
		System.out.println("Enter the division value: " +"\n");
		
		try {
			int n1 = scanner4.nextInt();
			System.out.println(10/n1);
			System.out.println("Ayumi".charAt(10));
			
		}
		catch(InputMismatchException ie) {
			System.out.println("Enter the valid data only integers");
		}
		
		catch(Exception se) {
			System.out.println("String Exception");
		}
		
		System.out.println("Rest of the application");
	
//		Category 4 - using | symbol handling multiple exception in one catch block
//		catch(ArithmeticException | Exception e) - invalid root class handle all exceptions
		
		Scanner scanner5 = new Scanner(System.in);
		System.out.println("Enter the division value: " +"\n");
		
		try {
			int n1 = scanner5.nextInt();
			System.out.println(10/n1);
			System.out.println("Ayumi".charAt(10));
			
		}
		catch(InputMismatchException | ArithmeticException ie) {
			System.out.println("Enter the valid data");
		}
		
		System.out.println("Rest of the application");
	
//		Category 5 - Printing Exception Message
		
		new ExceptionHandling().m1();
		
		
	}
	
	

}
