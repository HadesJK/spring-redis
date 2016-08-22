package com.jql.redis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.ListOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by 金奇樑(hzjinqiliang)
 * 16/8/11 14:43
 */
@Service
public class SpringRedis {

    @Autowired
    private RedisTemplate<String, String> template;

    @Resource(name = "redisTemplate")
    private ListOperations<String, Object> listOps;

    @Resource(name = "redisTemplate")
    private ValueOperations valueOps;

    @Resource(name = "redisTemplate")
    private HashOperations<String, String, String> hashOps;

}
