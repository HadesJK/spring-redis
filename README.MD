#spring redis

**这是一个spring整合redis的简单工程**

## 配置文件

```
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xmlns:p="http://www.springframework.org/schema/p"
       xmlns:context="http://www.springframework.org/schema/context"
       xsi:schemaLocation="http://www.springframework.org/schema/beans
       http://www.springframework.org/schema/beans/spring-beans.xsd
       http://www.springframework.org/schema/context
       http://www.springframework.org/schema/context/spring-context.xsd">

    <context:annotation-config/>

    <context:component-scan base-package="com.jql"/>

    <context:property-placeholder location="classpath*:redis/redis.properties"/>

    <bean id="jedisConnFactory"
          class="org.springframework.data.redis.connection.jedis.JedisConnectionFactory"
          p:hostName="${redis.host}"
          p:password="${redis.password}"
          p:port="${redis.port}"
          p:database="${redis.database}"
          p:usePool="true"/>

    <bean id="redisTemplate"
          class="org.springframework.data.redis.core.RedisTemplate"
          p:connectionFactory-ref="jedisConnFactory">
        <property name="keySerializer">
            <bean class="org.springframework.data.redis.serializer.StringRedisSerializer"/>
        </property>
        <property name="valueSerializer">
            <bean class="org.springframework.data.redis.serializer.StringRedisSerializer"/>
        </property>
        <property name="hashKeySerializer">
            <bean class="org.springframework.data.redis.serializer.StringRedisSerializer"/>
        </property>
        <property name="hashValueSerializer">
            <bean class="org.springframework.data.redis.serializer.StringRedisSerializer"/>
        </property>
    </bean>

</beans>
```

## 用法

**详细请看:**

1. http://docs.spring.io/spring-data/redis/docs/current/reference/html/
2. http://projects.spring.io/spring-data-redis/

**数据类型**



| Interface      |     Description |
| :--------      | :--------|
| ValueOperations | Redis string (or value) operations  |
| ListOperations  | Redis list operations  |
| SetOperations   | Redis set operations  |
| ZSetOperations  | Redis zset (or sorted set) operations  |
| HashOperations  | Redis hash operations  |
| HyperLogLogOperations  | Redis HyperLogLog operations like (pfadd, pfcount,…​)|

**java**

```
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
```