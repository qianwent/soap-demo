package com.qwt.webservice.server.model;

/**
 * Created by Wentao Qian on 1/30/2018.
 */
public class User {
    private String ID;
    private String username;
    private String password;

    public User() {}

    public User(String ID, String username, String password) {
        this.ID = ID;
        this.username = username;
        this.password = password;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
