package com.ratanitjava.collections;


import java.util.ArrayList;
import java.util.Collections;

/**
 * @author Manoj Kumar
 *
 */

public class SwapCollections {

	public static void main(String[] args) {
		
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("Ayumi");
		arrayList.add("Michelle");
		arrayList.add("Zero");
		arrayList.add("Sky Guards");
		System.out.println("Before Swapping: " +arrayList);
		
		//Swap the data from one position to another position
		Collections.swap(arrayList, 0, 3);
		
		System.out.println("After Swapping: "+arrayList);

		//subList is to take a sublist of the existing arraylist and print as a new list
		ArrayList<String> arrayList2 = new ArrayList<String>(arrayList.subList(1, 4));
		System.out.println(arrayList2);
		
	}

}
