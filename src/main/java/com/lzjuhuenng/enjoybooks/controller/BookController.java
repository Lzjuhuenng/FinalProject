package com.lzjuhuenng.enjoybooks.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.lzjuhuenng.enjoybooks.pojo.Account;
import com.lzjuhuenng.enjoybooks.pojo.Book;
import com.lzjuhuenng.enjoybooks.service.BookService;
import com.lzjuhuenng.enjoybooks.util.base.SearchUtil;
import com.lzjuhuenng.enjoybooks.util.consts.ConstSessionName;
import com.lzjuhuenng.enjoybooks.util.page.PageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


import javax.servlet.http.HttpSession;
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
    @RequestMapping(value = "/getBooks/{typeId}/{pageIndex}/{searchText}", method = RequestMethod.GET)
    @ResponseBody
    public Map<String,Object> getBookList(@PathVariable int typeId ,@PathVariable int pageIndex ,@PathVariable String searchText) throws Exception{

        int totalRecords =0;
        List<Book> list = null;

        String search = SearchUtil.makeSearchText(searchText);
        int startRow = PageUtil.calcStartRow(pageIndex,pageSize);

        if(typeId==-1){
            totalRecords = bookService.selectCountWithSearch(search);

            list = bookService.selectByPageWithSearch(search,startRow ,pageSize);

        }else{
            totalRecords = bookService.selectCountWithTypeIdAndSearch(typeId,search);

            list = bookService.selectByPageWithTypeIdAndSearch(typeId,search,startRow ,pageSize);
        }

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
    @RequestMapping(value = "/getBookDetail/{bookId}", method = RequestMethod.GET)
    @ResponseBody
    public Book getBookDetails(@PathVariable int bookId,HttpSession session) throws Exception{

        System.out.println(session.getId()+"==========================");
        Account acc = (Account) session.getAttribute(ConstSessionName.UserInfo);
        System.out.println(acc.toString());
        return bookService.selectBookById(bookId);
    }



}
