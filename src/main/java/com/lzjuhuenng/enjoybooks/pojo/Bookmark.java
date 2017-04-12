package com.lzjuhuenng.enjoybooks.pojo;

/**
 * Created by Administrator on 2017/4/5.
 */
public class Bookmark {

    //书签的id
    private int id;
    //
    private int sheifBookId;
    //书签标题
    private String bookmarkTitle;
    //书签的跳转链接
    private String epubcfi;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBookmarkTitle() {
        return bookmarkTitle;
    }

    public void setBookmarkTitle(String bookmarkTitle) {
        this.bookmarkTitle = bookmarkTitle;
    }

    public String getEpubcfi() {
        return epubcfi;
    }

    public void setEpubcfi(String epubcfi) {
        this.epubcfi = epubcfi;
    }

    public int getSheifBookId() {
        return sheifBookId;
    }

    public void setSheifBookId(int sheifBookId) {
        this.sheifBookId = sheifBookId;
    }
}
