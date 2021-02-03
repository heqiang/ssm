package com.hq.service;

import com.hq.dao.BookMapper;
import com.hq.pojo.Books;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


public class BookServiceImpl implements BookService {


    private BookMapper bookMapper;

    public void setBookMapper(BookMapper bookMapper) {
        this.bookMapper = bookMapper;
    }

    @Override
    public int addBook(Books books) {

        return bookMapper.addBook(books);
    }

    @Override
    public int deleteBookById(int id) {
        return bookMapper.deleteBookById(id);

    }

    @Override
    public int updateBook(Books books) {
        return bookMapper.updateBook(books);

    }

    @Override
    public Books queryBookById(int id) {
        return bookMapper.queryBookById(id);

    }

    @Override
    public List<Books> queryAllBook() {
        return bookMapper.queryAllBook();

    }

    @Override
    public List<Books> queryBook(String bookName) {
        return bookMapper.queryBook(bookName);
    }
}
