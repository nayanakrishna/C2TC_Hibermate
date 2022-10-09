package com.tnsif.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import com.tnsif.entity.Book;

public class BookDaoImplement implements BookDao  {

	private EntityManager entityManager;
	
	
	@Override
	public Book getBookById(int id) {
		Book book = entityManager.find(Book.class, id);
		return book;
	}

	@Override
	public List<Book> getBookByTitle(String title) {
		String qstr ="SELECT book FROM Book book WHERE book.title LIKE :ptitle";
		TypedQuery<Book> query = entityManager.createQuery(qstr, Book.class);
		query.setParameter("ptitle","%"+title+"%");
		return query.getResultList();
	}

	@Override
	public Long getBookCount() {
		String qstr ="SELECT COUNT(book.id) FROM Book book";
		TypedQuery<Long> query =entityManager.createQuery(qstr, Long.class);
		Long count = query.getSingleResult();
		return count;
	}

	@Override
	public List<Book> getAuthorBooks(String author) {
		String qstr="SELECT book FROM Book book WHERE book.author =:pAuthor";
		TypedQuery<Book> query = entityManager.createQuery(qstr, Book.class);
		query.setParameter("pAuthor", author);
		List<Book> bookList = query.getResultList();
		return bookList;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Book> getAllBooks() {
		Query query = entityManager.createNamedQuery("getAllBooks");
		List<Book> bookList = query.getResultList();
		return bookList;
	}

	@Override
	public List<Book> getBooksInPriceRange(double low, double high) {
		String qstr="SELECT book FROM Book WHERE book.price between :low and :high";
		TypedQuery<Book> query=entityManager.createQuery(qstr, Book.class);
		query.setParameter("low",low);
		query.setParameter("high", high);
		List<Book> bookList = query.getResultList();
		return bookList;
	
	}

}
