package com.lynas.model;

/**
 * Created by LynAs on 05-Mar-16
 */
public class People {
    private int id;
    private String name;

    public People(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public People() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
