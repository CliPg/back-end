package com.clipg.controller;

import com.clipg.domain.Book;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    @PostMapping
    public String save(@RequestBody Book book){
        System.out.println("book save:" + book);
        return "{'module':'book save success'}";
    }

    @GetMapping
    public List<Book> getAll(){
        System.out.println("book getAll");
        List<Book> books = new ArrayList<Book>();

        Book book1 = new Book();
        book1.setType("cs");
        book1.setName("springmvc");
        book1.setDescription("666");

        Book book2 = new Book();
        book2.setType("se");
        book2.setName("springmvc");
        book2.setDescription("666");

        books.add(book1);
        books.add(book2);

        return books;
    }


}
