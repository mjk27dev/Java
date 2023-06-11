package com.ratanitjava.collections;

import java.util.ArrayList;

public class Collection {

	/*
	 * Collection Framework is representing a group of objects into a single entity.
	 * it was introduced in 1.2 and get popular in 1.5 because of Autoboxing and
	 * generics. Collection framework is providing very good architecture in store
	 * the date and manipulate the group of objects. Collection framework is having
	 * the group of class and interfaces to work with group of objects.
	 * It is present in Jav.util package. Collection framework divided into Collection and Map
	 * under collection List, set and queue present. Cursors is used to read the data from the collection classes.
	 */

	/*
	 * Arrays vs Collections 
	 * Arrays are also represent a group of object into single
	 * Entity.class It only store primitive as well as object data and it is
	 * homogeneous.The size is fixed once we create an array we cannot increase or decrease.
	 * Not supporting methods and operation is complex. Array is good performance
	 * 
	 * Collection is hetrogeneous
	 * Collection will store only object data.
	 * It is global in nature size automatically increased and decreased.
	 * Compared to arrays performance is low because of copying the data when they create a new arraylist size.
	 * Collections support more methods and operation is not complex.
	 */
	
	/*
	 * Collection Vs Collections 
	 * Collections is a class contains some methods such
	 * as sort(), nCopies().
	 * 
	 * Collection Framework is a root Interface of Collection, and root interface of
	 * Map is Map. Under Collection List, Set, queue. It is in Java.util package.
	 * Iterable is the parent of the collection.
	 */	
	
	/*Key Interfaces 
	 * Collection List, (Set ->SortedSet, NavigableSet), Queue,
	 * (Map Data-> SortedMap, NavigableMap, Map.Entry),
	 * Cursors(Enumeration,Iterator,ListIterator), Sortin(Comparable belongs to java.lang package, Comparator).
	 */		
	
	/* List Interface implements ArrayList, LinkedList,Vector,Stack Classes.
	 * Vector and stack are introduced in Java 1.0 and it is called legacy classes.
	 * ArrayList and LinkedList introduced in 1.2
	 */
	
//Characteristics of Collection Framework classes
	/*
	 * 1. All collection framework clasess support hetrogeneous data except TreeSet
	 * and Treemap 
	 * 2. All Collection Classes allow null values 
	 * 3. Set does not allow duplicates and list allow duplicates 
	 * 4. Legacy Classes(1.0 introduced) are synchronized and other classes introduced in 1.2 are non synchronized 
	 * 5. All list classes maintain insertion order. 
	 * 6. Resizable Array, In Linked List the internal architecture is Doubly linked List and also for Hashset internal
	 * architecture is HashTable format.
	 */
	
	public static void main(String[] args) {
		
		//Every Collection internally implementing Autoboxing concept, automatic conversion of primitive to wrapper objects.
        //ArrayList contains multiple objects, on every objects toString() executed.
        //String, StringBuffer all wrapper classes toString() return content of the obj
		
		ArrayList arrayList = new ArrayList();
		arrayList.add(10);
		arrayList.add("Ayumi");
		arrayList.add(10.5);
		arrayList.add(null);
		arrayList.add('a');
		arrayList.add(10);
		System.out.println(arrayList);
		System.out.println(arrayList.toString());
		
		
		
	}

}