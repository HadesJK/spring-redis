package com.jql.cache;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

/**
 * Created by 金奇樑(hzjinqiliang)
 * 16/8/22 14:18
 */
@Service
public class HelloService {

    @Cacheable(value = "dbCache", key = "'getMsg_' + #id")
    public String getMsg(String id) {
        System.out.println("call getMsg(id) by " + id);
        return "hello " + id;
    }

    @CacheEvict(value = "dbCache", key = "'getMsg_' + #id")
    public void updateMsg(String id) {
        System.out.println("updateMsg by id " + id);
    }

    @Cacheable(value = "dbCache", key = "getMsg_10001")
    public String get(String id) {
        System.out.println("@@@@call getMsg(id) by  10001@@@");
        return "@@@hello 10001@@@";
    }

}
