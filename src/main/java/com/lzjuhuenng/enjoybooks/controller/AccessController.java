package com.lzjuhuenng.enjoybooks.controller;

import com.lzjuhuenng.enjoybooks.pojo.Account;
import com.lzjuhuenng.enjoybooks.service.*;
import javax.servlet.http.HttpSession;
import java.util.Map;
import com.lzjuhuenng.enjoybooks.util.consts.ConstSessionName;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Administrator on 2017/4/4.
 */

@CrossOrigin(value = "*",maxAge = 3600)
@Controller
@RequestMapping("/access")
public class AccessController extends BaseController {

    @Autowired
    private AccountService accountService;

    @CrossOrigin (origins = "*", methods = RequestMethod.POST,maxAge = 3600)
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    @ResponseBody
    public Map<String,Object> login(@RequestBody Account account,HttpSession session) throws Exception{
        Account acc = accountService.findByAccount(account.getAccount());
        System.out.println("acc"+acc);
        System.out.println("account"+account);
        if(null==acc){
            return this.ajaxFailureResponse("用户名或者密码错误");
        }
        if(!acc.getPassword().equals(account.getPassword())){
            return this.ajaxFailureResponse("用户名或者密码错误");
        }
        session.setAttribute(ConstSessionName.UserInfo , acc);
        return this.ajaxSuccessResponse();
    }

    @RequestMapping(value = "/logout/{userId}", method = RequestMethod.GET)
    @ResponseBody
    public Map<String,Object> logout(@PathVariable String userId,HttpSession session) throws Exception{
        session.removeAttribute(ConstSessionName.UserInfo);
        return this.ajaxSuccessResponse();
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    @ResponseBody
    public Map<String,Object> register(@RequestBody Account account) throws Exception{
        if(this.accountService.createAccount(account)){
            return this.ajaxSuccessResponse();
        }
        return this.ajaxFailureResponse();
    }

}
