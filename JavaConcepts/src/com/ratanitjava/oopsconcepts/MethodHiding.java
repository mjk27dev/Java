package com.ratanitjava.oopsconcepts;

/**
 * @author Manoj Kumar
 *
 */
public class MethodHiding {
	
//	rule 9: It is possible to override only the instances methods in Java static methods are not possible to override
//	Method overriding only instance methods, method signatures must be same and method execution decided by the object.
//	Method Hiding  used for static methods, method signatures must be same and method execution decided by the class.

	public static void main(String[] args) {
		Children children = new Children();
		children.dragons();
	}

}

// Method Hiding - both child and parent should have static methods it can override
class Parents{
	static void dragons() {
		System.out.println("Caraxes");
	}
}
class Children extends Parents{
	static void dragons() {
		System.out.println("Syrax");
	}
}

//Method Hiding - instance method cannot override static method
//class Parents1{
//	static void dragons() {
//		System.out.println("Caraxes");
//	}
//}
//class Children1 extends Parents1{
//	 void dragons() {
//		System.out.println("Syrax"); //This instance method cannot override the static method from Parents1
//	}
//}

//Method Hiding - static method cannot override instance method
//class Parents2{
//	 void dragons() {
//		System.out.println("Caraxes");
//	}
//}
//class Children2 extends Parents2{
//	 static void dragons() {
//		System.out.println("Syrax"); //This static method cannot hide the instance method from Parents2
//	}
//}
