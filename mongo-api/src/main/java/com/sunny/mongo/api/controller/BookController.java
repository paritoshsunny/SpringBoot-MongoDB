package com.sunny.mongo.api.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sunny.mongo.api.model.Book;
import com.sunny.mongo.api.repository.BookRepository;

@RestController
public class BookController {
	
	@Autowired
	private BookRepository bookRepository;
	
	@PostMapping("/book")
	public Book saveBook(@RequestBody Book book) {
		return bookRepository.save(book);
	}
	
	@GetMapping("/book/{id}")
	public Optional<Book> getBook(@PathVariable Long id) {
		return bookRepository.findById(id);
	}
	
	@GetMapping("/books")
	public List<Book> getAllBooks(){
		return bookRepository.findAll();
	}

}
