package com.example.externalization;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties("app")
public class AppConfig {

	private String name;
	private String messge;

	public String getName() {
		return name;
	}

	public void setName(String appname) {
		this.name = appname;
	}

	public String getMessge() {
		return messge;
	}

	public void setMessge(String messge) {
		this.messge = messge;
	}

}
