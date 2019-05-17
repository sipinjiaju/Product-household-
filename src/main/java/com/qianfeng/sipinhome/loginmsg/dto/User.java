package com.qianfeng.sipinhome.loginmsg.dto;


public class User {

  private long userId;
  private String username;
  private String mail;
  private String phone;
  private String weichat;
  private String level;
  private String password;


  public long getUserId() {
    return userId;
  }

  public void setUserId(long userId) {
    this.userId = userId;
  }


  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }


  public String getMail() {
    return mail;
  }

  public void setMail(String mail) {
    this.mail = mail;
  }


  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }


  public String getWeichat() {
    return weichat;
  }

  public void setWeichat(String weichat) {
    this.weichat = weichat;
  }


  public String getLevel() {
    return level;
  }

  public void setLevel(String level) {
    this.level = level;
  }


  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

}
