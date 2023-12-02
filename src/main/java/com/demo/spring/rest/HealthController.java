package com.demo.spring.rest;

import org.infinispan.client.hotrod.RemoteCache;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {

	@Autowired
	RemoteCache<String,String> remoteCache;


	@GetMapping("/health")
	public String index() {
		remoteCache.put("1", "1");
		return "Cache size is " + remoteCache.size();
	}

}
