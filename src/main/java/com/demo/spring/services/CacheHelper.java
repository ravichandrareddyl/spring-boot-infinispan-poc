package com.demo.spring.services;

import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.util.Properties;

import org.infinispan.client.hotrod.RemoteCacheManager;
import org.infinispan.client.hotrod.configuration.ConfigurationBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class CacheHelper {
    

    // RemoteCacheManager rcm;
    // @Value("${hotrod.properties}")
    // String propertiesFile;

    // public RemoteCacheManager getRemoteCacheManager() {
    //     if (rcm != null) {
    //         return rcm;
    //     }
    //     ConfigurationBuilder b = new ConfigurationBuilder();
        
    //     Properties p = new Properties();
    //     try (InputStream input = this.getClass().getClassLoader().getResourceAsStream(propertiesFile)) {

    //         //load a properties file from class path, inside static method
    //         p.load(input);
    //         b.withProperties(p);
    //         //b.addContextInitializers(new com.redhat.apps.client.rhdgspringboot.LibraryInitializerImpl());
        


    //     } catch (IOException ex) {
    //         ex.printStackTrace();
    //     }
    //     rcm = new RemoteCacheManager(b.build());
    //     return rcm;
    // }

    // private final RemoteCacheManager cacheManager;

    // @Autowired
    // public CacheHelper(RemoteCacheManager cacheManager) {
    //     this.cacheManager = cacheManager;
    // }


}
