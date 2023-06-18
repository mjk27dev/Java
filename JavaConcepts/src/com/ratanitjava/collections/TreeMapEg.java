package com.ratanitjava.collections;

import java.util.Comparator;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/**
 * @author Manoj Kumar
 *
 */
public class TreeMapEg {

	/* TreeMap is introduced in Java 1.2
	 * TreeMap allows Homogeneous data and implements comparator, It will throw ClassCastException
	 * TreeMap not allows Null Values. It will throw NullPointerException 
	 * TreeMap is not Synchronized
	 * TreeMap insertion order is not preserved. It follows natural Order and it is automatically sort the data.
	 * TreeMap underlying data structure is Balanced tree.
	 * TreeMap allows Keys must be unique and Values contains duplicates.Sorting Based on Keys not values.
	 */
	public static void main(String[] args) {
		
		TreeMap<Integer, String> treeMap1 = new TreeMap<Integer, String>();
		treeMap1.put(1, "Ayumi");
		treeMap1.put(2, "Michelle");
		treeMap1.put(3, "Sky Guards");
		treeMap1.put(4, "Sky Islands");
		treeMap1.put(5, "Sky Docks");
		treeMap1.put(6, "Dragon Temple");
		System.out.println(treeMap1);// sorted based on Keys
	
		TreeMap<String, Integer > treeMap = new TreeMap<String, Integer>();
		treeMap.put("Ayumi", 1);
		treeMap.put("Michelle", 2);
		treeMap.put("Sky Guards", 3);
		treeMap.put("Sky Islands", 4);
		treeMap.put("Sky Docks", 5);
		treeMap.put("Dragon Temple", 6);
		System.out.println(treeMap);// sorted based on Keys
		
        //Adding One Map data into another Map.
        // 2 ways to add a Map Data
        //Constructor Approach -  public java.util.TreeMap(java.util.Map<? extends K, ? extends V>);
	    //putAll() Method
		
		//Constructor Approach
		TreeMap<String, Integer> treeMap2 = new TreeMap<String, Integer>();
		treeMap2.put("Manoj", 1);
		TreeMap<String, Integer> treeMap3 = new TreeMap<String, Integer>(treeMap2);
		treeMap3.put("ratan", 2);
		System.out.println(treeMap3);
		
		//putAll() Method
		TreeMap<String, Integer> treeMap5 = new TreeMap<String, Integer>();
		treeMap5.put("aaa", 1);
		TreeMap<String, Integer> treeMap6 = new TreeMap<String, Integer>();
		treeMap6.put("bbb", 2);
		
		TreeMap<String, Integer> treeMap4 = new TreeMap<String, Integer>();
		treeMap4.putAll(treeMap5);
		treeMap4.putAll(treeMap6);
		System.out.println(treeMap4);
		
		//Sorted Map Constructor - public java.util.TreeMap(java.util.SortedMap<K, ? extends V>);
		TreeMap<Integer, String> treeMap7 = new TreeMap<Integer, String>();
		treeMap7.put(1, "Ayumi");
		treeMap7.put(2, "Michelle");
		treeMap7.put(3, "Ellie");
		treeMap7.put(4, "Dina");
		treeMap7.put(5, "Abby");
		treeMap7.put(6, "Dragon Temple");
		System.out.println(treeMap7);
		
		SortedMap<Integer, String> smap = treeMap7.subMap(3, 6);
		TreeMap<Integer, String> map2 = new TreeMap<Integer, String>(smap);
		System.out.println(map2);
		
		SortedMap<Integer, String> smap2 = map2.tailMap(4);
		TreeMap<Integer, String> map4 = new TreeMap<Integer, String>(smap2);
		System.out.println(map4);
		
		SortedMap<Integer, String> smap3 = treeMap7.headMap(5);
		TreeMap<Integer, String> map6 = new TreeMap<Integer, String>(smap3);
		System.out.println(map6);
	
		//Comparator Constructor - public java.util.TreeMap(java.util.Comparator<? super K>);

		TreeMap<Integer, String> treeMap8 = new TreeMap<Integer, String>(new MyComp4());
		treeMap8.put(1, "Ayumi");
		treeMap8.put(2, "Michelle");
		treeMap8.put(3, "Ellie");
		treeMap8.put(4, "Dina");
		treeMap8.put(5, "Abby");
		treeMap8.put(6, "Dragon Temple");
		System.out.println(treeMap8);
		
		//Print the Product object in Descending Order
		TreeMap<Product, Integer> map = new TreeMap<Product, Integer>(new MyComp5());
		map.put(new Product(1, "bicycle", 3000.00), 111);
		map.put(new Product(2, "Car", 600000.00), 222);
		map.put(new Product(3, "Motor Cycle", 70000.00), 333);
		map.put(new Product(4, "Aeroplane", 90000.00), 444);
		
		 Set<Product> set1 = map.keySet();
		 for(Product p: set1) {
			 System.out.println(p.productId+" "+p.productName+" "+p.productCost);
		 }
	
		 
	}

}

class MyComp4 implements Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {
		
		return -o1.compareTo(o2);
	}
	
}	

class MyComp5 implements Comparator<Product>{

	@Override
	public int compare(Product o1, Product o2) {
		
		return -o1.compareTo(o2);
	}
	
}