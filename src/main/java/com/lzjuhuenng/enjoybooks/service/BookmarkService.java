package com.lzjuhuenng.enjoybooks.service;

import com.lzjuhuenng.enjoybooks.pojo.Bookmark;

public interface BookmarkService {

    int insertBookmark(Bookmark bookmark);

    int deleteBookmarkByID(int id);
}
