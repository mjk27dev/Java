package com.ratanitjava.interfaces;

public class MessageInterfaceImpleme extends MessageInterfaceImpl {

	@Override
	public void wish2() {
		System.out.println("Good Evening");
		
	}

	public static void main(String[] args) {
		MessageInterface messageInterface = new MessageInterfaceImpleme();
		messageInterface.wish1();
		messageInterface.wish2();
	}
}
