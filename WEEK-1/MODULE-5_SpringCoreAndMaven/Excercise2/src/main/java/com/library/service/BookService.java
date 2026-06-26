package com.library.service;

import com.library.repository.BookRepository;

public class BookService {

    BookRepository bookRepository;

    //Setter Injection
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
        System.out.println("Setter Injection.. in BookService");
    }
    BookService(){
        System.out.println("BookService Constructor");
    }

}
