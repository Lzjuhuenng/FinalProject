package com.lzjuhuenng.enjoybooks.dao;

import com.lzjuhuenng.enjoybooks.pojo.Book;
import com.lzjuhuenng.enjoybooks.pojo.BookType;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by Administrator on 2017/4/5.
 */
public interface BookDao {
    public List<Book> getAllBook();
    public BookType getBookType(Integer typeId);
    List<Book> selectByPage(@Param("beginRow") int beginRow, @Param("pageSize") int pageSize);
    public int selectCount();
}
