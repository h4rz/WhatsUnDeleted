package com.example.h4rz.whatsundeleted;

public class MsgInfo
{
    private String date, name, msg;

    public MsgInfo() {

    }

    public MsgInfo(String name, String msg, String date) {
        this.date = date;
        this.name = name;
        this.msg = msg;
    }

    public String getDate() {
        return date;
    }

    public String getMsg() {
        return msg;
    }

    public String getName() {
        return name;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

}
