package com.jql.annotation;

import java.lang.annotation.*;

/**
 * 水果名称
 * Created by 金奇樑(hzjinqiliang)
 * 16/8/16 14:53
 */

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface FruitName {
    String value() default "";

}
