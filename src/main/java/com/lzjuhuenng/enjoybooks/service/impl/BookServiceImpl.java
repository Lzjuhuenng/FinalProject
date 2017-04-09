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

    public List<Book> selectByPage(int beginRow, int pageSize) {
        return bookDao.selectByPage(beginRow,pageSize);
    }

    public List<Book> SelectTypeBook(int typeId, int beginRow, int pageSize) {
        return null;
    }
}
