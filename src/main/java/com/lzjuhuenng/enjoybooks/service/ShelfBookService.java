package com.lzjuhuenng.enjoybooks.service;

import com.lzjuhuenng.enjoybooks.pojo.Book;

import java.util.List;

/**
 * Created by Administrator on 2017/4/18.
 */
public interface ShelfBookService {

    Book getShelfBook(int bookId, int accountId);

    List<Book> selectShelfBooks(int accountId, int beginRow, int pageSize);

    void recordLastRead(Book book);

    int selectCount(int accountId);
}
