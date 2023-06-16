package com.ratanitjava.collections;

/**
 * @author Manoj Kumar
 *
 */

public class Product implements Comparable {

	int productId;
	String productName;
	Double productCost;
	
	public Product(int productId, String productName, Double productCost) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productCost = productCost;
	}

	@Override
	public int compareTo(Object o) {
		Product product = (Product) o;
		if(productId == product.productId) {
			return 0;
		}
		else if(productId > product.productId) {
		
			return 1;
		}
		else {
			return -1;
		}
		
		
	}
	
}
