package com.lzjuhuenng.enjoybooks.util.base;

/**
 * Created by Administrator on 2017/4/9.
 */
public class SearchUtil
{
    public static String makeSearchText(String search){
        if(search.equals("null")){
            return "%%";
        }
        search = search.trim();
        StringBuilder sea = new StringBuilder();
        sea.append("%");
       for(int i = 0;i<search.length();i++){
           sea.append(search.charAt(i));
           sea.append("%");
       }
       System.out.println(sea);

        return sea.toString();
    }
}
