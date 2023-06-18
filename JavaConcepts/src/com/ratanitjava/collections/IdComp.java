package com.ratanitjava.collections;

import java.util.Comparator;


/**
 * @author Manoj Kumar
 *
 */
public class IdComp implements Comparator<Product>{

	@Override
	public int compare(Product p1, Product p2) {
		if(p2.productId == p1.productId) {
		return 0;
		}
		else if(p2.productId > p1.productId) {
			return 1;
		}
		else {
			return -1;
		}
	}

}
