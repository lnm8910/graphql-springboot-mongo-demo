package com.atechie.io.demo.repository;

import com.atechie.io.demo.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
