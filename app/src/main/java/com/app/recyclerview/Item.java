package com.app.recyclerview;

public class Item {
    int img;
    String title;
    String desc;

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Item(int img, String title, String desc) {
        this.img = img;
        this.title = title;
        this.desc = desc;
    }
}
