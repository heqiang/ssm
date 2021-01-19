package com.hq.controller;

import com.hq.pojo.Books;
import com.hq.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/book")
public class BookController {
    @Autowired
    private BookService bookService;

    @RequestMapping("/allBook")
    public String boo_list(Model model){
        List<Books> books = bookService.queryAllBook();
        model.addAttribute("list",books);
        return "Allbooks";
    }
    @RequestMapping("/toAddBook")
    public  String toAddBook(){
        return  "addBook";
    }
    @RequestMapping("addBook")
    public  String AddBook(Books books){
        bookService.addBook(books);
        return  "redirect:/book/allBook";
    }
    @RequestMapping("/del/{bookid}")
    public  String delBook(@PathVariable("bookid")int id){
        bookService.deleteBookById(id);
        return  "redirect:/book/allBook";
    }
    @RequestMapping("/toUpdateBook")
    public  String toUpdateBook(Model  model, int id){
        Books books = bookService.queryBookById(id);
        model.addAttribute("book",books);
        return "update";
    }
    @RequestMapping("/updateBook")
    public String updateBook(Model  model ,Books book){
        bookService.updateBook(book);
        //更新mode中的book
        Books books = bookService.queryBookById(book.getBookID());
        model.addAttribute("book",books);
        return "redirect:/book/allBook";
    }

    @RequestMapping("/queryBook")
    public  String queryBook(String queryBookName,Model model){
        System.out.println(queryBookName);
        List<Books> books = bookService.queryBook(queryBookName);
        model.addAttribute("list",books);
        return "Allbooks";

    }
}
