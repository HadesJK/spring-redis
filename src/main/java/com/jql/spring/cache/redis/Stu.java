package com.jql.spring.cache.redis;

import java.io.Serializable;

/**
 * Created by 金奇樑(hzjinqiliang)
 * 16/8/22 15:54
 */
public class Stu implements Serializable {

    private Integer id;

    private String name;

    private Integer age;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Stu{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Stu(Integer id, String name, Integer age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
}
