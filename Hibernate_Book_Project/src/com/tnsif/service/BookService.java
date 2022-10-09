package com.tnsif.service;

import java.util.List;

import com.tnsif.entity.Book;

public interface BookService {


	public abstract Book getBookById(int id);
	
	public abstract List<Book> getBookByTitle(String title);
	
	public abstract Long getBookCount();
	
	public abstract List<Book> getAuthorbooks(String author);
	
	public abstract List<Book> getAllBooks();
	
	public abstract List<Book> getBooksInPriceRange(double low, double high);

	//public abstract String getBookById(int id);
}

