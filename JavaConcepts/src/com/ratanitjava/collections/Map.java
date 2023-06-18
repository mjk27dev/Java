package com.ratanitjava.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

/**
 * @author Manoj Kumar
 *
 */
public class Map {

	/* Map Interface is introduced in Java 1.2,which implements HashMap Class
	 * introduced in 1.2 and LinkedHashMap Class introduced in 1.4 and extends
	 * SortedMap introduced in 1.2 and SortedMap extends NavigableMap introduced in
	 * 1.6 and NavigableMap implements TreeMap introduced in 1.2.
	 */	
	
//	HashMap insertion order is not maintained and LinkedHashMap insertion order is maintained.
//  Map stores values in Key and Value pairs. Keys must be unique and Values contains duplicates
	
	/* HashMap is introduced in Java 1.2 
	 * HashMap allows heterogeneous data 
	 * HashMap allows Null Values 
	 * HashMap is not Synchronized
	 * HashMap insertion order is not preserved.
	 * HashMap underlying data structure is HashTable
	 * HashMap allows Keys must be unique and Values contains duplicates.
	 */
	
	/* The Below are the HashMap constructors 
	 * default initial Capacity is 16 and default load factor is 0.75
	 * 
	 * public java.util.HashMap(int, float);
	 * public java.util.HashMap(int); 
	 * public java.util.HashMap(); 
	 * public java.util.HashMap(java.util.Map<? extends K, ? extends V>);
	 */
	
	public static void main(String[] args) {
		
		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
		hashMap.put(1, "Caraxes");
		hashMap.put(2, "Drogon");
		hashMap.put(5, "Balerion");
		hashMap.put(6, "Vhagar");
		hashMap.put(3, "Balerion");
		hashMap.put(444, "Melys");
		hashMap.put(5, "Balerion");
		System.out.println(hashMap);
		
		Set<Integer> keySet = hashMap.keySet();
		System.out.println(keySet);
		
		java.util.Collection<String> collection =  hashMap.values();
		System.out.println(collection);
		
		Set<Entry<Integer, String>> s1 = hashMap.entrySet();
		for(Entry<Integer, String> e : s1) {
			System.out.println(e.getKey() +" "+e.getValue());
		}
       
		
	}

}
