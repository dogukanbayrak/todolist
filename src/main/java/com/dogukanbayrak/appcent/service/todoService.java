package com.dogukanbayrak.appcent.service;

public class todoService {

    private String content;


    public todoService() {
    }

    public todoService(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
