package com.xiaoxin.create.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Xiaozq on 2020/7/26 19:21
 */
@Controller
public class Pagelocation {

    @RequestMapping("/")
    public String index(){
        return "index";
    }


}
