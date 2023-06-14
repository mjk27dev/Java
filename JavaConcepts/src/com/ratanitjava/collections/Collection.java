package com.ratanitjava.collections;

import java.util.ArrayList;

/**
 * @author Manoj Kumar
 *
 */
public class Collection {

	/*
	 * Collection Framework is representing a group of objects into a single entity.
	 * it was introduced in 1.2 and get popular in 1.5 because of Autoboxing and
	 * generics. Collection framework is providing very good architecture in store
	 * the date and manipulate the group of objects. Collection framework is having
	 * the group of class and interfaces to work with group of objects. It is
	 * present in Jav.util package. Collection framework divided into Collection and
	 * Map under collection List, set and queue present. Cursors is used to read the
	 * data from the collection classes.
	 */

	/*
	 * Arrays vs Collections Arrays are also represent a group of object into single
	 * Entity.class It only store primitive as well as object data and it is
	 * homogeneous.The size is fixed once we create an array we cannot increase or
	 * decrease. Not supporting methods and operation is complex. Array is good
	 * performance
	 * 
	 * Collection is hetrogeneous Collection will store only object data. It is
	 * global in nature size automatically increased and decreased. Compared to
	 * arrays performance is low because of copying the data when they create a new
	 * arraylist size. Collections support more methods and operation is not
	 * complex.
	 */

	/*
	 * Collection Vs Collections Collections is a class contains some methods such
	 * as sort(), nCopies().
	 * 
	 * Collection Framework is a root Interface of Collection, and root interface of
	 * Map is Map. Under Collection List, Set, queue. It is in Java.util package.
	 * Iterable is the parent of the collection.
	 */

	/*
	 * Key Interfaces Collection List, (Set ->SortedSet, NavigableSet), Queue, (Map
	 * Data-> SortedMap, NavigableMap, Map.Entry),
	 * Cursors(Enumeration,Iterator,ListIterator), Sorting(Comparable belongs to
	 * java.lang package, Comparator).
	 */

