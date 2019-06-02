package com.atechie.io.demo;

import com.atechie.io.demo.repository.AuthorRepository;
import com.atechie.io.demo.repository.BookRepository;
import com.atechie.io.demo.resolver.BookResolver;
import com.atechie.io.demo.resolver.Mutation;
import com.atechie.io.demo.resolver.Query;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class GraphqlSpringbootMongoDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(GraphqlSpringbootMongoDemoApplication.class, args);
    }

    @Bean
    public BookResolver authorResolver(AuthorRepository authorRepository) {
        return new BookResolver(authorRepository);
    }

    @Bean
    public Query query(AuthorRepository authorRepository, BookRepository bookRepository) {
        return new Query(authorRepository, bookRepository);
    }

    @Bean
    public Mutation mutation(AuthorRepository authorRepository, BookRepository bookRepository) {
        return new Mutation(authorRepository, bookRepository);
    }

}
