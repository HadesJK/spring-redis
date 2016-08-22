package com.jql.redis;

import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

/**
 * Created by 金奇樑(hzjinqiliang)
 * 16/8/22 21:34
 */
@Service
public class AccountService {

    @Cacheable(value = "accountCache")
    public Account getAccountByName(String userName) {
        return getFromDB(userName);
    }

    @CachePut(value = "accountCache", key = "#account.getName()")
    public Account updateAccount(Account account) {
        return updateDB(account);
    }

    private Account updateDB(Account account) {
        System.out.println("real updating db..." + account.getName());
        return account;
    }

    private Account getFromDB(String acctName) {
        System.out.println("real querying db..." + acctName);
        return new Account(acctName);
    }
}
