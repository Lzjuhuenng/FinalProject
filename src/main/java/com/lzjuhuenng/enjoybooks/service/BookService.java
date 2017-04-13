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

    public int selectCountWithSearch(String searchText);

    public int selectCountWithTypeIdAndSearch(int typeId , String searchText);

    public List<Book> selectByPage(int beginRow,int pageSize);

    public List<Book> selectByPageWithSearch(String searchText,int beginRow,int pageSize );

    public List<Book> selectByPageWithTypeIdAndSearch(int typeId , String searchText,int beginRow,int pageSize);

    public Book selectBookById(int BookId);

    public boolean addBookToShelf(int bookId,int accountId);

    boolean isBookInShelf(int bookId,int accountId);

    Book getShelfBook(int bookId,int accountId);

    void recordLastRead(Book book);
}
