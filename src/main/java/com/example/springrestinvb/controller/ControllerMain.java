package com.example.springrestinvb.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springrestinvb.entity.Books;

@RestController
public class ControllerMain {

   @GetMapping("/books")
   public Books getBooks(){

    Books book = new Books();
    book.setId(10);
    book.setAddress("grd");
book.setName("brahm");
return book;
   }
    
}
