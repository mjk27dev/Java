package com.ratanitjava.collections;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * @author Manoj Kumar
 *
 */
public class TreeSetEg {
	
	/* 1. TreeSet is introduced in 1.2
	 * 2. It allows homogeneous data and implements Comparable interface which is having a method compareTo() if the heterogeneous
	 * data is provided it will generate ClassCastException.
	 * 3. Null insertion not allowed 
	 * 4. Duplicates are not allowed
	 * 5. Insertion order is not maintained and it prints in sorted order using natural sorting and it maintains ascending order.
	 * 6. It is Not Synchronized
	 * 7. TreeSet's Underlying data structure is balanced tree
	 * 8. Iterator Cursor is only applicable.
	 */
	
	/* Constructor and Description 
	 * TreeSet() Constructs a new, empty tree set,
	 * sorted according to the natural ordering of its elements.
	 * TreeSet(Collection<? extends E> c) Constructs a new tree set containing the
	 * elements in the specified collection, sorted according to the natural
	 * ordering of its elements. 
	 * TreeSet(Comparator<? super E> comparator)
	 * Constructs a new, empty tree set, sorted according to the specified
	 * comparator. 
	 * TreeSet(SortedSet<E> s) Constructs a new tree set containing the
	 * same elements and using the same ordering as the specified sorted set.
	 */
	
	public static void main(String[] args) {

		TreeSet<String> treeSet = new TreeSet<String>();
		treeSet.add("Leon Keneddy");
		treeSet.add("Ayumi");
		treeSet.add("Michelle");
		treeSet.add("Ashley");
		treeSet.add("Jill Valentine");
		treeSet.add("Ellie");
        System.out.println(treeSet);		
        
        TreeSet<Integer> treeSet2 = new TreeSet<Integer>();
        treeSet2.add(10);
        treeSet2.add(2);
        treeSet2.add(3);
        treeSet2.add(15);
        treeSet2.add(19);
        treeSet2.add(17);
        treeSet2.add(23);
        treeSet2.add(100);
        System.out.println(treeSet2);
        
        TreeSet set = new TreeSet();
        set.add(10);
//      set.add("Ayumi");
//      System.out.println(set);// java.lang.ClassCastException, doesn't allow heterogeneous data
        
        TreeSet set1 = new TreeSet();
        set1.add("Ayumi");
//      set1.add(null);
//      System.out.println(set1);// java.lang.NullPointerException, doesn't allow null values
        
        // Prints the data in descending order using Comparator constructor
        TreeSet<String> set2 = new TreeSet<String>(new MyComparator());
        set2.add("Ayumi");
        set2.add("Ellie");
        set2.add("Joel");
        set2.add("Dina");
        System.out.println(set2);
        
        // Prints the data in descending order using Comparator constructor
        TreeSet<Integer> treeSet3 = new TreeSet<Integer>(new MyComp1());
        treeSet3.add(10);
        treeSet3.add(2);
        treeSet3.add(3);
        treeSet3.add(15);
        treeSet3.add(19);
        treeSet3.add(17);
        treeSet3.add(23);
        treeSet3.add(100);
        System.out.println(treeSet3);
        
        TreeSet<Product> products = new TreeSet<Product>(new MyComp());
        products.add(new Product(1, "Chair", 100.56));
        products.add(new Product(2, "Pen", 100.56));
        products.add(new Product(3, "Water Bottle", 300.56));
        products.add(new Product(4, "Phone", 10000.56));
        
        for(Product p: products) {
        	System.out.println(p.productId+" "+p.productName+" "+p.productCost);
        }
        
        TreeSet<Integer> treeSet1 = new TreeSet<Integer>();
        for(int i=1; i<=10;i++) {
        	treeSet1.add(i);
        }
        System.out.println(treeSet1);
        
        SortedSet<Integer> sortedSet = treeSet1.subSet(3, 7);
        TreeSet<Integer> treeSet4 = new TreeSet<Integer>(sortedSet);
        System.out.println(treeSet4);	
        
       SortedSet<Integer> sortedSet2 = treeSet1.tailSet(4);
       TreeSet<Integer> treeSet5 = new TreeSet<Integer>(sortedSet2);
       System.out.println(treeSet5);
	
       SortedSet<Integer> sortedSet3 = treeSet1.headSet(6);
       TreeSet<Integer> treeSet6 = new TreeSet<Integer>(sortedSet3);
       System.out.println(treeSet6);
         
	}

}

class MyComp1 implements Comparator<Integer>{

	@Override
	public int compare(Integer i1, Integer i2) {
		return - i1.compareTo(i2);
	}
}
	class MyComp implements Comparator<Product>{

		@Override
		public int compare(Product p1, Product p2) {
			return -p1.productName.compareTo(p2.productName);
		}
	
}
