package com.lzjuhuenng.enjoybooks.pojo;

/**
 * Created by Administrator on 2017/4/5.
 */
public class BookType {

    //图书种类id
    private int id;
    //图书种类
    private String bookType;
    //图书种类状态
    private  int state;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBookType() {
        return bookType;
    }

    public void setBookType(String bookType) {
        this.bookType = bookType;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "BookType{" +
                "id=" + id +
                ", bookType='" + bookType + '\'' +
                ", state=" + state +
                '}';
    }
}
