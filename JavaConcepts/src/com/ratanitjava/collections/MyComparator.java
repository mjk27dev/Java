package com.ratanitjava.collections;

import java.util.Comparator;

/**
 * @author Manoj Kumar
 *
 */
public class MyComparator implements Comparator<String> {

	@Override
	public int compare(String s1, String s2) {
		
		return - s1.compareTo(s2);
	}

	
}
