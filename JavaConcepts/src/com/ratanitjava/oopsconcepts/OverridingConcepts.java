package com.ratanitjava.oopsconcepts;

/**
 * @author Manoj Kumar
 *
 */
public class OverridingConcepts {

	/*
	 * Overriding Rule 5 and 6 
	 * 5. private methods are not possible to override,because private methods are specific to the classes. 
	 * 6. while overriding you can maintain the same level of permissions or increase the permission and not
	 * in decreasing order.
	 * Private Default Protected Public -> Modifiers lowest to highest order
     * Public Protected Default Private -> Modifiers highest to lowest order
	 * 
	 */	
	public static void main(String[] args) {
		ChildDragon childDragon = new ChildDragon();
		childDragon.drag();

		ChildDragons childDragons = new ChildDragons();
		childDragons.drag();
		
		ChildDragons1 childDragons1 = new ChildDragons1();
		childDragons1.drag();
		
//		ChildDragons2 childDragons2 = new ChildDragons2();
//		childDragons2.drag(); //Cannot reduce the visibility of the inherited method from ParentDragons2
	}

}
//rule 5
class ParentDragon{
	private void drag() {
		System.out.println("Vhagar");
	}
}

class ChildDragon extends ParentDragon{
     void drag() {
		System.out.println("Balerion");
	}
}

//rule 6 case 1: same level of permissions are valid

class ParentDragons{
	public void drag() {
		System.out.println("Vhagar");
	}
}

class ChildDragons extends ParentDragons{
	public void drag() {
		System.out.println("Balerion");
	}
}

//rule 6 case 2: increasing level of permissions are valid

class ParentDragons1{
	protected void drag() {
		System.out.println("Vhagar");
	}
}

class ChildDragons1 extends ParentDragons1{
	public void drag() {
		System.out.println("Balerion");
	}
}

//rule 6 case 3: decreasing level of permissions is invalid

//class ParentDragons2{
//	public void drag() {
//		System.out.println("Vhagar");
//	}
//}
//
//class ChildDragons2 extends ParentDragons2{
//	 void drag() {
//		System.out.println("Balerion");
//	}
//}