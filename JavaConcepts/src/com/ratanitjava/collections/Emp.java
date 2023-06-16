package com.ratanitjava.collections;

/**
 * @author Manoj Kumar
 *
 */

public class Emp implements Comparable<Emp>{

	int eid;
	String name;
	
	public Emp(int eid, String name) {
		super();
		this.eid = eid;
		this.name = name;
	}

	@Override
	public int compareTo(Emp e) {
		
		return name.compareTo(e.name);// compare using Emp Object
	}

	@Override
	public String toString() {
		return "Emp [eid=" + eid + ", name=" + name + "]";
	}

//	@Override//compare using Object class
//	public int compareTo(Object o) {
//		Emp e = (Emp) o;
//		if(eid == e.eid) {
//			return 0;	
//		}
//		else if(eid>e.eid) {
//			return 1;
//		}
//		else {
//			return -1;
//		}		
//	}
	
	
	
	


}

	

