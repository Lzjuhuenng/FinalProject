package com.lzjuhuenng.enjoybooks.pojo;


public class Bookmark {

    //书签的id
    private int id;
    //
    private int shelfId;
    //书签标题
    private String title;
    //书签的跳转链接
    private String epubcfi;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getEpubcfi() {
        return epubcfi;
    }

    public void setEpubcfi(String epubcfi) {
        this.epubcfi = epubcfi;
    }

    public int getShelfId() {
        return shelfId;
    }

    public void setShelfId(int sheifId) {
        this.shelfId = sheifId;
    }
}
