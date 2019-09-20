package com.lopezkristian.grin.controller;

public class Create {

    private String email;
    private String idScooter;

    public Create(String email, String idScooter) {
        this.email = email;
        this.idScooter = idScooter;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getIdScooter() {
        return idScooter;
    }

    public void setIdScooter(String idScooter) {
        this.idScooter = idScooter;
    }
}
