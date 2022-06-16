package com.example.kjj.models;

class UserInfo{
    private static User userSingelton;

    private UserInfo() {}
    private static final UserInfo instance = new UserInfo();
    public static User getInstance(){
        return userSingelton;
    }
    private User info;
    void getInfo(){}
    void setInfo(){}
}