package com.springexample.springdemo.Services;

import com.springexample.springdemo.model.Books;

import java.util.List;

public interface BookService {

    /***
     * Interface of Service class of book to get book details like name, author name, price
     * @return
     */
    public List<Books> getBooks();

    static int countNumber(){
        int count=0;
        return count+1;
    }


}
