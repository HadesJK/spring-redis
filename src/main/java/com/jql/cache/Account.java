package com.jql.cache;

/**
 * Created by 金奇樑(hzjinqiliang)
 * 16/8/22 11:25
 */
public class Account {
    private int id;
    private String name;

    public Account(String name) {
        this.name = name;
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
