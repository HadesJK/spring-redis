package com.jql.annotation;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by 金奇樑(hzjinqiliang)
 * 16/8/16 15:27
 */
public class FruitNameProcess<T> implements InvocationHandler {
    final T accessObj;
    public FruitNameProcess(T accessObj) {
        this.accessObj = accessObj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        FruitName annotation = method.getAnnotation(FruitName.class); //通过反射API获取注解
        if (annotation != null) {
            String name = annotation.value();
        }
        return method.invoke(accessObj, args);
    }

}
