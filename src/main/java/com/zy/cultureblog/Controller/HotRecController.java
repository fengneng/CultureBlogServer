package com.zy.cultureblog.Controller;


import com.alibaba.fastjson.JSON;
import com.zy.cultureblog.Entry.Challenge;
import com.zy.cultureblog.Entry.Data;
import com.zy.cultureblog.Entry.Response;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;

@RestController
public class HotRecController {
    @RequestMapping("home/hotrec")
    public String index () {
        Response response = new Response();
        response.setCode(0);
        response.setMessage("");

        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 10; i++) {
            Challenge challenge = new Challenge("asd", "sss", "content", i, "CD/");
            arrayList.add(challenge);
        }
        Data data = new Data(arrayList);
        response.setData(data);

        String string = JSON.toJSONString(response);

        return "hello world!" + string;
    }
 }
