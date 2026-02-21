package com.springboot.actuator;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.SpringBootVersion;
import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.stereotype.Component;

@Component
@Endpoint(id="monitor-springversion")
public class SpringBootVersionActuator {
	@ReadOperation
	public Map<String,String>springVersion(){
		Map<String, String> response = new HashMap<>();
        response.put("springBootVersion", SpringBootVersion.getVersion());
        return response;
	}
}
