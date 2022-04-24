package com.sunny.mongo.api.model;

import javax.annotation.Generated;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Document(collection = "Book")
public class Book {
	
	@Id
	private Long bookId;
	private String bookName;
	private String author;

}
