package com.library.service;

import com.library.repository.BookRepository;

public class BookService {
    BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
        System.out.println("Inside BookService constructor");
    }
    public void getService(){
        System.out.println("Inside BookService getService");
        bookRepository.showAllBooks();
    }
}
