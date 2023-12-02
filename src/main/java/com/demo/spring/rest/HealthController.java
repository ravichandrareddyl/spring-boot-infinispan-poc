package com.demo.spring.rest;

import org.infinispan.client.hotrod.RemoteCache;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.spring.model.UserDetail;

@RestController
public class HealthController {

	@Autowired
	RemoteCache<String,UserDetail> remoteCache;


	@GetMapping("/health")
	public String index() {
		UserDetail d = new UserDetail();
		d.setName("demo");
		remoteCache.put("1", d);

		return ((UserDetail) remoteCache.get("1")).toString();
	}

}
