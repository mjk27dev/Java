package com.ratanitjava.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;


/**
 * @author Manoj Kumar
 *
 */
public class LinkedHashSetEg {

	/* 1. LinkedHashSet is introduced in 1.4
	 * 2. It allows heterogeneous data is allowed 
	 * 3. Null insertion allowed 
	 * 4. Duplicates is not allowed
	 * 5. Insertion order is maintained
	 * 6. It is Not Synchronized
	 * 7. LinkedHashSet's Underlying data structure is Hash table and doubly-linked list 
	 * 8. Iterator Cursor is only applicable.
	 */
	public static void main(String[] args) {
		
		LinkedHashSet<String> hashSet = new LinkedHashSet<String>();
		hashSet.add("Ayumi");
		System.out.println(hashSet.add("ratan")); 
		System.out.println(hashSet.add("ratan")); // return is boolean
		hashSet.add("Jill");
		hashSet.add("Chris");
		hashSet.add("Ayumi");
		hashSet.add("Sheva");
		hashSet.add("Chris");
		System.out.println(hashSet);
		
		LinkedHashSet<Emp> linkedHashSet = new LinkedHashSet<Emp>();
		linkedHashSet.add(new Emp(1, "Ayumi"));
		linkedHashSet.add(new Emp(2, "Michelle"));
		linkedHashSet.add(new Emp(3, "Jill")); 
		linkedHashSet.add(new Emp(4, "Sheva"));
		linkedHashSet.add(new Emp(5, "Chris"));
		linkedHashSet.add(new Emp(6, "Cereza"));
		System.out.println(linkedHashSet);
		
		Iterator<Emp> iterator = linkedHashSet.iterator();
		while (iterator.hasNext()) {
			Emp emp = iterator.next();
			if(emp.eid==5) {
				iterator.remove();
			}
			if(emp.name.equals("Cereza")) {
				iterator.remove();
			}
			System.out.println(emp.eid+" "+emp.name);
			}
	for(Emp e : linkedHashSet) {
		System.out.println(e.eid+" "+e.name);
	}
	
	//adding one collection data into another
	HashSet<String> hashSet1 = new HashSet<String>(hashSet);
	hashSet1.add("Bayonetta");
	System.out.println(hashSet1);
	
	LinkedHashSet<String>linkedHashSet2 = new LinkedHashSet<String>();
	linkedHashSet2.add("aaa");
	LinkedHashSet<String>linkedHashSet3 = new LinkedHashSet<String>();
	linkedHashSet2.add("bbb");
	LinkedHashSet<String>linkedHashSet4 = new LinkedHashSet<String>();
	linkedHashSet4.addAll(linkedHashSet2);
	linkedHashSet4.addAll(linkedHashSet3);
	linkedHashSet4.add("aaa");
	System.out.println(linkedHashSet4);
	
	//Parent p = new Child();
	Set<String> set = new LinkedHashSet<String>();
	set.add("Ayumi");
	set.add("Michelle");
	System.out.println(set);
	
	//eliminating Duplicates
	ArrayList<String> arrayList = new ArrayList<String>();
	arrayList.add("Jill Valentine");
	arrayList.add("Chris");
	arrayList.add("Jill Valentine");
	System.out.println(arrayList);
	
	HashSet<String> hashSet2 = new HashSet<String>(arrayList);
	System.out.println(hashSet2);
	
}

}
