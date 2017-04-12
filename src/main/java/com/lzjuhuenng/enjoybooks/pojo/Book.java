package com.lzjuhuenng.enjoybooks.pojo;

import java.util.List;

/**
 * Created by Administrator on 2017/4/5.
 */
public class Book {

    //图书ID
    private int id;
    //图书名称
    private String bookName;
    //图书作者
    private String bookAuthor;
    //图书种类
    private BookType bookType;
    //图书封面地址
    private String coverURL;
    //图书出版日期
    private String bookDate;
    //图书简介
    private String bookBrief;
    //图书的路径
    private String bookPath;
    //图书的书签的集合
    private List<Bookmark> bookmarkList;
    //图书的上次阅读状态
    private String lastRead;
    //最后一次阅读的时间
    private String lastReadTime;
    //用户Id
    private int accountId;
    //图书的状态
    private int state;

    private int shelfId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public BookType getBookType() {
        return bookType;
    }

    public void setBookType(BookType bookType) {
        this.bookType = bookType;
    }

    public String getCoverURL() {
        return coverURL;
    }

    public void setCoverURL(String coverURL) {
        this.coverURL = coverURL;
    }

    public String getBookDate() {
        return bookDate;
    }

    public void setBookDate(String bookDate) {
        this.bookDate = bookDate;
    }

    public String getBookBrief() {
        return bookBrief;
    }

    public void setBookBrief(String bookBrief) {
        this.bookBrief = bookBrief;
    }

    public String getBookPath() {
        return bookPath;
    }

    public void setBookPath(String bookPath) {
        this.bookPath = bookPath;
    }

    public List<Bookmark> getBookmarkList() {
        return bookmarkList;
    }

    public void setBookmarkList(List<Bookmark> bookmarkList) {
        this.bookmarkList = bookmarkList;
    }

    public String getLastRead() {
        return lastRead;
    }

    public void setLastRead(String lastRead) {
        this.lastRead = lastRead;
    }

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public String getLastReadTime() {
        return lastReadTime;
    }

    public void setLastReadTime(String lastReadTime) {
        this.lastReadTime = lastReadTime;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public int getShelfId() {
        return shelfId;
    }

    public void setShelfId(int shelfId) {
        this.shelfId = shelfId;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", bookName='" + bookName + '\'' +
                ", bookAuthor='" + bookAuthor + '\'' +
                ", bookType=" + bookType +
                ", coverURL='" + coverURL + '\'' +
                ", bookDate='" + bookDate + '\'' +
                ", bookBrief='" + bookBrief + '\'' +
                ", bookPath='" + bookPath + '\'' +
                ", bookmarkList=" + bookmarkList +
                ", lastRead='" + lastRead + '\'' +
                ", lastReadTime='" + lastReadTime + '\'' +
                ", accountId=" + accountId +
                ", state=" + state +
                '}';
    }
}
