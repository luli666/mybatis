package com.offcn.mybatis.controller;

import com.offcn.mybatis.mapper.BookMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.sql.DataSource;
import java.awt.print.Book;
import java.util.List;

@Controller
@RequestMapping("/book")
public class BookController {
    @Resource
    private BookMapper  bookMapper;

    @RequestMapping("/list")
    public String test(Model model){
        List<Book> books = bookMapper.listBook();
        model.addAttribute("books", books);
        System.out.println(books);
        return "book";
    }
}
