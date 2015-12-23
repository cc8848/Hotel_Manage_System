package com.model;

/**
 * Created by stiles on 15/12/16.
 */
public class User implements java.io.Serializable {
    private String phone;//11位手机号
    private String nickname;//昵称
    private String name;//姓名
    private String password;//密码(可能没有)
    private String IDCard;//身份证号
    private boolean register;//是否注册

    public User() {}

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPhone() {
        return phone;
    }

    public String getNickname() {
        return nickname;
    }

    public boolean getRegister() {
        return register;
    }

    public void setRegister(boolean register) {
        this.register = register;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIDCard() {
        return IDCard;
    }

    public void setIDCard(String IDCard) {
        this.IDCard = IDCard;
    }
}
