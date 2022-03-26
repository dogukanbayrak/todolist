package com.dogukanbayrak.appcent.service;

import com.dogukanbayrak.appcent.Entity.User;

public class UserService {

    private String username;
    private String password;

    public UserService() {
    }



    public UserService(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() { return username;   }

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

