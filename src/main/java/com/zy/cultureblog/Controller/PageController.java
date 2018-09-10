package com.zy.cultureblog.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {

    @RequestMapping("/")
    public String index () {
        return "redirect:index.html";
    }

    @RequestMapping("/index")
    public String index2 () {
        return "redirect:index.html";
    }
//
    @RequestMapping("/index.html")
    public String index3 () {
        return "index.html";
    }
}
