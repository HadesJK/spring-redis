package com.jql.spring.custom;

import com.jql.spring.cache.redis.StuService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by 金奇樑(hzjinqiliang)
 * 16/8/22 19:00
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:cache/spring-redis-cache-custom.xml");// 加载 spring 配置文件

        StuService stuService = context.getBean(StuService.class);
        stuService.get("xbbaa");
        stuService.get("xbbaa");
        stuService.get("xbbaa");
        stuService.get("xbbaa");
        stuService.get("xbbaa");
        stuService.get("xbbaa");

    }

}
