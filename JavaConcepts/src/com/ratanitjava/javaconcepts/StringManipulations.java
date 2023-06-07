package com.ratanitjava.javaconcepts;

public class StringManipulations {

	StringManipulations(){
		
	}
	StringManipulations(String str) {

	}

	public static void main(String[] args) {

		String s1 = "Ayumi";// SCP memory
		System.out.println(s1);

		String s2 = new String("Ayumi");// Heap memory
		System.out.println(s2);

		char[] ch = { 'a', 'b', 'c', 'd' };
		String s3 = new String(ch);
		System.out.println(s3);

		String s4 = new String(ch, 2, 2);// offset value and character value
		System.out.println(s4);

		byte[] b = { 65, 66, 67, 68, 69, 70 };
		String s5 = new String(b);
		System.out.println(s5);// ABCDEF - Prints ASCII Characters

		String s6 = new String(b, 3, 3);
		System.out.println(s6);

//		When we create a object without using new operator object will goes to SCP(String constant pool) memory and 
//		using new operator it will goes to Heap memory	

		// without using new Operator - SCP Memory
		System.out.println("-------- without using new keyword: SCP: --------");
		String s7 = "Jill";
		String s8 = "Jill";
		System.out.println(s1 == s7);
		System.out.println(s1 == s8);
		System.out.println(s7 == s8);

		// with new operator - Heap Memory
		System.out.println("------------- using new keyword: Heap Memory: ----------");
		String str1 = new String("Ayumi");
		String str2 = new String("Jill");
		String str3 = new String("Jill");
		System.out.println(str1 == str2);
		System.out.println(str1 == str3);
		System.out.println(str2 == str3);

//	for StringBuffer we can create an object only using new operator

		System.out.println("------------- String Buffer -----------");
		StringBuffer sb1 = new StringBuffer("Ayumi");
		StringBuffer sb2 = new StringBuffer("Jill");
		StringBuffer sb3 = new StringBuffer("Ayumi");
		System.out.println(sb1 == sb2);
		System.out.println(sb1 == sb3);
		System.out.println(sb2 == sb3);

//String is not immutable which means not modifiable and String Buffer is mutable, we can modify String buffer
// for String we can use concat() method we cannot modify the string, for StringBuffer is mutable using append() method
//concat() - method is used to concatenate two string object and return a new string object, not used to modify the existing string.

		System.out.println("-------- concat() Method ---------");
		// immutable : modifications are not allowed
		String str4 = "ayumi";
		str4.concat("BladesofTime");// immutable
		System.out.println(str4);
		String str5 = str4.concat(" BladesofTime");
		System.out.println(str5);

		System.out.println("-------- append() Method ---------");
		// mutable : modifications are allowed
		StringBuffer sb4 = new StringBuffer("Jill");
		sb4.append(" Valentine");
		System.out.println(sb4);

		// interview Question
		String str6 = "Jill";
		str6 = str6.concat("Valentine");// the previous object created is destroyed and new value pointed to the object
		System.out.println(str6);

		String str7 = new String("Jill");
		str7 = str7.concat("Valentine");
		System.out.println(str7);

		/*
		 * equals() is basically from object class return type is boolean and it
		 * performs reference comparison - when 2 reference variables pointing to the
		 * same object returns true if not return false.
		 */

		/* String and StringBuffer both are final classes belong to java.lang package
		 * String Class overriding the equals() method the implementation is content
		 * comparison StringBuffer is not overriding equals() method uses object class
		 * and not uses String Class uses reference comparison */
		
//	== operator always uses reference comparison

//	public boolean equals(java.lang.object);

		// object: equals(): reference comparison
		StringManipulations t1 = new StringManipulations("Korra");
		StringManipulations t2 = new StringManipulations("Korra");
		System.out.println(t1.equals(t2));// false
		System.out.println("The == operator output is: " + (t1 == t2));// false

		// String class overriding the equals() methods and perform content comparison
		String str8 = "Korra";
		String str9 = "Korra";
		System.out.println(str8.equals(str9));// true
		System.out.println("The == operator output is: " + (str8 == str9));// true - reference comparison SCP memory

		// String class overriding the equals() methods and perform content comparison
		String st1 = new String("Korra");
		String st2 = new String("Korra");
		System.out.println(st1.equals(st2));// true
		System.out.println("The == operator output is: " + (st1 == st2));// false - reference comparison Heap memory

		// StringBuffer: no class: it uses object class equals() method - reference
		// comparison
		StringBuffer sb5 = new StringBuffer("Korra");
		StringBuffer sb6 = new StringBuffer("Korra");
		System.out.println(sb5.equals(sb6));// false
		System.out.println("The == operator output is: " + (sb5 == sb6));// false

		/*
		 * It is basically from object class, in java whenever we are printing a
		 * reference variable, it automatically calls toString() method, return type of
		 * toString() is String data, UID value generated by the JVM, whenever the
		 * object class toString executed it returns classname@hashcode, we can override
		 * object class toString() in the Class. String and StringBuffer
		 * class toString() executed it returns content of the object. In String and String Buffer 
		 * class internally the toString() method is overridden
		 */
		
		StringManipulations s = new StringManipulations();
		System.out.println(s);
		System.out.println(s.toString());//com.ratanitjava.javaconcepts.StringManipulations@123772c4
		
		Employee e1 = new Employee(1, "ratan");
		System.out.println(e1);
		
		String string = new String("Manoj");
		System.out.println(string);//Manoj
		System.out.println(string.toString());//Manoj
		
		StringBuffer stringBuffer = new StringBuffer("Manoj");
		System.out.println(stringBuffer);
		System.out.println(stringBuffer.toString());
		
	}

}