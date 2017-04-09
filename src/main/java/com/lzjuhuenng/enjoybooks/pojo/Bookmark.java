package com.lzjuhuenng.enjoybooks.pojo;

/**
 * Created by Administrator on 2017/4/5.
 */
public class Bookmark {

    //书签的id
    private int id;
    //书签对应的书籍的ID
    private int bookId;
    //用户ID
    private int accountId;
    //书签标题
    private String bookmarkTitle;
    //书签的跳转链接
    private String bookmarkCfi;

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

    public String getBookmarkCfi() {
        return bookmarkCfi;
    }

    public void setBookmarkCfi(String bookmarkCfi) {
        this.bookmarkCfi = bookmarkCfi;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }
}
