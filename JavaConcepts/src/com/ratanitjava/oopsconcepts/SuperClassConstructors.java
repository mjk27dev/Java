package com.ratanitjava.oopsconcepts;

public class SuperClassConstructors {

	SuperClassConstructors(){
		System.out.println("parent 0 args constructor");
	}
}

// call to super must be first statement in the constructor
class Childs extends SuperClassConstructors{
	
	Childs(){
		this(10);
		System.out.println("child 0 args constructor");
	}
	Childs(int a){
		super();
		System.out.println("child 1 args constructor");
//      super();
	}
	
	public static void main(String[] args) {
		Childs child = new Childs();
		
	}
}



class Parents6 {

	Parents6(){
		System.out.println("parent 0 args constructor");
	}
}

//if super() is not provided, the compiler will generate the super keyword.
class Childs5 extends Parents6{
	
	Childs5(){
		//super(); //compiler generated code
		System.out.println("child 0 args constructor");
	}
	Childs5(int a){
		//super(); //compiler generated code
		System.out.println("child 1 args constructor");
	}
	
	public static void main(String[] args) {
		Childs5 child = new Childs5();
		Childs5 child1 = new Childs5(10);
		
	}
}


class Parents7 {

	Parents7(int a){
		System.out.println("parent 1 args constructor");
	}
}

//Implicit super constructor Parents7() is undefined. Must explicitly invoke another constructor
class Childs7 extends Parents7{
	
//	Childs7(){
//		System.out.println("child 0 args constructor");// throws error
//	}
	Childs7(int a){
		
		super(10);
		System.out.println("child 1 args constructor");
	}
	
	public static void main(String[] args) {
		Childs7 childs7 = new Childs7(10);
		
	}
}


