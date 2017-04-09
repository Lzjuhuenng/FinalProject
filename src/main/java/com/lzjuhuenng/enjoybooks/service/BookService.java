package com.lzjuhuenng.enjoybooks.service;

import com.lzjuhuenng.enjoybooks.pojo.Book;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2017/4/7.
 */
public interface BookService {
    public List<Book> getBookList();

    public int selectCount();

    public List<Book> selectByPage(int beginRow,int pageSize);

    public List<Book> SelectTypeBook(int typeId,int beginRow,int pageSize);
}
