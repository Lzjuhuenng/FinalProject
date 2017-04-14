package com.lzjuhuenng.enjoybooks.service;

import com.lzjuhuenng.enjoybooks.pojo.Bookmark;

public interface BookmarkService {

    int insertBookmark(Bookmark bookmark);

    void deleteBookmarkByID(int id);
}
