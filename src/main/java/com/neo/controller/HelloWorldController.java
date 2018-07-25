package com.neo.controller;

import com.neo.dao.BookBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @Value(value = "${book.author}")
    private String bookAuthor;
    @Value("${book.name}")
    private String bookName;
    @Value("${book.pinyin}")
    private String bookPinYin;

    @Autowired
    private BookBean bookBean;
    @RequestMapping("/books")
    public String book() {
        return "Hello Spring Boot! The BookName is "+bookBean.getName()+";and Book Author is "+bookBean.getAuthor()+";and Book price is "+bookBean.getPrice();
    }
    @RequestMapping(value = "/")
    String index2(){
        return "Hello Spring Boot! The BookName is "+bookName+";and Book Author is "+bookAuthor+";and Book PinYin is "+bookPinYin;
    }
	
    @RequestMapping("/hello")
    public String index() {
        return "Hello World!!!";
    }
}