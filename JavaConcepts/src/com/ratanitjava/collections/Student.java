package com.ratanitjava.collections;

import java.io.Serializable;

/**
 * @author Manoj Kumar
 *
 */

public class Student implements Serializable {

	int sid;
	String sname;
	
	public Student(int sid, String sname) {
		super();
		this.sid = sid;
		this.sname = sname;
	}

	
	
}
