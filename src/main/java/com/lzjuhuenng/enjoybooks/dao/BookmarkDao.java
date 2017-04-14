package com.lzjuhuenng.enjoybooks.dao;

import com.lzjuhuenng.enjoybooks.pojo.Bookmark;

import java.util.List;

/**
 * Created by Administrator on 2017/4/14.
 */
public interface BookmarkDao {

    int insertBookmark(Bookmark bookmark);

    int deleteBookmarkByID(int id);

    List<Bookmark> selectBookmarkByShelfId(int shelfId);
}
