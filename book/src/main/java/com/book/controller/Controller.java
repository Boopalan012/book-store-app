package com.book.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.book.model.Book;
import com.book.service.BookService;

//rest api
@RestController

//default url for all in this controller
@RequestMapping("/api")
public class Controller {
	
	@Autowired 
	BookService BookService;
	
	//show all book
	@GetMapping("/book")  
	 
	private List<Book> getAllBooks()   
	{  
    System.out.println("method from get all books");
	return BookService.getAllBooks(); 

	}
	
	
	//create a book
	@PostMapping("/book")
	private String saveBook(@RequestBody Book book)   
	{  
	BookService.save(book);  
	//return book.getBookId();  
	return "saved";
	}  
	
	//one book retrive 
	@GetMapping("/book/{bookid}")  
	private Book getBooks(@PathVariable ("bookid") int bookid)   
	{  
	return BookService.getBooksById(bookid);  
	}  
	
	//delete
	@DeleteMapping("/book/{bookid}")  
	private String deleteBook(@PathVariable("bookid") int bookid)   
	{  
	BookService.delete(bookid);  
	return "deleted";
	}
	
	
	//update
	//upadate
	
	
		@PutMapping("/book") 
		private Book update(@RequestBody Book books)   
		{  
		BookService.save(books);  
		return books;  
		}  

		}  
	
	
