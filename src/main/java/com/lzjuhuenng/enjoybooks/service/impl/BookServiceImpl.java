package com.lzjuhuenng.enjoybooks.service.impl;

import com.lzjuhuenng.enjoybooks.dao.BookDao;
import com.lzjuhuenng.enjoybooks.pojo.Book;
import com.lzjuhuenng.enjoybooks.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2017/4/7.
 */
@Service
public class BookServiceImpl implements BookService {
    @Autowired
    BookDao bookDao;

    public List<Book> getBookList(){
        return bookDao.getAllBook();
    }

    public int selectCount(){
        return bookDao.selectCount();
    }

    public int selectCountWithSearch(String searchText) {
        return bookDao.selectCountWithSearch(searchText);
    }

    public int selectCountWithTypeIdAndSearch(int typeId, String searchText) {
        return bookDao.selectCountWithTypeIdAndSearch(typeId,searchText);
    }

    public List<Book> selectByPage(int beginRow, int pageSize) {
        return bookDao.selectByPage(beginRow,pageSize);
    }

    public List<Book> selectByPageWithSearch(String searchText, int beginRow, int pageSize) {
        return bookDao.selectByPageWithSearch(searchText,beginRow,pageSize);
    }

    public List<Book> selectByPageWithTypeIdAndSearch(int typeId, String searchText, int beginRow, int pageSize) {
        return bookDao.selectByPageWithTypeIdAndSearch(typeId,searchText,beginRow,pageSize);
    }

    public Book selectBookById(int bookId) {
        return bookDao.selectBookById(bookId);
    }
}
