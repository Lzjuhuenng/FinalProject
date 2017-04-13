package com.lzjuhuenng.enjoybooks.dao;

import com.lzjuhuenng.enjoybooks.pojo.Book;
import org.apache.ibatis.annotations.Param;

/**
 * Created by Administrator on 2017/4/12.
 */
public interface ShelfDao {
    Book selectBook (@Param("bookId") int bookId,@Param("accountId") int accoutnId);

    void updateByPrimaryKeySelective(Book book);
}
