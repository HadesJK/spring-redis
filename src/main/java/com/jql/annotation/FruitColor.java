package com.jql.annotation;

import java.lang.annotation.*;

/**
 * 水果颜色
 * Created by 金奇樑(hzjinqiliang)
 * 16/8/16 14:57
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface FruitColor {
    enum Color {
        BLUE, RED, GREEN
    }
    Color fruitColor() default Color.GREEN;
}
