package com.book.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.book.model.Book;
import com.book.repositary.BookRepositary;

@Service
public class BookService {
	
	
	@Autowired
	private BookRepositary bookRepository;
	
	
	public List<Book> getAllBooks() {
	    List<Book> books = new ArrayList<>();
	    for (Book book : bookRepository.findAll()) {
	        books.add(book);
	    }
	    return books;
	}


	public void save(Book book) {
		// TODO Auto-generated method stub
		bookRepository.save(book);
		
	}  


	public Book getBooksById(int bookid) {
		// TODO Auto-generated method stub
		return bookRepository.findById(bookid).get();
	}


	public void delete(int bookid) {
		// TODO Auto-generated method stub
		bookRepository.deleteById(bookid);
		
	}
	
	public void update(Book book)   
	{  
	int bookid=book.getBookId();
	Book bdb=bookRepository.findById(bookid).get();
	bookRepository.delete(bdb);
	bookRepository.save(book);
	}


	
	
	



}
