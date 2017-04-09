package com.lzjuhuenng.enjoybooks.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.lzjuhuenng.enjoybooks.pojo.Book;
import com.lzjuhuenng.enjoybooks.service.BookService;
import com.lzjuhuenng.enjoybooks.util.page.PageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2017/4/5.
 */
@CrossOrigin(value = "*",maxAge = 3600)
@Controller
public class BookController extends BaseController {

    private final static int pageSize = 24;

    private final static ObjectMapper objectMapper = new ObjectMapper();

    @Autowired
    private BookService bookService;

    @CrossOrigin(origins = "*", methods = RequestMethod.GET,maxAge = 3600)
    @RequestMapping(value = "/getBooks/{pageIndex}", method = RequestMethod.GET)
    @ResponseBody
    public Map<String,Object> getBookList(@PathVariable int pageIndex) throws Exception{

        int totalRecords = bookService.selectCount();
        int startRow = PageUtil.calcStartRow(pageIndex,pageSize);

        List<Book> list = bookService.selectByPage(startRow ,pageSize);
        int totalPages = PageUtil.calcPages(totalRecords,pageSize);

        Map<String, Object> map = new HashMap<String,Object>();
        map.put("totalRecords", totalRecords);
        map.put("totalPages", totalPages);
        map.put("pageSize", pageSize);
        map.put("currentPage", pageIndex);
        map.put("list", list);
        return map;
    }

    @CrossOrigin(origins = "*", methods = RequestMethod.GET,maxAge = 3600)
    @RequestMapping(value = "/getTypeBooks/{typeId}/{pageIndex}", method = RequestMethod.GET)
    @ResponseBody
    public Map<String,Object> getTypeBookList(@PathVariable int typeId ,@PathVariable int pageIndex) throws Exception{

        int totalRecords = bookService.selectCount();
        int startRow = PageUtil.calcStartRow(pageIndex,pageSize);

        List<Book> list = bookService.SelectTypeBook(typeId ,startRow ,pageSize);
        int totalPages = PageUtil.calcPages(totalRecords,pageSize);

        Map<String, Object> map = new HashMap<String,Object>();
        map.put("totalRecords", totalRecords);
        map.put("totalPages", totalPages);
        map.put("pageSize", pageSize);
        map.put("currentPage", pageIndex);
        map.put("list", list);
        return map;
    }

}
