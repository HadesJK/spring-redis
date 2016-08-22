package com.jql.spring.cache.redis;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

/**
 * Created by 金奇樑(hzjinqiliang)
 * 16/8/22 15:56
 */
@Service
public class StuService {

    @Cacheable(value = "stu")
    public void add(String name) {
        System.out.println(name);
        System.out.println("add stu in redis and db");
    }

    @Cacheable(value = "stu")
    public String get(String name) {
        System.out.println(name);
        System.out.println("this will not execute: get stu in redis and db");
        return "111";
    }
}