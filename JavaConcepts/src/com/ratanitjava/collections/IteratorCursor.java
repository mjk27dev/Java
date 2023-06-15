package com.ratanitjava.collections;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author Manoj Kumar
 *
 */

//Iterator is unidirectional, used for remove operations

public class IteratorCursor {

	public static void main(String[] args) {
	
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("Ayumi");
		arrayList.add("Michelle");
		arrayList.add("Jill Valentine");
		arrayList.add("Sheva");
		
		Iterator<String> iterator = arrayList.iterator();
		while (iterator.hasNext()) {
			String string =  iterator.next();
		if(string.equals("Sheva")) {
			iterator.remove();
		}
		}
		System.out.println(arrayList);
	
		
		ArrayList<Book> arrayList2 = new ArrayList<Book>();
		arrayList2.add(new Book(1, "Harry Potter", "J.K. Rowling"));
		arrayList2.add(new Book(2, "Lord of the Rings: Return of the King", "J.R.R. Tolkien"));
		arrayList2.add(new Book(3, "Narnia", "C.S.Lewis"));
		arrayList2.add(new Book(4, "Game of Thrones", "George.R.R.Martin"));
		
		Iterator<Book> iterator2 = arrayList2.iterator();
		while (iterator2.hasNext()) {
			Book book= iterator2.next();
			if(book.id == 2) {
				iterator2.remove();
			}
			for(Book book1 : arrayList2) {
				System.out.println(book1.id+" "+book1.name+" "+book1.author);
			}
			
			}
		
		
	
	}

}
