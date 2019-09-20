package com.lopezkristian.grin.controller;

public class Place {

    private String email;
    private String idScooter;

    public Place(String email, String idScooter) {
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
