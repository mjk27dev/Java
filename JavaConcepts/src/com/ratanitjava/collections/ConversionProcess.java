package com.ratanitjava.collections;


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/**
 * @author Manoj Kumar
 *
 */

public class ConversionProcess {

	public static void main(String[] args) {
		
		//Conversion of Arrays to collections
		
		String[] strings = {"aaa","bbb","ccc"};
		
		ArrayList<String> arrayList = new ArrayList<String>(Arrays.asList(strings));
		arrayList.add("Ayumi");
		arrayList.add("Jill");
		System.out.println(arrayList);
		
		//conversion of collections to arrays
		ArrayList<String> arrayList2 = new ArrayList<String>();
		arrayList2.add("Ayumi");
		arrayList2.add("Jill");
		
		String[] strings2 = new String[arrayList2.size()];
		arrayList2.toArray(strings2);
		for(String s : strings2) {
			System.out.println(s);
		}
		
		//conversion of normal collection to arrays
		ArrayList arrayList3 = new ArrayList<>();
		arrayList3.add("ratan");
		arrayList3.add("Michelle");
		arrayList3.add(10);
		Object[] o = arrayList3.toArray();
		for(Object obj: o) {
			System.out.println(obj);
			
//	    if the generic collection we can directly create a string array and convert using toArray() and normal collection cannot create
//		the string array because it contains hetrogeneous data in that case we can use object Array, two toArray() methods with and without arguments
		
//			toArray(arguments) - generic version of collection
//			toArray() - without arguments - normal collections
		
			
		}

	}

}
