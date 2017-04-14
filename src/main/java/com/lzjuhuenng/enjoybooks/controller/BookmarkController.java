package com.lzjuhuenng.enjoybooks.controller;


import com.lzjuhuenng.enjoybooks.pojo.Bookmark;
import com.lzjuhuenng.enjoybooks.service.BookmarkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;

/**
 * Created by Administrator on 2017/4/14.
 */
@CrossOrigin(value = "*",maxAge = 3600)
@Controller
public class BookmarkController {

    @Autowired
    BookmarkService bookmarkService;

    @CrossOrigin(origins = "*", methods = RequestMethod.POST,maxAge = 3600)
    @RequestMapping(value = "/addBookmark", method = RequestMethod.POST)
    @ResponseBody
    public int getBookDetails(@RequestBody  Bookmark bookmark, HttpSession session) throws Exception{

        return bookmarkService.insertBookmark(bookmark);
    }
}
