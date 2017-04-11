package com.lzjuhuenng.enjoybooks.service.impl;

import com.lzjuhuenng.enjoybooks.dao.BookTypeDao;
import com.lzjuhuenng.enjoybooks.pojo.BookType;
import com.lzjuhuenng.enjoybooks.service.BookTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2017/4/9.
 */
@Service
public class BookTypeServiceImpl implements BookTypeService {
    @Autowired
    BookTypeDao bookTypeDao;

    public List<BookType> getAllBookType() {
        return bookTypeDao.getAllBookType();
    }
}
