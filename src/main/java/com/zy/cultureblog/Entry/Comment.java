package com.zy.cultureblog.Entry;

/*
* 回复
* */
public class Comment {
    private Long id;    //评论主键id
    private String content; //评论内容
    private Long topic_id;  //回复的主题id
    private Long parent_id; //评论的父id,为0代表是普通评论。指向某id时代表是它的楼中楼回复
    private Long user_id;   //评论人的id
    private Long to_user_id;    //被评论人id，用做消息通知；楼中楼会显示"XX回复YY:..."

    private Long time;
}
