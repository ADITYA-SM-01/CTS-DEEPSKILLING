package com.library;

import com.library.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        var context = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookService bookService =  context.getBean("bookservice",BookService.class);
        bookService.getService();
    }
}
