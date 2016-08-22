package com.jql.redis;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by 金奇樑(hzjinqiliang)
 * 16/8/22 21:36
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("redis/spring-redis-cache-custom.xml");

        AccountService s = context.getBean(AccountService.class);
        MyCacheManager myCacheManager = context.getBean(MyCacheManager.class);

        Account account = s.getAccountByName("someone");
        System.out.println("passwd=" + account.getPassword());

        account = s.getAccountByName("someone");
        System.out.println("passwd=" + account.getPassword());

        account = s.getAccountByName("someone");
        System.out.println("passwd=" + account.getPassword());

        account = s.getAccountByName("someone");
        System.out.println("passwd=" + account.getPassword());
    }

}
