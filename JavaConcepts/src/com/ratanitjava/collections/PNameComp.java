package com.ratanitjava.collections;

import java.util.Comparator;

/**
 * @author Manoj Kumar
 *
 */
public class PNameComp implements Comparator<Product> {

	@Override
	public int compare(Product p1, Product p2) {
		
		return - p1.productName.compareTo(p2.productName);
	}

}
