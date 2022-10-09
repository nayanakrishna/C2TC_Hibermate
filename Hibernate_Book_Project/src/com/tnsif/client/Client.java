package com.tnsif.client;

import com.tnsif.service.BookService;
import com.tnsif.service.BookServiceImplement;
import com.tnsif.entity.Book;

public class Client {

	public static void main(String[] args) {
		BookService service =new BookServiceImplement();
		
		System.out.println("************Listing total number of books*************");
		System.out.println("Total books:"+service.getBookCount());
		
		System.out.println("************Listing book with id 105*************");
		System.out.println("Boo with ID 106:"+service.getBookById(105));
		
		System.out.println("************Listing All books*************");
		for(Book book:service.getAllBooks()) {
			System.out.println(book);
		}

	}

}
