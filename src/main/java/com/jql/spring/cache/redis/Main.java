package com.jql.spring.cache.redis;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by 金奇樑(hzjinqiliang)
 * 16/8/22 15:44
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:cache/spring-redis-cache.xml");
        StuService stuService = context.getBean(StuService.class);
//        stuService.add("110");
//        stuService.add("110");
        String msg = stuService.get("110");
        System.out.println(msg);

        stuService.get("110");
        System.out.println(msg);

        stuService.get("110");
        System.out.println(msg);

        stuService.get("110");
        System.out.println(msg);

        stuService.get("110");
        System.out.println(msg);

        System.out.println("success");
    }
}
