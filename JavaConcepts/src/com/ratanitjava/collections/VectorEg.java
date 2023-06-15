package com.ratanitjava.collections;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

/**
 * @author Manoj Kumar
 *
 */

public class VectorEg {

	/*
	 * ArrayList is introduced in Java 1.2, it is non Synchronized ie: can access
	 * multiple threads and it is not thread safe and increased in performance.
	 *
	 * Vector is introduced in Java 1.0, it is synchronized ie: only one thread can
	 * access at a time and it is thread safe and performance is slow compared to
	 * ArrayList
	 */

//	Vector is having 3 constructors
//	 public java.util.Vector(int, int);new Vector(4,8) - new Capacity 12,20
//	 public java.util.Vector(int);new Vector(7) - new Capacity 14
//   public java.util.Vector(); - default constructor and default capacity 10 and new vector() created and new capacity is 20

	public static void main(String[] args) {
		Vector<String> vector = new Vector<String>(2, 6);
		System.out.println(vector.capacity());
		vector.add("Ayumi");
		vector.add("Jill");
		vector.add("Chris");
		vector.add("Sheva");
		System.out.println(vector);
		System.out.println(vector.capacity());

        //converting ArrayList into vector
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("aaa");
		arrayList.add("bbb");

		Vector<String> vector2 = new Vector<String>(arrayList);
		vector2.add("ccc");
		vector2.add("ddd");
		System.out.println(vector2);

		// print the even numbers from 1 to 30 using Vector
		Vector<Integer> vector3 = new Vector<Integer>();
		for (int i = 0; i <= 30; i++) {
			vector3.add(i);
		}
		System.out.println(vector3);

		Iterator<Integer> iterator = vector3.iterator();
		while (iterator.hasNext()) {
			Integer integer = iterator.next();
			if (integer % 2 == 0) {
				System.out.println(integer);
			} else {
				iterator.remove();
			}
		}
		System.out.println(vector3);

		Vector<Product> products = new Vector<Product>();
		products.add(new Product(1, "Car", 300000.00));
		products.add(new Product(2, "Bicycle", 3000.00));
		products.add(new Product(1, "Motor Cycle", 60000.00));

		// print the data using Enumeration
		Enumeration<Product> enumeration = products.elements();
		while (enumeration.hasMoreElements()) {
			Product product = enumeration.nextElement();
			System.out.println(product.productId + " " + product.productName + " " + product.productCost);
		}

		// print the data using Iterator
		Iterator<Product> iterator2 = products.iterator();
		while (iterator2.hasNext()) {
			Product product = iterator2.next();
			System.out.println(product.productId + " " + product.productName + " " + product.productCost);
		}

		// print the data using ListIterator
		ListIterator<Product> iterator3 = products.listIterator();
		while (iterator3.hasNext()) {
			Product product2 = iterator3.next();
			System.out.println(product2.productId + " " + product2.productName + " " + product2.productCost);
		}
	}

}
