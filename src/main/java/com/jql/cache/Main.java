package com.jql.cache;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.env.SystemEnvironmentPropertySource;

/**
 * Created by 金奇樑(hzjinqiliang)
 * 16/8/22 11:29
 */
public class Main {
//    public static void main(String[] args) {
//        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:cache/cache.xml");
//        AccountService s = context.getBean(AccountService.class);
//
//        System.out.print("first query...");
//        s.getAccountByName("somebody");
//        // 第二次查询，应该不查数据库，直接返回缓存的值
//        System.out.print("second query...");
//        s.getAccountByName("somebody");
//        System.out.println();
//    }


    public static void main(String[] args) throws InterruptedException {
        // 持久化,重启不丢失数据
        System.setProperty(net.sf.ehcache.CacheManager.ENABLE_SHUTDOWN_HOOK_PROPERTY,"true");

        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:cache/cache.xml");
        HelloService helloService = context.getBean(HelloService.class);

//        System.out.println(helloService.get());

        String msg = helloService.getMsg("10001");
        System.out.println(msg);
        msg = helloService.getMsg("10001");
        System.out.println(msg);


        msg = helloService.getMsg("10001");
        System.out.println(msg);
        helloService.updateMsg("10001");
        msg = helloService.getMsg("10001");
        System.out.println(msg);

        Thread.sleep(200);
        System.exit(1);

//        System.out.println(helloService.get("heihei"));
    }
}
