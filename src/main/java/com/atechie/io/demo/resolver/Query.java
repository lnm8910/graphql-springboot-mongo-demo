package com.atechie.io.demo.resolver;

import com.atechie.io.demo.model.Author;
import com.atechie.io.demo.model.Book;
import com.atechie.io.demo.repository.AuthorRepository;
import com.atechie.io.demo.repository.BookRepository;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;

public class Query implements GraphQLQueryResolver {
    private BookRepository bookRepository;
    private AuthorRepository authorRepository;

    public Query(AuthorRepository authorRepository, BookRepository bookRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
    }

    public Iterable<Book> findAllBooks() {
        return bookRepository.findAll();
    }

    public Iterable<Author> findAllAuthors() {
        return authorRepository.findAll();
    }

    public long countBooks() {
        return bookRepository.count();
    }

    public long countAuthors() {
        return authorRepository.count();
    }
}
