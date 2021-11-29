package com.example.demo.bean;

public class UserBean {
    private int id;
    private String info;
    public UserBean(){};
    public void setId(int id) {this.id = id; }

    public int getId() {
        return id;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
