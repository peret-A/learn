package com.bdqn;

public class User {
    /**
     * 手机号码、身份中号码、密码三个数据之外，还有姓名、性别、专业、住址信息
     */
    private String utel;
    private String uid;
    private String upass;
    private String uname;
    private String ugender;
    private String udept;
    private String uadder;
    private BorBook[] borBooks;

    public BorBook[] getBorBooks() {
        return borBooks;
    }

    public void setBorBooks(BorBook[] borBooks) {
        this.borBooks = borBooks;
    }

    //权限 用于区分普通用户与管理员
    private int per;

    public String getUtel() {
        return utel;
    }

    public void setUtel(String utel) {
        this.utel = utel;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getUpass() {
        return upass;
    }

    public void setUpass(String upass) {
        this.upass = upass;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getUgender() {
        return ugender;
    }

    public void setUgender(String ugender) {
        this.ugender = ugender;
    }

    public String getUdept() {
        return udept;
    }

    public void setUdept(String udept) {
        this.udept = udept;
    }

    public String getUadder() {
        return uadder;
    }

    public void setUadder(String uadder) {
        this.uadder = uadder;
    }

    public int getPer() {
        return per;
    }

    public void setPer(int per) {
        this.per = per;
    }

    public User() {
    }

    public User(String utel, String uid, String upass, String uname, String ugender, String udept, String uadder, BorBook[] borBooks, int per) {
        this.utel = utel;
        this.uid = uid;
        this.upass = upass;
        this.uname = uname;
        this.ugender = ugender;
        this.udept = udept;
        this.uadder = uadder;
    }

    public User(String utel, String uid, String upass, int per) {
        this.utel = utel;
        this.uid = uid;
        this.upass = upass;
        this.per = per;
    }

    @Override
    public String toString() {
        return "用户{" +
                "用户电话='" + utel + '\'' +
                ", 用户身份证号码='" + uid + '\'' +
                ", 用户密码='" + upass + '\'' +
                ", 用户姓名='" + uname + '\'' +
                ", 用户性别='" + ugender + '\'' +
                ", 用户专业='" + udept + '\'' +
                ", 用户地址='" + uadder + '\'' +
                '}';
    }
}
