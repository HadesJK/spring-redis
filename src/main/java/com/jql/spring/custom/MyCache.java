package com.jql.spring.custom;

import com.jql.spring.cache.redis.Stu;
import org.springframework.cache.Cache;
import org.springframework.cache.support.SimpleValueWrapper;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/**
 * Created by 金奇樑(hzjinqiliang)
 * 16/8/22 17:40
 */
public class MyCache implements Cache {

    private final String name = "my-cache";

    private Map<Object, Stu> store = new HashMap<>();

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Object getNativeCache() {
        return store;
    }

    @Override
    public ValueWrapper get(Object key) {
        ValueWrapper result = null;
        Stu value = store.get(key);
        if (value != null) {
            // 所有从缓存中获取的值,设置name,用来标记这个值是从缓存中获取的
            value.setName("from my cache: " + name);
            result = new SimpleValueWrapper(value);
        }
        return result;
    }

    @Override
    public <T> T get(Object key, Class<T> type) {
        return null;
    }

    @Override
    public <T> T get(Object key, Callable<T> valueLoader) {
        return null;
    }

    @Override
    public void put(Object key, Object value) {
        Stu thevalue = (Stu) value;
        store.put(key, thevalue);
    }

    @Override
    public ValueWrapper putIfAbsent(Object key, Object value) {
        return null;
    }

    @Override
    public void evict(Object key) {
        store.remove(key);
    }

    @Override
    public void clear() {
        store.clear();
    }
}
