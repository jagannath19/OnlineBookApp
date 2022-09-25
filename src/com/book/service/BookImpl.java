package com.book.service;

import java.util.ArrayList;
import java.util.List;

import com.book.bean.Book;
import com.book.exception.AuthorNotFoundException;
import com.book.exception.CategoryNotFoundException;

public class BookImpl implements BookInter {
	List<Book> bookList=new ArrayList<>();
	@Override
	public void addBook(Book book) {
			bookList.add(book);
			System.out.println("Book added successfully");
	}

	@Override
	public List<Book> getAllBooks() {
		
			return bookList;
	}

	@Override
	public List<Book> getBookbyAuthor(String author)  throws AuthorNotFoundException{
		List<Book> bookByAuthor=new ArrayList<>();
		for(Book book:bookList) {
			if(book.getAuthor().equalsIgnoreCase(author)) {
				bookByAuthor.add(book);
			}
		}
		
			if(bookByAuthor.isEmpty()) {
				throw new AuthorNotFoundException("Author not fouond");
			}
	
		return bookByAuthor;
	}

	@Override
	public List<Book> getBookbyCategory(String catagory) throws CategoryNotFoundException {
		
		List<Book> bookByCatagory=new ArrayList<>();
		for(Book book:bookList) {
			if(book.getCategory().equalsIgnoreCase(catagory)) {
				bookByCatagory.add(book);
			}
		}
		if(bookByCatagory.isEmpty()) {
			throw new CategoryNotFoundException("Category not found");
		}
		return bookByCatagory;
	}
	
	
	
}

