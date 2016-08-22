package com.jql.redis;

import org.springframework.cache.support.AbstractCacheManager;

import java.util.Collection;

/**
 * Created by 金奇樑(hzjinqiliang)
 * 16/8/22 21:25
 */
public class MyCacheManager extends AbstractCacheManager {
    private Collection<? extends MyCache> caches;

    public void setCaches(Collection<? extends MyCache> caches) {
        this.caches = caches;
    }

    @Override
    protected Collection<? extends MyCache> loadCaches() {
        return this.caches;
    }

}
