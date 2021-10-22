package com.springexample.springdemo.Services;

import com.springexample.springdemo.model.Books;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookServiceImplement implements BookService{

    List<Books> booksList = new ArrayList<>();

    /***
     * Implementing the getBooks() function of BookService interface by overriding and
     * Adding the Book details in the List using setters methods of Books class
     * @return booksList
     */

    public List<Books> getBooks() {

        Books book1 = new Books("abc", "efgh",738);
        booksList.add(book1);

        Books book2 = new Books("efg", "kwjs",829);
        booksList.add(book2);

        Books book3 = new Books("hij","kuhas", 7362);
        booksList.add(book3);

        return booksList;
    }
}
