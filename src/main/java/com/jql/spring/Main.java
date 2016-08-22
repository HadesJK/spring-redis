package com.jql.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by 金奇樑(hzjinqiliang)
 * 16/8/15 11:41
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx =
                new AnnotationConfigApplicationContext(SpringAnnotation.class);
        HelloWorld helloWorld = ctx.getBean(HelloWorld.class);
        helloWorld.sayHello("Hello World!");
        helloWorld.sayHello();
    }
}
