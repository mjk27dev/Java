package com.ratanitjava.collections;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorCursor {

	/* List Iterator is introduce in 1.2 and only used for List Classes, not a
	 * universal because it is only for lists. It is Bidirectional ie: read forward
	 * and backward directions. All operation is possible. It is an interface, it supports normal and generic version.
	 */	
	
	public static void main(String[] args) {
		
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("Ayumi");
		arrayList.add("Michelle");
		arrayList.add("Jill Valentine");
		arrayList.add("Sheva");
		
		//ListIterator with normal collection - print the data forward and backward direction.
		ListIterator listIterator = arrayList.listIterator();
		while (listIterator.hasNext()) {
			String string = (String) listIterator.next();
			System.out.println("Printing forward: "+string);
		}
		
		while (listIterator.hasPrevious()) {
			String s1 = (String) listIterator.previous();
			System.out.println("Printing backward: "+s1);
			
		}
		//ListIterator using Generics Collections
		ListIterator<String> listIterator2 = arrayList.listIterator();
		while (listIterator2.hasNext()) {
			String s = listIterator2.next();
			System.out.println("Printing forward: "+s);
		}
		
		while (listIterator2.hasPrevious()) {
			String string1 =  listIterator2.previous();
			System.out.println("Printing backward: "+string1);
		}
		

	}

}
