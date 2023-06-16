package com.ratanitjava.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;


/**
 * @author Manoj Kumar
 *
 */
public class HashSetEg {

	/* 1. HashSet is introduced in 1.2 
	 * 2. It allows heterogeneous data is allowed 
	 * 3. Null insertion allowed 
	 * 4. Duplicates is not allowed
	 * 5. Insertion order is not maintained
	 * 6. It is Not Synchronized
	 * 7. Hashset's Underlying data structure is HashTable
	 * 8. Iterator Cursor is only applicable.
	 */
	
	public static void main(String[] args) {
	
		HashSet<String> hashSet = new HashSet<String>();
		hashSet.add("Ayumi");
		System.out.println(hashSet.add("ratan")); 
		System.out.println(hashSet.add("ratan")); // return is boolean
		hashSet.add("Jill");
		hashSet.add("Chris");
		hashSet.add("Ayumi");
		hashSet.add("Sheva");
		hashSet.add("Chris");
		System.out.println(hashSet);
		
		HashSet<Emp> hashSet2 = new HashSet<Emp>();
		hashSet2.add(new Emp(1, "Ayumi"));
		hashSet2.add(new Emp(2, "Michelle"));
		hashSet2.add(new Emp(3, "Jill")); 
		hashSet2.add(new Emp(4, "Sheva"));
		hashSet2.add(new Emp(5, "Chris"));
		hashSet2.add(new Emp(6, "Cereza"));
		System.out.println(hashSet2);
	}

}
