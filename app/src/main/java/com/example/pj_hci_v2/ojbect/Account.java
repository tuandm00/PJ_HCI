package com.example.pj_hci_v2.ojbect;

public class Account {
    private long id;
    private String studentCode;
    private String name;
    private String address;
    private String email;
    private long phoneNumber;
    private String description;
    private int img;
    public Account() {
    }

    public Account(String studentCode, String name, String address, String email, long phoneNumber, String description, int img) {
        this.studentCode = studentCode;
        this.name = name;
        this.address = address;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.description = description;
        this.img = img;
    }

    public Account(long id, String studentCode, String name, String address, String email, long phoneNumber, String description, int img) {
        this.id = id;
        this.studentCode = studentCode;
        this.name = name;
        this.address = address;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.description = description;
        this.img = img;
    }

    public String getStudentCode() {
        return studentCode;
    }

    public void setStudentCode(String studentCode) {
        this.studentCode = studentCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
