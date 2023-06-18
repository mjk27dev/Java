package com.ratanitjava.collections;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.RandomAccess;

/**
 * @author Manoj Kumar
 *
 */
public class CloningProcess {
	
	int a = 10;
	int b = 20;

	/* Process of creating the exactly duplicate object is called cloning.
	 * initially the class not support clone process, In order to support cloning
	 * class implements Cloneable interface.Once your class implements Cloneable
	 * interface class requires some special capabalities to perform cloning.
	 * Cloneable Interface is a Marker Interface. Cloning means directly clone the data from heap memory.
	 */
	
	/* An interface without methods but whenever our class implements that interface
	 * our class must acquire some special capabalities to perform some operations
	 * is called Marker Interface.
	 */
	
	public static void main(String[] args) {
		CloningProcess cloningProcess = new CloningProcess();
		System.out.println(cloningProcess.a);
		System.out.println(cloningProcess.b);
		
//		CloningProcess cloningProcess2 = (CloningProcess) cloningProcess.clone();
//		System.out.println(cloningProcess2.a);
//		System.out.println(cloningProcess2.b);

		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("Ayumi");
		arrayList.add("Ellie");
		arrayList.add("Ashley");
		System.out.println(arrayList);
		
		ArrayList<String> arrayList2 = (ArrayList<String>) arrayList.clone();
		System.out.println(arrayList2);
		
		ArrayList<String> arrayList3 = new ArrayList<String>();
		System.out.println(arrayList3 instanceof List);
		System.out.println(arrayList3 instanceof Cloneable);
		System.out.println(arrayList3 instanceof Serializable);
		System.out.println(arrayList3 instanceof RandomAccess);
		
		LinkedList<String> linkedList = new LinkedList<String>();
		System.out.println(linkedList instanceof List);
		System.out.println(linkedList instanceof Cloneable);
		System.out.println(linkedList instanceof Serializable);
		System.out.println(linkedList instanceof RandomAccess);
		
	}

}
