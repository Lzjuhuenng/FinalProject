package com.lzjuhuenng.enjoybooks.dao;

import com.lzjuhuenng.enjoybooks.pojo.Book;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by Administrator on 2017/4/12.
 */
public interface ShelfDao {
    Book selectBook (@Param("bookId") int bookId,@Param("accountId") int accoutnId);

    void updateByPrimaryKeySelective(Book book);

    List<Book> selectShelfBooks(@Param("accountId") int accountId,@Param("beginRow") int beginRow,@Param("pageSize") int pageSize);

    int selectCount(@Param("accountId") int accountId);
}
