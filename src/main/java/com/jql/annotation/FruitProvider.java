package com.jql.annotation;

import java.lang.annotation.*;

/**
 * 水果供应商
 * Created by 金奇樑(hzjinqiliang)
 * 16/8/16 15:07
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface FruitProvider {
    int id() default -1;
    String name() default "";
    String address() default "";
}
