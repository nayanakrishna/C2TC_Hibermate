package com.tnsif.service;

import java.util.List;

import com.tnsif.dao.BookDao;
import com.tnsif.dao.BookDaoImplement;
import com.tnsif.entity.Book;

public class BookServiceImplement implements BookService {

	private BookDao dao;
	
	public BookServiceImplement() {
		dao=new BookDaoImplement();
	}

	@Override
	public Book getBookById(int id) {
		// TODO Auto-generated method stub
		return dao.getBookById(id);
	}

	@Override
	public List<Book> getBookByTitle(String title) {
		// TODO Auto-generated method stub
		return dao.getBookByTitle(title);
	}

	@Override
	public Long getBookCount() {
		// TODO Auto-generated method stub
		return dao.getBookCount();
	}

	@Override
	public List<Book> getAuthorbooks(String author) {
		// TODO Auto-generated method stub
		return dao.getAuthorBooks(author);
	}

	@Override
	public List<Book> getAllBooks() {
		// TODO Auto-generated method stub
		return dao.getAllBooks();
	}

	@Override
	public List<Book> getBooksInPriceRange(double low, double high) {
		// TODO Auto-generated method stub
		return dao.getBooksInPriceRange(low, high);
	}
	
	
}
