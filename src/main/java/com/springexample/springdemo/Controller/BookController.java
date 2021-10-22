package com.springexample.springdemo.Controller;

import com.springexample.springdemo.Services.BookService;
import com.springexample.springdemo.Services.BookServiceImplement;
import com.springexample.springdemo.model.Books;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookController {

    @Autowired
    private BookServiceImplement bookServiceImplement;
    List<Books> bookList;

    /***
     * Retrieving the book details by calling the function from BookService Interface using bookServiceImplement object
     * @return bookList
     */
    @GetMapping("/getbooks")
    public List<Books> getBooks(){
        bookList = bookServiceImplement.getBooks();
        return  bookList;
    }

    /***
     * (Test function)Calling the Static function of BookService Interface using interfaceName.functionName
     * @return count
     */
    @GetMapping("/count")
    public int countStaticFunction()
    {
        return BookService.countNumber();
    }

}
