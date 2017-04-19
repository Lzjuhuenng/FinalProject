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

        System.out.println(session.getId()+"==========================");
        if(null==acc){
            return this.ajaxFailureResponse("用户名或者密码错误");
        }
        if(!acc.getPassword().equals(account.getPassword())){
            return this.ajaxFailureResponse("用户名或者密码错误");
        }
        session.setAttribute(ConstSessionName.UserInfo , acc);
        return this.ajaxSuccessResponse();
    }
    @CrossOrigin (origins = "*", methods = RequestMethod.GET,maxAge = 3600)
    @RequestMapping(value = "/logout/{userId}", method = RequestMethod.GET)
    @ResponseBody
    public Map<String,Object> logout(@PathVariable String userId,HttpSession session) throws Exception{
        session.removeAttribute(ConstSessionName.UserInfo);
        return this.ajaxSuccessResponse();
    }

    @CrossOrigin (origins = "*", methods = RequestMethod.POST,maxAge = 3600)
    @RequestMapping(value = "/register", method = RequestMethod.POST)
    @ResponseBody
    public boolean register(@RequestBody Account account) throws Exception{
        try{
            System.out.println(account.toString());
            if(accountService.insert(account)>0){
                return true;
            }else{
                return false;
            }

        }catch(Exception e){
            return false;
        }
    }

    @CrossOrigin (origins = "*", methods = RequestMethod.GET,maxAge = 3600)
    @RequestMapping(value = "/isAccountExist/{account}", method = RequestMethod.GET)
    @ResponseBody
    public boolean isAccountExist(@PathVariable String account) throws Exception{

        return accountService.isAccountExist(account);
    }


    @CrossOrigin (origins = "*", methods = RequestMethod.GET,maxAge = 3600)
    @RequestMapping(value = "/isEmailExist/{email}", method = RequestMethod.GET)
    @ResponseBody
    public boolean isEmailExist(@PathVariable String email) throws Exception{

        return this.accountService.isEmailExist(email);
    }






}
