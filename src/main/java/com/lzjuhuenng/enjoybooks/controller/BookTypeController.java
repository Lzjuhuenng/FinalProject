package com.lzjuhuenng.enjoybooks.controller;


import com.lzjuhuenng.enjoybooks.pojo.BookType;
import com.lzjuhuenng.enjoybooks.service.BookTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Administrator on 2017/4/9.
 */
@CrossOrigin(value = "*",maxAge = 3600)
@Controller
public class BookTypeController {

    @Autowired
    BookTypeService bookTypeService;

    @CrossOrigin(origins = "*", methods = RequestMethod.GET,maxAge = 3600)
    @RequestMapping(value = "/getBookTypes", method = RequestMethod.GET)
    @ResponseBody
    public List<BookType> getBookTypes() throws Exception{

        return bookTypeService.getAllBookType();
    }

}
