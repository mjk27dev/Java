package com.ratanitjava.collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

/**
 * @author Manoj Kumar
 *
 */
public class LinkedListEg {

	/*
	 * Linked list introduced in Java 1.2 and it allows heterogeneous data is allowed.
	 * It allows Null and Duplicate values. All List classes ArrayList,
	 * Vector,stack,LinkedList allow duplicates. It maintains insertion order and it
	 * is not synchronized. In linkedList the data is stored in the format of doubly linked list and 
	 * the underlying data structure is doubly linked list.
	 */
	
	/*In Insertion of Arraylist require more shift operation which decreases the
	 *performance. ArrayList searching operation based on index.
	 *Memory consumption is Low. Arraylist and vector is implementing randomAccess Interface which having the data access is high
	 * 
	 * Linkedlist the removal of one link is sufficient is insert the data. It traverse through all elements while searching
	 * Memory consumption is high.Linkedlist is not implementing randomAccess Interface which having the data access is Low.
	 */
	public static void main(String [] args) {
		
		LinkedList<String> linkedList = new LinkedList<String>();
		linkedList.add("Ayumi");
		linkedList.add("Michelle");
		linkedList.add("Jill");
		linkedList.add("Chris");
		System.out.println(linkedList);
		
		linkedList.addFirst("Blades of Time");
		linkedList.addLast("Sheva");
		System.out.println(linkedList);
		System.out.println(linkedList.size());
		
		linkedList.add(2, "Leon");
		linkedList.add(2, "Ashley");
		System.out.println(linkedList);
		
		linkedList.set(5, "Jill Valentine");// used for replacement
		linkedList.remove("Leon");
		linkedList.remove(2);
		System.out.println(linkedList);
		System.out.println(linkedList.isEmpty());
		linkedList.clear();
		System.out.println(linkedList.isEmpty());
		
		LinkedList<String> linkedList1 = new LinkedList<String>();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the String: "+"\n");
		String  string = scanner.nextLine();
		linkedList1.add(string);
		System.out.println(linkedList1);
		scanner.close();
		
		LinkedList<Book> books = new LinkedList<Book>();
		books.add(new Book(1, "Fire and Blood","George R.R.Martin"));
		books.add(new Book(2, "Naruto","Masashi Kishimoto"));
		books.add(new Book(3, "Hobbit","J.R.R Tolkein"));
		books.add(new Book(4, "Game of Thrones","George R.R.Martin"));
		books.add(new Book(5, "C Language","Ratan"));
		System.out.println(books);
		
		Iterator<Book> iterator =  books.iterator();
		while (iterator.hasNext()) {
			Book book = iterator.next();
			if(book.name.equals("C Language")) {
				iterator.remove();
			}
					}
		for(Book b: books) {
			System.out.println(b.id+" "+b.name+" "+b.author);
		}

		ListIterator<Book> iterator2 = books.listIterator();
		iterator2.add(new Book(5, "Java By Ratan", "Ratan"));//always added in the first position
		iterator2.add(new Book(6, "C Language", "Ratan"));//removed
		
		while (iterator2.hasPrevious()) {
			Book book = iterator2.previous();
			if(book.id==6) {
				iterator2.remove();
			}
			
		}  
	
		for(Book b2: books) {
			System.out.println("List Iterator: "+ b2.id+" "+b2.name+" "+b2.author);
		}
	
	}

}
