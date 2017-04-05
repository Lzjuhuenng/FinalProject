package com.lzjuhuenng.enjoybooks.dao;

import com.lzjuhuenng.enjoybooks.pojo.BookType;

import java.util.List;

/**
 * Created by Administrator on 2017/4/5.
 */
public interface  BookTypeDao {
    int deleteBookTypeByID(Integer id);

    int insertBookType(BookType record);

    int insertSelective(BookType record);

    BookType selectBookTypeByID(Integer id);

    BookType selectBookTypeByAccount(String account);

    int updateByPrimaryKeySelective(BookType record);

    int updateByPrimaryKey(BookType record);

    List<BookType> findAllBookType();
}
