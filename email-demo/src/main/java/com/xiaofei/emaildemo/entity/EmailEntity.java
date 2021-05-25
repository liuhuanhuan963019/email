package com.xiaofei.emaildemo.entity;

import java.io.Serializable;
import java.util.ArrayList;

public class EmailEntity implements Serializable {
    private static final long serialVersionUID = 1L;
    //邮箱服务器地址
    private String host;
    //主机端口
    private Integer port;
    //发送者的邮箱账号
    private String userName;
    //发送者的密码
    private String password;
    //发送者的邮箱地址
    private String fromAddress;
    //接收者的邮箱地址
    private ArrayList<String> toList;
    //设置邮件主题
    private String subject;
    //设置邮件内容
    private String context;
    //设置邮件类型
    private String contextType;
    //设置是否需要验证
    private String auth;

    public String getAuth() {
        return auth;
    }

    public void setAuth(String auth) {
        this.auth = auth;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFromAddress() {
        return fromAddress;
    }

    public void setFromAddress(String fromAddress) {
        this.fromAddress = fromAddress;
    }

    public ArrayList<String> getToList() {
        return toList;
    }

    public void setToList(ArrayList<String> toList) {
        this.toList = toList;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public String getContextType() {
        return contextType;
    }

    public void setContextType(String contextType) {
        this.contextType = contextType;
    }
}
