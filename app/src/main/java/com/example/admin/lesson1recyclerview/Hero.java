package com.example.admin.lesson1recyclerview;

public class Hero {
    private String mName;
    private int mPicture;

    public Hero(String name, int picture) {
        mName = name;
        mPicture = picture;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public int getPicture() {
        return mPicture;
    }

    public void setPicture(int picture) {
        mPicture = picture;
    }
}
