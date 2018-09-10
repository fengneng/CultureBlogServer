package com.zy.cultureblog.Entry;

public class Challenge {
    private String card_type;
    private String title;
    private String content;
    private int number;
    private String uri;

    public Challenge(String card_type, String title, String content, int number, String uri) {
        this.card_type = card_type;
        this.title = title;
        this.content = content;
        this.number = number;
        this.uri = uri;
    }

    public String getCard_type() {
        return card_type;
    }

    public void setCard_type(String card_type) {
        this.card_type = card_type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

}
