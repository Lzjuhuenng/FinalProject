package com.lzjuhuenng.enjoybooks.service.impl;

import com.lzjuhuenng.enjoybooks.dao.BookmarkDao;
import com.lzjuhuenng.enjoybooks.dao.ShelfDao;
import com.lzjuhuenng.enjoybooks.pojo.Book;
import com.lzjuhuenng.enjoybooks.pojo.Bookmark;
import com.lzjuhuenng.enjoybooks.service.ShelfBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2017/4/18.
 */
@Service("shelfService")
public class ShelfBookServiceImpl implements ShelfBookService {

    @Autowired
    ShelfDao shelfDao;

    @Autowired
    BookmarkDao bookmarkDao;

    public List<Book> selectShelfBooks(int accountId, int beginRow, int pageSize) {

        return shelfDao.selectShelfBooks(accountId,beginRow,pageSize);

    }

    public Book getShelfBook(int bookId, int accountId) {

        Book book = shelfDao.selectBook(bookId,accountId);

        book.setBookmarkList(bookmarkDao.selectBookmarkByShelfId(book.getShelfId()));

        return book;
    }

    public void recordLastRead(Book book) {
        shelfDao.updateByPrimaryKeySelective(book);
    }

    public int selectCount(int accountId) {
        return shelfDao.selectCount(accountId);
    }
}
