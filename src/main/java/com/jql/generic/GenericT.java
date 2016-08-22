package com.jql.generic;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/**
 * Created by 金奇樑(hzjinqiliang)
 * 16/8/18 17:23
 */
public class GenericT<Apple> extends Abc<Apple> {
    public static void main(String[] args) {
        GenericT<Abc> g = new GenericT<>();
        Type[] types = g.getParameterizedTypes(g);
        System.out.println();

    }

    public static Type[] getParameterizedTypes(Object object) {
        Type superclassType = object.getClass().getGenericSuperclass();
        if (!ParameterizedType.class.isAssignableFrom(superclassType.getClass())) {
            return null;
        }
        return ((ParameterizedType)superclassType).getActualTypeArguments();
    }
}
