package com.example.pj_hci_v2.ojbect;

public class Item {
    private String type;
    private String brand;
    private String position;
    private String description;
    private String date;
    private boolean state;
    private int img;
    private long accountId;
    public Item() {
    }

    public Item(String type, String brand, String position, String description, String date, boolean state, int img, long accountId) {
        this.type = type;
        this.brand = brand;
        this.position = position;
        this.description = description;
        this.date = date;
        this.state = state;
        this.img = img;
        this.accountId = accountId;
    }

    public Item(String type, String brand, String position, String description, String date, boolean state, int img) {
        this.type = type;
        this.brand = brand;
        this.position = position;
        this.description = description;
        this.date = date;
        this.state = state;
        this.img = img;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public long getAccountId() {
        return accountId;
    }

    public void setAccountId(long accountId) {
        this.accountId = accountId;
    }
}
