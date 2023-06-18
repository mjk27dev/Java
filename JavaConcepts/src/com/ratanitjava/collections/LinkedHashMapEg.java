package com.ratanitjava.collections;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

/**
 * @author Manoj Kumar
 *
 */
public class LinkedHashMapEg {

	/* LinkedHashMap is introduced in Java 1.4
	 * LinkedHashMap allows heterogeneous data 
	 * LinkedHashMap allows Null Values 
	 * LinkedHashMap is not Synchronized
	 * LinkedHashMap insertion order is preserved.
	 * LinkedHashMap underlying data structure is HashTable LinkedList Implementation of Map
	 * LinkedHashMap allows Keys must be unique and Values contains duplicates.
	 */
	
	public static void main(String[] args) {
		
		LinkedHashMap<Empl, Stud> hashMap = new LinkedHashMap<Empl, Stud>();
		hashMap.put(new Empl(1, "Ayumi"), new Stud(1, "Michelle"));
		hashMap.put(new Empl(2, "Ellie"), new Stud(2, "Dina"));
		hashMap.put(new Empl(3, "Korra"), new Stud(3, "Asami"));
		hashMap.put(new Empl(4, "Leon"), new Stud(4, "Ashley"));
		
		Set<Empl> s = hashMap.keySet();
		for(Empl e: s) {
			System.out.println(e.eid+" "+e.ename);	
		}
		
		//or using directly write the keySet() in loop
		for(Empl ee: hashMap.keySet()) {
			System.out.println(ee.eid+" "+ee.ename);	
		}
		
		for(Stud s1 : hashMap.values()) {
			System.out.println(s1.sid+" "+s1.sname);
		}
	
		// Directly on the Map cannot apply cursor on set we can apply cursor, Cursors for Collection data not for map data
		Set<Entry<Empl, Stud>> entries = hashMap.entrySet();
		Iterator<Entry<Empl, Stud>> itr = entries.iterator();
		while (itr.hasNext()) {
			Entry<Empl, Stud> e = itr.next();
			Empl e1 = e.getKey();
			System.out.println( "Print Employee data " +e1.eid+ " "+ e1.ename);
			
			Stud ss = e.getValue();
			System.out.println("Print Student data " +ss.sid+" "+ss.sname);
		}
		
		LinkedHashMap<Integer, Product> hashMap2 = new LinkedHashMap<Integer, Product>();
		hashMap2.put(111, new Product(1, "Bicycle", 2000.00));
		hashMap2.put(222, new Product(2, "Pen", 30.00));
		hashMap2.put(333, new Product(3, "Chair", 300.00));
		hashMap2.put(444, new Product(4, "Car", 600000.00));
		hashMap2.put(555, new Product(4, "Car", 600000.00));
		
		   Set<Entry<Integer, Product>> entries2 =  hashMap2.entrySet();
		   Iterator<Entry<Integer, Product>> iterator = entries2.iterator();
		  
		   while (iterator.hasNext()) {
			Entry<Integer, Product> entry = iterator.next();
		    Integer integer = entry.getKey();
			System.out.println("Print Key " +integer);
			
			Product product = entry.getValue();
			if(product.productId == 1) {
			iterator.remove();
			}
			if(product.productName.equals("Pen")) {
				iterator.remove();
				
			}
			
		}
		   for(Entry<Integer, Product> entry3: hashMap2.entrySet()) {
			   Product p2 = entry3.getValue();
			   System.out.println("Print Values: "+p2.productId+" "+p2.productName+" "+p2.productCost);
		   }
				 
	}
}
