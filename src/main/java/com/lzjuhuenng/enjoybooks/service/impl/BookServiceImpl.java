package com.lzjuhuenng.enjoybooks.service.impl;

import com.lzjuhuenng.enjoybooks.dao.BookDao;
import com.lzjuhuenng.enjoybooks.dao.BookmarkDao;
import com.lzjuhuenng.enjoybooks.dao.ShelfDao;
import com.lzjuhuenng.enjoybooks.pojo.Book;
import com.lzjuhuenng.enjoybooks.pojo.Bookmark;
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
    @Autowired
    ShelfDao shelfDao;
    @Autowired
    BookmarkDao bookmarkDao;

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

    public boolean addBookToShelf(int bookId, int account) {
        return bookDao.insertBookToShlef(bookId,account) > 0;
    }

    public boolean isBookInShelf(int bookId, int accountId) {
        return bookDao.indexBookInShlef(bookId,accountId)>0;
    }

    public Book getShelfBook(int bookId, int accountId) {

        Book book = shelfDao.selectBook(bookId,accountId);

        book.setBookmarkList(bookmarkDao.selectBookmarkByShelfId(book.getShelfId()));

        return book;
    }

    public void recordLastRead(Book book) {
        shelfDao.updateByPrimaryKeySelective(book);
    }
}
