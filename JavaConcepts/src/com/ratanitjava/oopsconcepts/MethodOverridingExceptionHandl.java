package com.ratanitjava.oopsconcepts;

public class MethodOverridingExceptionHandl {

	/*
	 * 7. Overridden method does not contains any exception and the overriding method
	 * can throws only unchecked exception but not checked exception
	 * 8. The parent method throws exception and child class method doesn't throws any exception no issues and it is valid
	 *    The parent method throws exception and child class method throws the same exception no issues and valid
	 *    The parent method throws Parent exception(Exception) and child class method throws the same exception no issues and valid - it is called subclass exception
	 *    The parent method throws Child exception and child class method throws the Parent exception(Exception) it is invalid - it is called subclass exception
	 *    
	 */
	
	public static void main(String[] args) {
	 
		ChildExc childExc = new ChildExc();
		childExc.mrg();
		
		ChildExcpt1 childExcpt1 = new ChildExcpt1();
		childExcpt1.mrg();
		
		ChildExcpt2 childExcpt2 = new ChildExcpt2();
		childExcpt2.mrg();
	}

}
//rule7 case1 
class ParentExc{
	void mrg(){
		
	}
}
class ChildExc extends ParentExc{
	void mrg() {
		
	}
}
//rule7 case2 - overridden metho does not throw InterruptedException
//class ParentExcp{
//	void mrg(){
//		
//	}
//}
//class ChildExcp extends ParentExcp{
//	void mrg() throws InterruptedException {
//		Thread.sleep(1000);
//	}
//}

//rule 8 case1 - no exception in overriding method

class ParentExcpt{
	void mrg() throws InterruptedException{
		Thread.sleep(1000);
	}
}
class ChildExcpt extends ParentExcpt{
	void mrg() {
		System.out.println(" case 1 Interrupted Exception");
	}
}

//rule 8 case2 - both methods throw the same exception

class ParentExcpt1{
	void mrg() throws ArithmeticException{
		System.out.println(" case 2 Arithmetic Exception");
	}
}
class ChildExcpt1 extends ParentExcpt1{
	void mrg() throws ArithmeticException {
		System.out.println(" case 2 Arithmetic Exception");
	}
}

//rule 8 case3 - Parent throws parentException and child throws subException - valid

class ParentExcpt2{
	void mrg() throws Exception{
		
	}
}
class ChildExcpt2 extends ParentExcpt2{
	void mrg() throws ArithmeticException {
		System.out.println("Case 3 Arithmetic Exception");
	}
}

//rule 8 case4 - Parent throws subException and child throws parentException - invalid

//class ParentExcpt3{
//	void mrg() throws ArithmeticException{
//		
//	}
//}
//class ChildExcpt3 extends ParentExcpt{
//	void mrg() throws Exception {
//		
//	}// overridden methods does not Throw Exception
//}