package com.sliit;

abstract class user {
    protected String name;
    protected String email;


    public user(String name, String email) {
        this.name = name;
        this.email = email;
    }

    abstract void printDetails();
}
