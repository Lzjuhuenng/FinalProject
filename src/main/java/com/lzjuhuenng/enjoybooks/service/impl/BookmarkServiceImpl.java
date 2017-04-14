package com.lzjuhuenng.enjoybooks.service.impl;

import com.lzjuhuenng.enjoybooks.dao.BookmarkDao;
import com.lzjuhuenng.enjoybooks.pojo.Bookmark;
import com.lzjuhuenng.enjoybooks.service.BookmarkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2017/4/14.
 */
@Service("bookmarkService")
public class BookmarkServiceImpl implements  BookmarkService {

    @Autowired
    BookmarkDao bookmarkDao;

    public int insertBookmark(Bookmark bookmark) {

        bookmarkDao.insertBookmark(bookmark);

        return bookmark.getId();
    }

    public int deleteBookmarkByID(int id) {

       return bookmarkDao.deleteBookmarkByID(id);
    }
}
