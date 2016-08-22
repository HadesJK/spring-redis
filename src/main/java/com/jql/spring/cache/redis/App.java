package com.jql.spring.cache.redis;

import com.jql.cache.HelloService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

/**
 * Created by 金奇樑(hzjinqiliang)
 * 16/8/22 17:06
 */
public class App {
    public static void main(String[] args) {
        boolean useJavaConfig  = false;
        ApplicationContext ctx = null;

        //Showing examples of both Xml and Java based configuration
        if (useJavaConfig ) {
            ctx = new AnnotationConfigApplicationContext(App.class);
        }
        else {
            ctx = new GenericXmlApplicationContext("classpath:cache/spring-redis-cache.xml");
        }

        StuService stuService = ctx.getBean(StuService.class);

        stuService.add("jql");
        stuService.add("jql");
        stuService.add("jql");
        stuService.add("jql");
        stuService.add("jql");

        System.out.println("Done.");
    }
}
