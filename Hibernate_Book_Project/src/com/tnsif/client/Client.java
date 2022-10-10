package com.tnsif.client;

import com.tnsif.service.BookService;
import com.tnsif.service.BookServiceImplement;
import com.tnsif.entity.Book;

public class Client {

	public static void main(String[] args) {
		BookService service =new BookServiceImplement();
System.out.println(service.getBookById(101));
		
		System.out.println("*************************************");
		
		for(Book book:service.getBookByTitle("Java Closures and Lambda")) {
			System.out.println(book);
		}
		
		System.out.println("*************************************");
		
		System.out.println(service.getBookCount());
		
		System.out.println("****************************************");
		
		for(Book b:service.getAuthorbooks("Robert Fischer")){
			System.out.println(b);
		}
		
		System.out.println("**************************************");
		
		for(Book book:service.getAllBooks()) {
			System.out.println(book);
		}
		
		System.out.println("***************************************");
		
		for(Book book:service.getBooksInPriceRange(500, 600)) {
			System.out.println(book);
		}
		
	}

}