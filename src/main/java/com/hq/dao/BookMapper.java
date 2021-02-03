package com.hq.dao;

import com.hq.pojo.Books;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BookMapper {
    //增加一本书
    int addBook(Books books);

    //删除一本书
    int deleteBookById(@Param("bId") int id);

    //更新一本书
    int updateBook(Books books);

    //查询一本书
    Books queryBookById(@Param("bId") int id);

    //查询全部的书
    List<Books> queryAllBook();

    //搜索查询
    List<Books> queryBook(@Param("bookName") String bookName);

}
