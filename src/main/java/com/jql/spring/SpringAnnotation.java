package com.jql.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by 金奇樑(hzjinqiliang)
 * 16/8/15 11:37
 */
@Configuration
public class SpringAnnotation {
    @Bean
    public HelloWorld helloWorld() {
        return new HelloWorld();
    }
}
