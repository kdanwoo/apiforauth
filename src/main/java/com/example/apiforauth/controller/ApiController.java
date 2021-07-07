package com.example.apiforauth.controller;

import com.example.apiforauth.config.CommonConfig;
import com.example.apiforauth.entity.Book;
import com.example.apiforauth.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/v1")
@RestController
@RequiredArgsConstructor
public class ApiController{

    private final CommonConfig commonConfig;
    private final BookService bookService;

    @PostMapping("/books")
    public List<Book> all(){
        return bookService.findAll();
    }




}

