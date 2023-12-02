package com.demo.spring.config;

import org.infinispan.client.hotrod.RemoteCache;
import org.infinispan.client.hotrod.RemoteCacheManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
@Configuration
public class RemoteCacheConfig {

    private final RemoteCacheManager cacheManager;

    @Autowired
    public RemoteCacheConfig(RemoteCacheManager cacheManager) {
        this.cacheManager = cacheManager;
    }

    @Bean
    public RemoteCache<String,String> remoteCache() {
        RemoteCache<String,String> remoteCache = this.cacheManager.administration().getOrCreateCache("demo", (String)null);

        return remoteCache;
    }

}
