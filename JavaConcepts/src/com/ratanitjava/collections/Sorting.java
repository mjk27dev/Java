package com.ratanitjava.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Vector;

/**
 * @author Manoj Kumar
 *
 */
public class Sorting {

	/*
	 * Comparable To perform the sorting of collections there were 2 conditions 1.
	 * Data is Homogeneous 2. implements comparable interface. String Classes and
	 * all wrapper classes implements Comparable interface
	 */
	public static void main(String[] args) {
		// Approach 1 Collections.Sort()
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("Ayumi");
		arrayList.add("Jill");
		arrayList.add("Chris");
		arrayList.add("Leon");
		System.out.println("Before Sorting: " + arrayList);
		Collections.sort(arrayList);
		System.out.println("After Sorting: " + arrayList);

		LinkedList<Integer> linkedList = new LinkedList<Integer>();
		linkedList.add(10);
		linkedList.add(3);
		linkedList.add(20);
		linkedList.add(5);
		System.out.println("Before Sorting: " + linkedList);
		Collections.sort(linkedList);
		System.out.println("After Sorting: " + linkedList);

		// Approach 2 ClasscastException
		ArrayList arrayList2 = new ArrayList();
		arrayList2.add(10);
		arrayList2.add("Ayumi");
//		Collections.sort(arrayList2);// java.lang.ClassCastException cannot sort heterogeneous data

		Vector vector = new Vector();
		vector.add(10);
		vector.add(20);
		vector.add(null);
//		Collections.sort(vector);//java.lang.NullPointerException cannot sort null values.

		ArrayList<Emp> arrayList3 = new ArrayList<Emp>();
		arrayList3.add(new Emp(1, "Ayumi"));
		arrayList3.add(new Emp(2, "Michelle"));
		arrayList3.add(new Emp(4, "Jill"));
		arrayList3.add(new Emp(3, "Sheva"));
		Collections.sort(arrayList3);

		for (Emp e : arrayList3) {
			System.out.println(e.eid + " " + e.name);
		}
		/*
		 * Limitations of Comparable and Comparable vs Comparator 
		 * 1. we are mixing sorting logics and business logics in single class 
		 * 2. One property sorting possible 
		 * 3. present in Java.lang package 
		 * 4. Collections.sort(arrayList)
		 * 5. Sorting logics compareTo() method and it requires one object.
		 * 6. String Class and all wrapper class implements Comparable
		 */

//		Comparator is used to separate sorting and business logics also we can do multiple properties sorting
//		present in Java.util package. Collections.sort(arrayList, new Eid comp()). Comparator is only for custom classes.
//		Predefined classes not implement Comparator interface.Sorting Logics compare() method. compare() method requires two objects.

		Collections.sort(arrayList3, new EidComp());

		for (Emp e1 : arrayList3) {
			System.out.println("Using Eid Comparator: " + e1.eid + " " + e1.name);
		}

		Collections.sort(arrayList3, new EmpNameComp());

		for (Emp e2 : arrayList3) {
			System.out.println("Using Ename Comparator: " + e2.eid + " " + e2.name);
		}
	
		LinkedList<Product> linkedList2 = new LinkedList<Product>();
		linkedList2.add(new Product(1, "Car", 600000.00));
		linkedList2.add(new Product(2, "Bike", 40000.00));
		linkedList2.add(new Product(4, "Bicycle", 3000.00));
		linkedList2.add(new Product(3, "Books", 20000.00));
		
		Collections.sort(linkedList2);
		for(Product p : linkedList2)
		System.out.println(p.productId+" "+p.productName);
	
		//Print Id in Descending Order
		Collections.sort(linkedList2, new IdComp());
		for(Product p1 : linkedList2)
			System.out.println("Descending order Using Id Comparator: "+p1.productId+" "+p1.productName);
	
		//Print Name in Descending Order
		Collections.sort(linkedList2, new PNameComp());
		for(Product p1 : linkedList2)
			System.out.println("Descending order Using Name Comparator: "+p1.productId+" "+p1.productName);
	}

}
