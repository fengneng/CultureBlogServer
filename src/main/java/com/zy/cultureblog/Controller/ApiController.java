package com.zy.cultureblog.Controller;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.zy.cultureblog.Entry.Challenge;
import com.zy.cultureblog.Entry.Data;
import com.zy.cultureblog.Entry.Response;
import com.zy.cultureblog.Utils.Util;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/api/v1")
public class ApiController {

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String index (int code) {
        Response response = new Response(code, "", new Data(null));

        return JSON.toJSONString(response);
    }

    @RequestMapping(value = "/hot_rcmd", method = RequestMethod.GET)
    public String hot (Integer idx) {
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

    @RequestMapping("/channel")
    public String channel () {
        String text = Util.readFile("classpath:dataFile/channel.json");
        return JSON.toJSONString(text);
    }

    @RequestMapping(value = "/channel_detail", method = RequestMethod.GET)
    public String channel_detail (Integer idx) {
        String text = Util.readFile("classpath:dataFile/channel_detail.json");
        return JSON.toJSONString(text);
    }

    @RequestMapping(value = "/topic_detail", method = RequestMethod.GET)
    public String topic_detail (Integer idx) {
        String text = Util.readFile("classpath:dataFile/topic_detail.json");
        return JSON.toJSONString(text);
    }

    @RequestMapping(value = "/article_detail", method = RequestMethod.GET)
    public String article_detail ( Integer idx) {
        String text = Util.readFile("classpath:dataFile/article_detail.json");
        return JSON.toJSONString(text);
    }

    @RequestMapping(value = "/attention", method = RequestMethod.GET)
    public String attention (Integer uid, Integer idx) {
        String text = Util.readFile("classpath:dataFile/attention.json");
        return JSON.toJSONString(text);
    }

    @RequestMapping(value = "/follows", method = RequestMethod.GET)
    public String notice (Integer uid) {
        String text = Util.readFile("classpath:dataFile/follows.json");
        return JSON.toJSONString(text);
    }

    @RequestMapping(value = "/photo_flow", method = RequestMethod.GET)
    public String photo_flow (Integer idx) {
        String text = Util.readFile("classpath:dataFile/photo_flow.json");
        return JSON.toJSONString(text);
    }

    @RequestMapping(value = "/message", method = RequestMethod.GET)
    public String message ( Integer uid, Integer idx) {
        String text = Util.readFile("classpath:dataFile/message.json");
        return JSON.toJSONString(text);
    }

    @RequestMapping(value = "/user_profile", method = RequestMethod.GET)
    public String user_profile (Integer uid) {
        String text = Util.readFile("classpath:dataFile/user_profile.json");
        return JSON.toJSONString(text);
    }
 }
