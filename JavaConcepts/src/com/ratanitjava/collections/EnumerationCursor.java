package com.ratanitjava.collections;

import java.util.Enumeration;
import java.util.Vector;

/**
 * @author Manoj Kumar
 *
 */

public class EnumerationCursor {

//	foreach loop, get(), using cursors - we are used to read the data
//	cursors are 3 types Enumeration, Iterator and ListIterator
	
	/*
	 * Enumeration cursor is introduced in 1.0 and it is a legacy cursor and it is
	 * used to read the data from legacy(1.0 introduced) classes It is not a
	 * universal Cursor,we can get the enumeration object using elements() method
	 * 2 Methods of Enumeration Cursor - hasMoreElements() and nextElements(). Only used for read operation.
	 * we can read the data only in forward direction.Enumeration is an interface.It Support Normal and generic Collections.
	 */
	
	//3 methods of Enumeration
//	public abstract boolean hasMoreElements();
//	  public abstract E nextElement();
//	  public default java.util.Iterator<E> asIterator();
	
	public static void main(String[] args) {
		
		Vector<String> vector = new Vector<String>();
		vector.add("Ayumi");
		vector.add("Michelle");
		vector.add("SkyGuards");
		vector.add("Chaos");
		
		//read the data using Enumeration : normal 
		Enumeration enumeration = vector.elements();
		while(enumeration.hasMoreElements()) {
			String string = (String) enumeration.nextElement();
			System.out.println(string);
		}

		//read the data using Enumeration : Using Generics
		Enumeration<String> enumeration2 = vector.elements();
		while(enumeration2.hasMoreElements()) {
			String strings = enumeration2.nextElement();//type casting not required
			System.out.println("Using Generics: "+strings);
		}
		
//	ArrayList is not Synchronized and vector is Synchronized
	
		
	}

}
