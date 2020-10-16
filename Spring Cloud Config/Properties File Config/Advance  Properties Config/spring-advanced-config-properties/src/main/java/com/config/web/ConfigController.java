package com.config.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.config.data.DbSetting;

@RestController
public class ConfigController {

	
	@Autowired
	DbSetting dbSetting;
	
	@GetMapping("/connection")
	public String greeting() {
		return "Connection Url: "+  dbSetting.getConnectionUrl()+
				"\n"+ "Host: "+dbSetting.getHost()+
				"\n"+ "Port: "+ dbSetting.getPort();
	}
}
