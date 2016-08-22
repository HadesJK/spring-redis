//package com.jql.spring.custom;
//
//import org.springframework.cache.Cache;
//import org.springframework.cache.CacheManager;
//
//import java.util.Collection;
//import java.util.HashMap;
//import java.util.concurrent.ConcurrentMap;
//
///**
// * Created by 金奇樑(hzjinqiliang)
// * 16/8/22 17:37
// */
//public class MyCacheManager implements CacheManager {
//    private Collection<? extends Cache> caches = new HashMap<>();
//
//    @Override
//    public Cache getCache(String name) {
//        return caches.get(name);
//    }
//
//    @Override
//    public Collection<String> getCacheNames() {
//        return caches.keySet();
//    }
//
//    public void setCaches(ConcurrentMap<String, Cache> caches) {
//        this.caches = caches;
//    }
//}
