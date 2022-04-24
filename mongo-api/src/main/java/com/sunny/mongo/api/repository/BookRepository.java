package com.sunny.mongo.api.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.sunny.mongo.api.model.Book;

public interface BookRepository extends MongoRepository<Book, Long>{

}
