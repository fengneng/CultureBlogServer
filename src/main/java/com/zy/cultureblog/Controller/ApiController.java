package com.zy.cultureblog.Controller;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.zy.cultureblog.Entry.Challenge;
import com.zy.cultureblog.Entry.Data;
import com.zy.cultureblog.Entry.Response;
import com.zy.cultureblog.Utils.Util;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;

@RestController
public class ApiController {

    @RequestMapping("/api")
    public String index () {
        return "api v1";
    }

    @RequestMapping("home/hotrec")
    public String hot () {
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

        String text = Util.readFile("classpath:dataFile/hottopic.json");


        return text;
    }

    @RequestMapping("/home/attention")
    public String attention () {

        String text = Util.readFile("classpath:dataFile/attention.json");
        JSONObject jsonObject = JSON.parseObject(text);

        int code = jsonObject.getIntValue("code");
        String message = jsonObject.getString("message");
        JSONArray items = jsonObject.getJSONObject("data").getJSONArray("items");

        ArrayList arrayList = new ArrayList();
        for (Object item : items) {
            arrayList.add(item);
        }
        Data data = new Data(arrayList);

        Response response = new Response(code, message, data);

        return JSON.toJSONString(response);
    }

    @RequestMapping("/home/channel")
    public String channel () {
        String text = Util.readFile("classpath:dataFile/channel.json");
        return JSON.toJSONString(text);
    }

    @RequestMapping("/home/notice")
    public String notice () {
        String text = Util.readFile("classpath:dataFile/notice.json");
        return JSON.toJSONString(text);
    }

    @RequestMapping("/home/post_list")
    public String post_list () {
        String text = Util.readFile("classpath:dataFile/post_list.json");
        return JSON.toJSONString(text);
    }

    @RequestMapping("/home/discussion_detail")
    public String discussion_detail () {
        String text = Util.readFile("classpath:dataFile/discussion_detail_00932.json");
        return JSON.toJSONString(text);
    }
    @RequestMapping("/home/article_detail")
    public String article_detail () {
        String text = Util.readFile("classpath:dataFile/article_detail.json");
        return JSON.toJSONString(text);
    }
 }
