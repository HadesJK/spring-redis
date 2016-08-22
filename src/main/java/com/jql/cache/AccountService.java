package com.jql.cache;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

/**
 * Created by 金奇樑(hzjinqiliang)
 * 16/8/22 11:22
 */

@Service
public class AccountService {

    @Cacheable(value = "accountCache")// 使用了一个缓存名叫 accountCache
    public Account getAccountByName(String userName) {
        // 方法内部实现不考虑缓存逻辑，直接实现业务
        System.out.println("real query account." + userName);
        return getFromDB(userName);
    }

    private Account getFromDB(String acctName) {
        System.out.println("real querying db..." + acctName);
        return new Account(acctName);
    }
}