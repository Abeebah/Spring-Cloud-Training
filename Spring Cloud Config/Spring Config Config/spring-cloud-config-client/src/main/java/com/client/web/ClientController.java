package com.client.web;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class ClientController {
	@Value("${my.greeting: default value}")
	private String greetingMessage;
	
	@Value("${app.description}")
	private String desc;
	
	
	@Value("${my.list.values}")
	private List<String> ListValues;
	
	//# Treats the value as a spring expression Language . so it reads to value as Key pairs and value
	@Value("#{${db.Values}}")
	private Map<String, String> dbValues;
	
	@GetMapping("/greeting")
	public String greeting() {
		return greetingMessage+ "\n"+ desc+
				"\n"+ "Static List="+ListValues+
				"\n"+ "DB Values="+ dbValues;
	}
}
