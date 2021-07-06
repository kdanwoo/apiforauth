package com.example.apiforauth.controller;

import com.example.apiforauth.entity.Book;
import com.example.apiforauth.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RequestMapping("/v1")
@RestController
@RequiredArgsConstructor
public class ApiController{

    private final BookService bookService;

    @GetMapping("/books")
    public List<Book> all(){
        return bookService.findAll();
    }




}

