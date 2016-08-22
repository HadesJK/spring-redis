package com.jql.redis;

import org.springframework.cache.Cache;
import org.springframework.cache.support.SimpleValueWrapper;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;

/**
 * Created by 金奇樑(hzjinqiliang)
 * 16/8/22 21:27
 */
public class MyCache implements Cache {
    private String name;
    private Map<String, Account> store = new HashMap<>();

    public MyCache() {
    }

    public MyCache(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Object getNativeCache() {
        return store;
    }

    @Override
    public ValueWrapper get(Object key) {
        ValueWrapper result = null;
        Account thevalue = store.get(key);
        if (thevalue != null) {
            thevalue.setPassword("from mycache:" + name);
            result = new SimpleValueWrapper(thevalue);
        }
        return result;
    }

    @Override
    public <T> T get(Object key, Class<T> type) {
        throw new UnsupportedOperationException();
    }

    @Override
    public <T> T get(Object key, Callable<T> valueLoader) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void put(Object key, Object value) {
        Account thevalue = (Account) value;
        store.put((String) key, thevalue);
    }

    @Override
    public ValueWrapper putIfAbsent(Object key, Object value) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void evict(Object key) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void clear() {
        throw new UnsupportedOperationException();
    }
}