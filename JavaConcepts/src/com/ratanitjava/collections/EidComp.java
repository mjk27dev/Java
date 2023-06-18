package com.ratanitjava.collections;

import java.util.Comparator;

/**
 * @author Manoj Kumar
 *
 */
public class EidComp implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		Emp emp = (Emp) o1;
		Emp emp1 = (Emp) o2;
		if(emp.eid == emp1.eid) {
			return 0;	
		}
		else if(emp.eid>emp1.eid) {
			return 1;
		}
		else {
			return -1;
		}		
		
	}

	
}
