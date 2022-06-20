package com.example.pj_hci_v2;

public class Post {

    private int hinhUser;
    private String name;
    private String time;
    private String decription;
    private int hinhitem;
    private String nubLike;
    private String nubComment;
    private String nubShare;

    public Post(int hinhUser, String name, String time, String decription, int hinhitem, String nubLike, String nubComment, String nubShare) {
        this.hinhUser = hinhUser;
        this.name = name;
        this.time = time;
        this.decription = decription;
        this.hinhitem = hinhitem;
        this.nubLike = nubLike;
        this.nubComment = nubComment;
        this.nubShare = nubShare;
    }

    public int getHinhUser() {
        return hinhUser;
    }

    public void setHinhUser(int hinhUser) {
        this.hinhUser = hinhUser;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getDecription() {
        return decription;
    }

    public void setDecription(String decription) {
        this.decription = decription;
    }

    public int getHinhitem() {
        return hinhitem;
    }

    public void setHinhitem(int hinhitem) {
        this.hinhitem = hinhitem;
    }

    public String getNubLike() {
        return nubLike;
    }

    public void setNubLike(String nubLike) {
        this.nubLike = nubLike;
    }

    public String getNubComment() {
        return nubComment;
    }

    public void setNubComment(String nubComment) {
        this.nubComment = nubComment;
    }

    public String getNubShare() {
        return nubShare;
    }

    public void setNubShare(String nubShare) {
        this.nubShare = nubShare;
    }
}
