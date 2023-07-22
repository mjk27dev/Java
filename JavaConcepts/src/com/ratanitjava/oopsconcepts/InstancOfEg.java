package com.ratanitjava.oopsconcepts;

public class InstancOfEg {

	public static void main(String[] args) {
		Animals animal = new Animals();
		Dogs dog = new Dogs();
		Pup pup = new Pup();
		
		System.out.println(animal instanceof Object);//true
		System.out.println(dog instanceof Animals);//true
		System.out.println(pup instanceof Dogs);//true
		
		System.out.println(animal instanceof Dogs);//false
		System.out.println(animal instanceof Pup);//false
	}
}

class Animals{
	
}
class Dogs extends Animals{
	
}
class Pup extends Dogs{
	
}