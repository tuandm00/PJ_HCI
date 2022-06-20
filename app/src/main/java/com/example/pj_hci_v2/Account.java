package com.example.pj_hci_v2;

public class Account {

        private String idUser;
        private int hinh;
        private String name;
        private String address;
        private String email;
        private String phone;


    public Account(String idUser, int hinh, String name, String address, String email, String phone) {
        this.idUser = idUser;
        this.hinh = hinh;
        this.name = name;
        this.address = address;
        this.email = email;
        this.phone = phone;
    }

    public String getIdUser() {
        return idUser;
    }

    public void setIdUser(String idUser) {
        this.idUser = idUser;
    }

    public int getHinh() {
        return hinh;
    }

    public void setHinh(int hinh) {
        this.hinh = hinh;
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
