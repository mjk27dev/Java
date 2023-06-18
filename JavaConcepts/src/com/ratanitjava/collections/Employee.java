package com.ratanitjava.collections;

import java.io.Serializable;

/**
 * @author Manoj Kumar
 *
 */
public class Employee implements Serializable {

	int eid;
	/*
	 * if it is defined as transient the variable is not participate in
	 * serialization. Instead of original values the default values is transfered.
	 * default values is Null
	 */

	transient String name;	
	public Employee(int eid, String name) {
		super();
		this.eid = eid;
		this.name = name;
	}
	
	
}