	/*
	 * List Interface implements ArrayList, LinkedList,Vector,Stack Classes. Vector
	 * and stack are introduced in Java 1.0 and it is called legacy classes.
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

		// Every Collection internally implementing Autoboxing concept, automatic
		// conversion of primitive to wrapper objects.
		// ArrayList contains multiple objects, on every objects toString() executed.
		// String, StringBuffer all wrapper classes toString() return content of the obj

		ArrayList arrayList = new ArrayList();
		arrayList.add(10);
		arrayList.add("Ayumi");
		arrayList.add(10.5);
		arrayList.add(null);
		arrayList.add('a');
		arrayList.add(10);
		System.out.println(arrayList);
		System.out.println(arrayList.toString());

		ArrayList arrayList2 = new ArrayList();
		arrayList2.add(new Emp(1, "ratan"));
		arrayList2.add(new Student(1, "Ayumi"));
		arrayList2.add("ratan");
		arrayList2.add(10);
		arrayList2.add(null);
		System.out.println(arrayList2);
		System.out.println(arrayList2.toString());

		for (Object o : arrayList2) {

			if (o instanceof Emp) {
				Emp e = (Emp) o;
				System.out.println(e.eid + " " + e.name);
			}
			if (o instanceof Student) {
				Student student = (Student) o;
				System.out.println(student.sid + " " + student.sname);
			}
			if (o instanceof String) {
				System.out.println(o);
			}
			if (o == null) {
				System.out.println(o);
			}
		}

//Arrays are TypeSafe
//Collections are not TypeSafe because of its hetrogeneous nature, contains different types of data, while reading the data we face 2 problems type check and type safe
// to make collections typesafe we can use Generics.

		Student s = (Student) arrayList2.get(1);
		System.out.println(s.sid + " " + s.sname);

		Object obj = arrayList2.get(0);
		if (obj instanceof Student) {
			Student S1 = (Student) obj;
			System.out.println(S1.sid + " " + S1.sname);
		}
		if (obj instanceof Emp) {
			Emp e1 = (Emp) obj;
			System.out.println(e1.eid + " " + e1.name);
		}

//		To Provide the type safety to the call use generics.It is introduced in Java 1.5 
		//Arrays are typesafe
		
		int[] a = {10,20,30};
		for(int array: a) {
			System.out.println(array);
		}
		
//		Collections are not Type Safe, to provide type safety to the collection using generics
		
		ArrayList<Emp> emps = new ArrayList<Emp>();
		emps.add(new Emp(1, "Ratan"));
		emps.add(new Emp(2, "Ayumi"));
		for(Emp e: emps) {
			System.out.println(e.eid+" "+e.name);
		}
		
	Emp e = emps.get(1);
	System.out.println(e.eid+" "+e.name);
	
//	Arrays and Collections with generics are homogeneous.Since Collections with generics is flexible with respect to memory and operation
//	Arrays are not supporting any methods but collections support various methods.
	
	// ArrayList Methods
	
	System.out.println(arrayList);
	System.out.println(arrayList.size());
	arrayList.add(3,"Michelle");
	System.out.println(arrayList);
	arrayList.remove(2);
	arrayList.remove("Michelle");
	System.out.println(arrayList);
	
//	index is not available: IndexOutOfBoundsException
//	Data is not available: Just ignored
	
	arrayList.set(2, "Batman");
	System.out.println(arrayList);
	
	System.out.println(arrayList.isEmpty());
	arrayList.clear();
	System.out.println(arrayList.isEmpty());
 		
	//interview Question
//Remove() - Removes the element at the specified position in this list.Shifts any subsequent elements to the left (subtracts one from their indices).
	ArrayList arrayList3 = new ArrayList();
	arrayList3.add(10);
//	arrayList3.remove(10);
//	System.out.println(arrayList3);//java.lang.IndexOutOfBoundsException
	
	// ArrayList Constructors
	//The below are the 3 constructors of ArrayList.
//	public java.util.ArrayList(int); new ArrayList(20); new Capacity is old*3/2+1 = 31
//	public java.util.ArrayList(); - Default constructor, default capacity is 10 ,new Capacity old *3/2+1 = 16
//	public java.util.ArrayList(java.util.Collection<? extends E>); - to add one collection data into another collections

	//adding one collection to one another - Approach 1.- By Passing with the constructor one call into another
	ArrayList<Integer> arrayList4 = new ArrayList<Integer>();
	arrayList4.add(10);
	arrayList4.add(20);
	arrayList4.add(30);
	
	ArrayList<Integer> arrayList5 = new ArrayList<Integer>(arrayList4);
	arrayList5.add(100);
	arrayList5.add(200);
	System.out.println(arrayList5);//[10, 20, 30, 100, 200]
	
	//adding one collection to one another - Approach 2.- addAll() to add more than one collection into another
	ArrayList<Integer> arrayList6 = new ArrayList<Integer>();
	arrayList6.add(100);
	ArrayList<Integer> arrayList7 = new ArrayList<Integer>();
	arrayList7.add(200);
	ArrayList<Integer> arrayList8 = new ArrayList<Integer>();
	arrayList8.add(300);
	arrayList8.addAll(arrayList6);// Used to adding the collection data.
	arrayList8.addAll(arrayList7);
	System.out.println(arrayList8);
	
	Emp emp = new Emp(1, "Ayumi");
	Emp emp1 = new Emp(2, "Jill");
	Emp emp2 = new Emp(3, "Sheva");
	Emp emp3 = new Emp(4, "Eren");
	
	ArrayList<Emp> arrayList9 = new ArrayList<Emp>();
	arrayList9.add(emp);
	arrayList9.add(emp1);
	
	ArrayList<Emp> arrayList10 = new ArrayList<Emp>();
	arrayList10.addAll(arrayList9);
	arrayList10.add(emp2);
	arrayList10.add(emp3);
	
	//Contains() used to check an object is contains or not
	//ContainsAll() used to check the objects contain in a collection is present or not
	
	System.out.println(arrayList10.contains(emp));//true
	System.out.println(arrayList10.containsAll(arrayList9));//true
	arrayList10.remove(emp);
	System.out.println(arrayList10.contains(emp));//false
	System.out.println(arrayList10.containsAll(arrayList9));//false

//Removes from this list all of its elements that are contained in the specified collection
//	removes all the arrayList9 objects 
	
	arrayList10.removeAll(arrayList9);
	
//Retains only the elements in this list that are contained in the specified collection. 
//In other words, removes from this list all of its elements that are not contained in the specified collection
//arrayList10 objects removed

	arrayList10.retainAll(arrayList9);

	for (Emp e1 : arrayList10) {
		System.out.println(e1.eid+" "+e1.name);
	}
	
	
	
	
	}
	
	
	

}
