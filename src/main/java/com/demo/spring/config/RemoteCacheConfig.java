package com.demo.spring.config;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.infinispan.client.hotrod.RemoteCache;
import org.infinispan.client.hotrod.RemoteCacheManager;
import org.infinispan.client.hotrod.configuration.ConfigurationBuilder;
import org.infinispan.commons.marshall.JavaSerializationMarshaller;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import com.demo.spring.model.UserDetail;

@Component
@Configuration
public class RemoteCacheConfig {

    // private final RemoteCacheManager cacheManager;

    // @Autowired
    // public RemoteCacheConfig(RemoteCacheManager cacheManager) {
    //     this.cacheManager = cacheManager;
    // }

    @Value("${hotrod.properties}")
    String propertiesFile;

    @Bean
    public RemoteCache<String,UserDetail> remoteCache() {

        ConfigurationBuilder b = new ConfigurationBuilder();
        
        Properties p = new Properties();
        try (InputStream input = this.getClass().getClassLoader().getResourceAsStream(propertiesFile)) {

            //load a properties file from class path, inside static method
            p.load(input);
            b.withProperties(p);
            b.marshaller(new JavaSerializationMarshaller()).addJavaSerialAllowList("com.demo.spring.model.UserDetail");
            // b.addContextInitializers(new LibraryInitializerImpl());
        


        } catch (IOException ex) {
            ex.printStackTrace();
        }
        RemoteCacheManager rcm = new RemoteCacheManager(b.build());
    //     return rcm;
        RemoteCache<String,UserDetail> remoteCache = rcm.administration().getOrCreateCache("demo", (String)null);

        return remoteCache;
    }

}
