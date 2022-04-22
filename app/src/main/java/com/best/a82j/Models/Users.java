package com.best.a82j.Models;

public class Users{
    String name;
    String id;

    public Users(String name, String id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Users{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}
