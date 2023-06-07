package com.ratanitjava.javaconcepts;

public class Employee {

	private int eid;
	private String name;
	
	public Employee(int eid, String name) {
		super();
		this.eid = eid;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + "]";
	}

	public static void main(String[] args) {
		Employee e1 = new Employee(101, "ratan");
		System.out.println(e1);
		System.out.println(e1.toString());
	}
	
}
