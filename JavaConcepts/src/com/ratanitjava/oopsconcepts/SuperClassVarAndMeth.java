package com.ratanitjava.oopsconcepts;

public class SuperClassVarAndMeth {
	
		int a = 10, b = 20;
	}
	class Childrens extends SuperClassVarAndMeth{
		int x = 100, y = 200;
		void add(int i, int j) {
			System.out.println(i+j);
			System.out.println(x+y);
			System.out.println(a+b);
		}
		public static void main(String[] args) {
			Childrens children = new Childrens();
			children.add(1000, 2000);
		}
	}

	class Parents3 {
		
		int a = 10, b = 20;
	}
	class Children3 extends Parents3{
		int a = 100, b = 200;
		void add(int a, int b) {
			System.out.println(a+b);
			System.out.println(this.a+this.b);
			System.out.println(super.a+super.b);
		}
		public static void main(String[] args) {
			Childrens children = new Childrens();
			children.add(1000, 2000);
		}
	}
	
	class Parents4{
		void m1() {
			System.out.println("parent m1()");
		}
	}
	class Children4 extends Parents4 {
		void m1() {
			System.out.println("Child m1()");
		}
	void m2() {
		this.m1();
	super.m1();
	}
	public static void main(String...strings) {
		Children4 children4 = new Children4();
		children4.m2();
	}
	}
